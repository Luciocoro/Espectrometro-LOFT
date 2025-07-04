package com.example.android.camera2.basic.fragments

import android.os.Parcel
import android.os.Parcelable
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.hardware.Camera.Parameters.FOCUS_MODE_FIXED
import android.hardware.camera2.*
import android.media.Image
import android.media.ImageReader
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.view.*
import androidx.core.graphics.drawable.toDrawable
import androidx.core.graphics.rotationMatrix
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import androidx.navigation.Navigation.findNavController
import com.example.android.camera.utils.AutoFitSurfaceView
import com.example.android.camera.utils.OrientationLiveData
import com.example.android.camera.utils.computeExifOrientation
import com.example.android.camera.utils.getPreviewOutputSize
import com.example.android.camera2.basic.CameraActivity
import com.example.android.camera2.basic.R
import com.example.calibrarlongituddeonda.Autorotar
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.TimeoutException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine
import kotlin.math.*
import kotlin.properties.Delegates
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraCharacteristics.*
import android.net.Uri
import android.text.Layout
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.FileProvider
import androidx.core.graphics.drawable.toAdaptiveIcon
import androidx.core.graphics.red
import androidx.core.view.isVisible
//import kotlinx.android.synthetic.main.absorbancia_calib.*
//import kotlinx.android.synthetic.main.fragment_camera.capture_button
//import kotlinx.android.synthetic.main.fragment_medir_absorbancia_test.*
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import java.io.*
import java.lang.Math.pow
import java.lang.Runnable
import java.nio.ByteBuffer
import androidx.navigation.ui.navigateUp

class MedirAbsorbanciaTest : Fragment() {

    /** AndroidX navigation arguments */
    private val args: MedirAbsorbanciaTestArgs by navArgs()
    private lateinit var canvasParaEditar: Canvas //para enchular los bitmaps hay que hacer esto
    private lateinit var poneleColor: Paint //para ponerle colores
    private lateinit var  myBitmap: Bitmap
    private lateinit var  prueba: Bitmap
    private var n by Delegates.notNull<Int>()
    private var m by Delegates.notNull<Int>()
    private var activarBotonContinuar : Boolean = false

    private val listaConMetrica = mutableListOf<Float>()
    lateinit var listaFinalIntensidadesRed : MutableList<Int>
    lateinit var listaFinalIntensidadesGreen : MutableList<Int>
    lateinit var listaFinalIntensidadesBlue : MutableList<Int>

    /** Host's navigation controller */
    private val navController: NavController by lazy {
        Navigation.findNavController(requireActivity(), R.id.fragment_container)
    }

    /** Detects, characterizes, and connects to a CameraDevice (used for all camera operations) */
    private val cameraManager: CameraManager by lazy {
        val context = requireContext().applicationContext
        context.getSystemService(Context.CAMERA_SERVICE) as CameraManager
    }

    /** [CameraCharacteristics] corresponding to the provided Camera ID */
    private val characteristics: CameraCharacteristics by lazy {
        cameraManager.getCameraCharacteristics(args.cameraId)
    }

    /** Readers used as buffers for camera still shots */
    private lateinit var imageReader: ImageReader

    /** [HandlerThread] where all camera operations run */
    private val cameraThread = HandlerThread("CameraThread").apply { start() }

    /** [Handler] corresponding to [cameraThread] */
    private val cameraHandler = Handler(cameraThread.looper)

    /** Performs recording animation of flashing screen */
    private val animationTask: Runnable by lazy {
        Runnable {
            // Flash white animation
            overlay.background = Color.argb(150, 255, 255, 255).toDrawable()
            // Wait for ANIMATION_FAST_MILLIS
            overlay.postDelayed({
                // Remove white flash animation
                overlay.background = null
            }, CameraActivity.ANIMATION_FAST_MILLIS)
        }
    }

    /** [HandlerThread] where all buffer reading operations run */
    private val imageReaderThread = HandlerThread("imageReaderThread").apply { start() }

    /** [Handler] corresponding to [imageReaderThread] */
    private val imageReaderHandler = Handler(imageReaderThread.looper)

    /** Where the camera preview is displayed */
    private lateinit var viewFinder: AutoFitSurfaceView

    /** Overlay on top of the camera preview */
    private lateinit var overlay: View

    /** The [CameraDevice] that will be opened in this fragment */
    private lateinit var camera: CameraDevice

    /** Internal reference to the ongoing [CameraCaptureSession] configured with our parameters */
    private lateinit var picturesSession: CameraCaptureSession
    private lateinit var previewSession: CameraCaptureSession

    /** Live data listener for changes in the device orientation relative to the camera */
    private lateinit var relativeOrientation: OrientationLiveData

    private lateinit var captureRequestStillCapture: CaptureRequest.Builder

    private lateinit var captureRequestPreview: CaptureRequest.Builder

    lateinit var buffer : ByteBuffer
    lateinit var bytes : ByteArray

    private var progreso : Int = 0
    private var mostrarProgreso : Boolean = false
    private val testMode = false

    private var fotoNro = 0 //Indice para guardar fotos
    private var grisesSinMuestra = mutableListOf<MutableList<Float>>()
    private var grisesConMuestra = mutableListOf<MutableList<Float>>()
    private var grisLoopActual = mutableListOf<Float>()

    private var blueOrder1 = mutableListOf<Float>()
    private lateinit var blueOrder1IndexList : IntArray
    private var blueOrder2 = mutableListOf<Float>()

    private var redOrder1 = mutableListOf<Float>()
    private lateinit var redOrder1IndexList : IntArray
    private var redOrder2 = mutableListOf<Float>()


    private var greenOrder1 = mutableListOf<Float>()
    private lateinit var greenOrder1IndexList : IntArray
    private var greenOrder2 = mutableListOf<Float>()


    private var listaIndices = listOf<Int>()

    private var posicionEnXOrdenCero by Delegates.notNull<Int>()

    private var blueX1 : Int = 0

    private var modoMonocromatico = false

    private var previewExposureTime by Delegates.notNull<Long>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_medir_absorbancia_test, container, false)

    @SuppressLint("MissingPermission")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val exposureTime: Long = args.exposureTime
        val numberOfPictures: Int = args.numberOfPictures
        val sensitivity: Int = args.sensitivity
        val focalDistance: Float = args.focalDistance // Modificación 06/05/24


        /** --------- Interface elements -----------**/
        super.onViewCreated(view, savedInstanceState)
        overlay = view.findViewById(R.id.overlay)
        viewFinder = view.findViewById(R.id.view_finder)
        var botonContinuar : ImageButton = view.findViewById(R.id.botonContinuar)
        val barraProgreso : ProgressBar = view.findViewById(R.id.progressBar)
        barraProgreso.isVisible = false
        val textoProgreso : TextView = view.findViewById(R.id.textoProgreso)
        textoProgreso.isVisible=false
        val captureButton : ImageButton = view.findViewById(R.id.capture_button)
        /**--------------------------------------**/


        /** --------- Set preview size -----------**/
        val previewSize = getPreviewOutputSize(viewFinder.display, characteristics, SurfaceHolder::class.java)
        viewFinder.setAspectRatio(previewSize.width, previewSize.height)
        /**--------------------------------------**/

        /** --------- Set layout orientation -----------**/
//        val layoutmedirabstest : View = view.findViewById(R.id.layoutmedirabstest)
//        relativeOrientation = OrientationLiveData(requireContext(), characteristics).apply {
//            observe(viewLifecycleOwner, Observer {
//                    orientation -> layoutmedirabstest.rotation = orientationFunction(orientation).toFloat()
//            })
//        }
        /**-------------Open camera and first preview session-------------**/
        //var previewExposureTime = 12*1e6.toLong()
        previewExposureTime = exposureTime //tmax
        openDevice(previewExposureTime,sensitivity, focalDistance) // Modificación 06/05/24

        /** --------- Botones -----------**/
        botonContinuar.setOnClickListener {
            if (activarBotonContinuar) {
                val grisesSinMuestraMatrix = FloatMatrix(grisesSinMuestra)
                val grisesConMuestraMatrix = FloatMatrix(grisesConMuestra)
                Navigation.run {
                    findNavController(requireActivity(), R.id.fragment_container).navigate(
                                MedirAbsorbanciaTestDirections.actionMedirAbsorbanciaTestToCaptura(
                                    prueba,
                                    args.cameraId,args.pixelFormat,
                                    blueOrder1.toFloatArray(),
                                    redOrder1.toFloatArray(),
                                    greenOrder1.toFloatArray(),
                                    blueOrder2.toFloatArray(),
                                    redOrder2.toFloatArray(),
                                    greenOrder2.toFloatArray(),
                                    listaConMetrica.toFloatArray(),
                                    posicionEnXOrdenCero,
                                    blueX1,
                                    grisesSinMuestraMatrix,
                                    grisesConMuestraMatrix,
                                    args.numberOfPictures,args.exposureTime,args.sensitivity,
                                    args.focalDistance
                                )
                            )
                }
            } else {
                Toast.makeText(activity, "Tome las fotos primero", Toast.LENGTH_SHORT).show()
            }
        }
//        botonContinuar.setOnClickListener {
//            if (activarBotonContinuar) {
//                Navigation.findNavController(requireActivity(), R.id.fragment_container).navigate(
//                    MedirAbsorbanciaTestDirections.actionMedirAbsorbanciaTestToCaptura(
//                        prueba,args.cameraId,blueOrder1.toFloatArray(),
//                        redOrder1.toFloatArray(), greenOrder1.toFloatArray(),
//                            blueOrder2.toFloatArray(), redOrder2.toFloatArray(),
//                            greenOrder2.toFloatArray(),listaConMetrica.toFloatArray(),
//                            posicionEnXOrdenCero,blueX1
//                    )
//                )
//            }
//            else {
//                Toast.makeText(activity,"Tome las fotos primero",Toast.LENGTH_SHORT).show()
//            }
//        }

        captureButton.setOnClickListener {
                script(barraProgreso,textoProgreso,captureButton,exposureTime,numberOfPictures,sensitivity,focalDistance) // Modificación 06/05/24
        }

    }
    // Modificación 06/05/24 :
    private fun script(barraProgreso:ProgressBar,textoProgreso:TextView,captureButton : ImageButton,exposureTime: Long,numberOfPictures: Int,sensitivity: Int, focalDistance: Float) = lifecycleScope.launch(Dispatchers.IO){

        withContext (Dispatchers.Main) {
            captureButton.isEnabled = false
            barraProgreso.isVisible = true
            barraProgreso.isIndeterminate = true
            textoProgreso.isVisible = true
        }

        val tmax = characteristics.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)?.upper ?: 0
        val tmin = characteristics.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE)?.lower ?: 0
        val dimensions = characteristics.get(SCALER_STREAM_CONFIGURATION_MAP)!!.getOutputSizes(args.pixelFormat)
        val h = dimensions[0].height
        val w = dimensions[0].width

        var autorotar : Autorotar
        var m : DoubleArray = DoubleArray(0)
        var listaMaximosX : MutableList<Double> = MutableList<Double>(0,{i: Int-> 0.0})
        var listaMaximosY : MutableList<Double> = MutableList<Double>(0,{i: Int-> 0.0})
        var tita = 0f
        var titaRad : Double


        // Modificación 06/05/24 :
        val focalDistanceCm: Float = 1f/focalDistance*100f //Paso el valor en cm al que lee el programa
        //
        var listaXRectaAjuste = mutableListOf<Int>()
        val listaYRectaAjuste = mutableListOf<Int>()

        //val radioPromedios = 5f*h.toFloat()*w.toFloat()/12e6f
        val radioPromedios = 0


        /**--------------------------------------------------------------------------**/
        /** Encontrando la recta      **/
        /**--------------------------------------------------------------------------**/

        withContext(Dispatchers.Main){
            textoProgreso.text="Detectando recta"
        }

        imageReader = ImageReader.newInstance(w, h, args.pixelFormat, 1)

        previewSession.close()
        delay(500L)
        makePreviewSession(tmax,sensitivity,focalDistance) // Modificación 06/05/24
        delay(500L)
        previewSession.close()
        delay(500L)
        picturesSession = createCaptureSession(camera, listOf(imageReader.surface), cameraHandler)
        takePhoto(tmax,sensitivity,focalDistanceCm,picturesSession).use{ result ->  // Modificación 06/05/24
            buffer = result.image.planes[0].buffer
            bytes = ByteArray(buffer.remaining()).apply {buffer.get(this)}
            myBitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
            result.image.close()
            picturesSession.close()
            makePreviewSession(tmax,sensitivity,focalDistance) // Modificación 06/05/24

            if (testMode==true) {
                m = doubleArrayOf((h/2f).toDouble(),0.toDouble())
            }
            autorotar = Autorotar(myBitmap)

            try
            {
                autorotar.encontrarRecta()
                m = autorotar.m!!
                listaMaximosX = autorotar.listaMaximosX!!
                listaMaximosY = autorotar.listaMaximosY!!
                posicionEnXOrdenCero = autorotar.posicionEnXOrdenCero?: 0
                tita = autorotar.tita!!.toFloat()
                titaRad = tita / 180 * kotlin.math.PI
                for (k in radioPromedios.toInt() until posicionEnXOrdenCero-200) {
                    listaXRectaAjuste.add(k)
                    listaYRectaAjuste.add((k * m[1] + m[0]).toInt())
                }

                prueba = myBitmap.copy(myBitmap.getConfig(), true)
                for (i in 0 until prueba.width) {
                    //println("i =  "+i)
                    var j = (m[1] * i + m[0]).toInt()
                    prueba.setPixel(i, j, Color.rgb(255, 255, 255))
                }
                for (m in 0 until listaMaximosX.size) {
                    var i = listaMaximosX[m].toInt()
                    var j = listaMaximosY[m].toInt()
                    for (k in -5..5) {
                        for (l in -5..5) {
                            prueba.setPixel(i + k, j + l, Color.rgb(255, 0, 0))
                        }
                    }
                }
                var i = posicionEnXOrdenCero
                var j = (m[1] * i + m[0]).toInt()
                for (k in -10..10) {
                    for (l in -10..10) {
                        prueba.setPixel(i + k, j + l, Color.rgb(255, 0, 255))
                    }
                }
            }
            catch (e: Exception)
            {
                withContext(Dispatchers.Main){
                    textoProgreso.isVisible = false
                    activarBotonContinuar = true
                    captureButton.isEnabled = true
                    barraProgreso.isVisible = false
                    Toast.makeText(activity,"Error al encontrar la recta",Toast.LENGTH_SHORT).show()
                }
                this.cancel()
            }
        }


        /**--------------------------------------------------------------------------**/
        /** Recta encontrada     **/
        /**--------------------------------------------------------------------------**/

        var n0 = 1
        val tolerancia = 1
        val normalizacion = (2*radioPromedios + 1).toDouble().pow(2.0).toFloat()

        var redX1 : Int = 0
        var greenX1 : Int = 0

        var t1 = tmin
        var t2 = (tmax).toLong()
        var t = 0L

        var nB = 0
        var nR = 0
        var nG = 0

        withContext(Dispatchers.Main){
            textoProgreso.text="Buscando primer \n orden difractivo"
        }

        /**--------------------------------------------------------------------------**/
        /** Buscando primer orden de difraccíon     **/
        /**--------------------------------------------------------------------------**/

        var Q = 0
        while (n0 <= tolerancia) {

            var blueTest = mutableListOf<Int>()
            var redTest = mutableListOf<Int>()
            var greenTest = mutableListOf<Int>()
            previewSession.close()
            delay(500L)
            picturesSession = createCaptureSession(camera, listOf(imageReader.surface), cameraHandler)
            takePhoto(previewExposureTime,sensitivity,focalDistanceCm,picturesSession).use{ result -> // Modificación 06/05/24
                buffer = result.image.planes[0].buffer
                bytes = ByteArray(buffer.remaining()).apply {buffer.get(this)}
                myBitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
                result.image.close()
                picturesSession.close()
                makePreviewSession(previewExposureTime,sensitivity,focalDistance) // Modificación 06/05/24
                for (n in 0 until listaXRectaAjuste.lastIndex) {
                    var i0 = listaXRectaAjuste[n]
                    var j0 = listaYRectaAjuste[n]
                    var r = 0f
                    var g = 0f
                    var b = 0f
                    for (i in i0 - radioPromedios.toInt()..i0 + radioPromedios.toInt()) {
                        for (j in j0 - radioPromedios.toInt()..j0 + radioPromedios.toInt()) {
                            var aargb = myBitmap.getPixel(i, j)
                            r += Color.red(aargb).toFloat() / normalizacion
                            g += Color.green(aargb).toFloat() / normalizacion
                            b += Color.blue(aargb).toFloat() / normalizacion
                        }
                    }
                    blueTest.add(b.toInt())
                    redTest.add(r.toInt())
                    greenTest.add(g.toInt())
                }
                encontrarMaximo(blueTest).run{
                    Q=this[0]
                    nB=listaXRectaAjuste[this[1]]
                }

                n0 += 1
                if (Q<250) {
                    t1=t.toLong()
                } else {
                    t2=t.toLong()
                }
                println("BLUE  "+blueTest)
                println("INDICES  "+listaXRectaAjuste)
            }

        }

        withContext(Dispatchers.Main){
            textoProgreso.text="Generando posiciones \n en píxeles"
        }

        blueX1 = nB.toInt()
        redX1 = nR.toInt()
        greenX1 = nG.toInt()
        println("POSICION ORDEN CERO  "+posicionEnXOrdenCero)
        println("MAXIMO ORDEN 1 RED  "+redX1)
        println("MAXIMO ORDEN 1 BLUE  "+blueX1)
        println("MAXIMO ORDEN 1 GREEN  "+greenX1)
        var i = blueX1
        for (j in (h.toFloat()/3f).toInt() until (2f*h.toFloat()/3f).toInt()) {
            for (k in -10..10) {
                for (l in -10..10) {
                    prueba.setPixel(i + k, j + l, Color.rgb(255, 255, 255))
                }
            }
        }

        val redLeft = redX1-0.5*abs(posicionEnXOrdenCero-redX1)
        val leftLimit : Int = (heavisideTheta(redLeft-radioPromedios)*redLeft+heavisideTheta(radioPromedios-redLeft)*radioPromedios).toInt()
        val blueRight = blueX1+0.5*abs(posicionEnXOrdenCero-blueX1)
        val rightLimit = (heavisideTheta(posicionEnXOrdenCero-200-blueRight)*blueRight+heavisideTheta(-posicionEnXOrdenCero+200+blueRight)*(posicionEnXOrdenCero-200)).toInt()

        listaIndices = (leftLimit until rightLimit).toList()

        launch {
            val metric = sqrt(1 + pow(m[1], 2.0))
            for (i in 0 until listaIndices.size) {
                listaConMetrica.add((i * metric + listaIndices[0]).toFloat())
            }
        }

        var L = listaIndices.size
        grisesSinMuestra = zerosMatrix(L, numberOfPictures)
        grisesConMuestra = zerosMatrix(L, numberOfPictures)


        redOrder1 = zeros(L)
        greenOrder1 = zeros(L)
        blueOrder1 = zeros(L)
        redOrder2 = zeros(L)
        greenOrder2 = zeros(L)
        blueOrder2 = zeros(L)

        /**--------------------------------------------------------------------------**/
        /** Tomando fotos en vacío **/
        /**--------------------------------------------------------------------------**/

        withContext(Dispatchers.Main){
            textoProgreso.text="Fotos en vacío"
        }

        previewSession.close()
        makePreviewSession(exposureTime,sensitivity,focalDistance) // Modificación 06/05/24
        delay(500L)
        previewSession.close()
        delay(500L)
        var progress = 0f
        repeat(numberOfPictures) {
            picturesSession = createCaptureSession(camera, listOf(imageReader.surface), cameraHandler)
            takePhoto(exposureTime, sensitivity, focalDistanceCm, picturesSession).use { result -> // Modificación 06/05/24
                buffer = result.image.planes[0].buffer
                bytes = ByteArray(buffer.remaining()).apply { buffer.get(this) }
                myBitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
                result.image.close()
                picturesSession.close()

                grisLoopActual = zeros(L)

                for (n in listaIndices.indices) {
                    var i0 = listaIndices[n].toInt()
                    var j0 = (listaIndices[n] * m[1] + m[0]).toInt()
                    var r = 0f
                    var g = 0f
                    var b = 0f
                    for (i in i0 - radioPromedios.toInt()..i0 + radioPromedios.toInt()) {
                        for (j in j0 - radioPromedios.toInt()..j0 + radioPromedios.toInt()) {
                            var aargb = myBitmap.getPixel(i, j)
                            r += Color.red(aargb).toFloat() / normalizacion
                            g += Color.green(aargb).toFloat() / normalizacion
                            b += Color.blue(aargb).toFloat() / normalizacion
                        }
                    }
                    redOrder1[n]+= r/255f/numberOfPictures.toFloat()
                    greenOrder1[n]+= g/255f/numberOfPictures.toFloat()
                    blueOrder1[n]+= b/255f/numberOfPictures.toFloat()

                    grisLoopActual[n] = (r + g + b)/255f/3f
                }
                //grisesSinMuestra[fotoNro] = zeroToHero(grisLoopActual)
                grisesSinMuestra[fotoNro] = grisLoopActual
                fotoNro += 1

                progress+=1f/numberOfPictures*100f // Modificación 06/05/24
                withContext(Dispatchers.Main){
                    textoProgreso.text="Progreso "+String.format("%.1f", progress)+"%"
                }
            }
        }
        makePreviewSession(exposureTime,sensitivity,focalDistance) // Modificación 06/05/24

        withContext(Dispatchers.Main){
            textoProgreso.text="Poner muestra"
        }

        delay(2000L) //Originalmente eran 7s 5/5/25

        /**--------------------------------------------------------------------------**/
        /** Tomando fotos con muestra **/
        /**--------------------------------------------------------------------------**/

        withContext(Dispatchers.Main){
            textoProgreso.text="Foto con muestra"
        }

        previewSession.close()

        delay(500L)
        progress = 0f
        fotoNro = 0
        repeat(numberOfPictures) {
            picturesSession = createCaptureSession(camera, listOf(imageReader.surface), cameraHandler)
            takePhoto(exposureTime, sensitivity, focalDistanceCm, picturesSession).use { result -> // Modificación 06/05/24
                buffer = result.image.planes[0].buffer
                bytes = ByteArray(buffer.remaining()).apply { buffer.get(this) }
                myBitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.size)
                result.image.close()
                picturesSession.close()

                for (n in listaIndices.indices) {
                    var i0 = listaIndices[n].toInt()
                    var j0 = (listaIndices[n] * m[1] + m[0]).toInt()
                    var r = 0f
                    var g = 0f
                    var b = 0f
                    for (i in i0 - radioPromedios.toInt()..i0 + radioPromedios.toInt()) {
                        for (j in j0 - radioPromedios.toInt()..j0 + radioPromedios.toInt()) {
                            var aargb = myBitmap.getPixel(i, j)
                            r += Color.red(aargb).toFloat() / normalizacion
                            g += Color.green(aargb).toFloat() / normalizacion
                            b += Color.blue(aargb).toFloat() / normalizacion
                        }
                    }
                    redOrder2[n]+= r/255f/numberOfPictures.toFloat()
                    greenOrder2[n]+= g/255f/numberOfPictures.toFloat()
                    blueOrder2[n]+= b/255f/numberOfPictures.toFloat()

                    grisLoopActual[n] = (r + g + b)/255f/3f
                }

                grisesConMuestra[fotoNro] = grisLoopActual
                fotoNro += 1

                progress+=1f/numberOfPictures*100f //ACA CAMBIE 06/05
                withContext(Dispatchers.Main){
                    textoProgreso.text="Progreso "+String.format("%.1f", progress)+"%"
                }
            }
        }

        makePreviewSession(previewExposureTime,sensitivity,focalDistance) // Modificación 06/05/24



        withContext(Dispatchers.Main){
            textoProgreso.isVisible = false
            activarBotonContinuar = true
            captureButton.isEnabled = true
            barraProgreso.isVisible = false
        }

    }


    @SuppressLint("MissingPermission")
    // Modificación 06/05/24 :
    private fun openDevice(exposureTime: Long, sensitivity: Int, focalDistance: Float) = lifecycleScope.launch(Dispatchers.Main) {
    //
        camera = openCamera(cameraManager, args.cameraId, cameraHandler)
        previewSession = createCaptureSession(camera, listOf(viewFinder.holder.surface), cameraHandler)
        captureRequestPreview = camera.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW).apply { addTarget(viewFinder.holder.surface) }

        captureRequestPreview.set(CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.BLACK_LEVEL_LOCK, true)
        captureRequestPreview.set(CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE, CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, CONTROL_AE_ANTIBANDING_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.CONTROL_AWB_MODE, CONTROL_AWB_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.CONTROL_EFFECT_MODE, CONTROL_EFFECT_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.CONTROL_SCENE_MODE, CONTROL_SCENE_MODE_DISABLED)
        captureRequestPreview.set(CaptureRequest.DISTORTION_CORRECTION_MODE, DISTORTION_CORRECTION_MODE_OFF)

        captureRequestPreview.set(CaptureRequest.LENS_FOCUS_DISTANCE, 1f/focalDistance*100f)  // Modificación 06/05/24
        captureRequestPreview.set(CaptureRequest.SENSOR_EXPOSURE_TIME, exposureTime)
        captureRequestPreview.set(CaptureRequest.SENSOR_SENSITIVITY, sensitivity)
        previewSession.setRepeatingRequest(captureRequestPreview.build(), null, cameraHandler)

    }

    @SuppressLint("MissingPermission")
    private suspend fun openCamera(
        manager: CameraManager,
        cameraId: String,
        handler: Handler? = null
    ): CameraDevice = suspendCancellableCoroutine { cont ->
        manager.openCamera(cameraId, object : CameraDevice.StateCallback() {
            override fun onOpened(device: CameraDevice) = cont.resume(device)

            override fun onDisconnected(device: CameraDevice) {
                Log.w(TAG, "Camera $cameraId has been disconnected")
                requireActivity().finish()
            }

            override fun onError(device: CameraDevice, error: Int) {
                val msg = when(error) {
                    ERROR_CAMERA_DEVICE -> "Fatal (device)"
                    ERROR_CAMERA_DISABLED -> "Device policy"
                    ERROR_CAMERA_IN_USE -> "Camera in use"
                    ERROR_CAMERA_SERVICE -> "Fatal (service)"
                    ERROR_MAX_CAMERAS_IN_USE -> "Maximum cameras in use"
                    else -> "Unknown"
                }
                val exc = RuntimeException("Camera $cameraId error: ($error) $msg")
                Log.e(TAG, exc.message, exc)
                if (cont.isActive) cont.resumeWithException(exc)
            }
        }, handler)
    }
    // Modificación 06/05/24
    private suspend fun makePreviewSession(exposureTime: Long, sensitivity: Int, focalDistance: Float) = lifecycleScope.launch(Dispatchers.Main) {
    //
        previewSession = createCaptureSession(camera, listOf(viewFinder.holder.surface), cameraHandler)

        captureRequestPreview = camera.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW)  // HIZO UN CAMBIO ACA TEMPLATE_PREVIW A TEMPLATE_MANUAL
            .apply { addTarget(viewFinder.holder.surface) }

        captureRequestPreview.set(CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.BLACK_LEVEL_LOCK, true)
        captureRequestPreview.set(CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE, CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, CONTROL_AE_ANTIBANDING_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.CONTROL_AWB_MODE, CONTROL_AWB_MODE_OFF) // CAMBIE OFF A AUTO
        captureRequestPreview.set(CaptureRequest.CONTROL_EFFECT_MODE, CONTROL_EFFECT_MODE_OFF)
        captureRequestPreview.set(CaptureRequest.CONTROL_SCENE_MODE, CONTROL_SCENE_MODE_DISABLED)
        captureRequestPreview.set(CaptureRequest.DISTORTION_CORRECTION_MODE, DISTORTION_CORRECTION_MODE_OFF)

        captureRequestPreview.set(CaptureRequest.LENS_FOCUS_DISTANCE, 1f/focalDistance*100f) // Modificación 06/05/24
        captureRequestPreview.set(CaptureRequest.SENSOR_EXPOSURE_TIME, exposureTime)
        captureRequestPreview.set(CaptureRequest.SENSOR_SENSITIVITY, sensitivity)

        previewSession.setRepeatingRequest(captureRequestPreview.build(), null, cameraHandler)

    }

    private suspend fun createCaptureSession(
        device: CameraDevice,
        targets: List<Surface>,
        handler: Handler? = null
    ): CameraCaptureSession = suspendCoroutine { cont ->
        println("CaptureSessionCreated")
        // Create a capture session using the predefined targets; this also involves defining the
        // session state callback to be notified of when the session is ready
        device.createCaptureSession(targets, object: CameraCaptureSession.StateCallback() {

            override fun onConfigured(session: CameraCaptureSession) = cont.resume(session)

            override fun onConfigureFailed(session: CameraCaptureSession) {
                val exc = RuntimeException("Camera ${device.id} session configuration failed")
                Log.e(TAG, exc.message, exc)
                cont.resumeWithException(exc)
            }
        }, handler)
    }

    private suspend fun takePhoto(exposureTime: Long,sensitivity : Int, focusDistance: Float, session : CameraCaptureSession):
            CombinedCaptureResult = suspendCoroutine { cont ->

        captureRequestStillCapture = session.device.createCaptureRequest(CameraDevice.TEMPLATE_STILL_CAPTURE).apply {addTarget(imageReader.surface)}

        captureRequestStillCapture.set(CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_MODE_OFF)
        captureRequestStillCapture.set(CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_MODE_OFF)
        captureRequestStillCapture.set(CaptureRequest.BLACK_LEVEL_LOCK, true)
        captureRequestStillCapture.set(CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE, CaptureRequest.COLOR_CORRECTION_ABERRATION_MODE_OFF)
        captureRequestStillCapture.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, CONTROL_AE_ANTIBANDING_MODE_OFF)
        captureRequestStillCapture.set(CaptureRequest.CONTROL_AWB_MODE, CONTROL_AWB_MODE_OFF)
        captureRequestStillCapture.set(CaptureRequest.CONTROL_EFFECT_MODE, CONTROL_EFFECT_MODE_OFF)
        captureRequestStillCapture.set(CaptureRequest.CONTROL_SCENE_MODE, CONTROL_SCENE_MODE_DISABLED)
        captureRequestStillCapture.set(CaptureRequest.DISTORTION_CORRECTION_MODE, DISTORTION_CORRECTION_MODE_OFF)

        captureRequestStillCapture.set(CaptureRequest.LENS_FOCUS_DISTANCE, focusDistance)
        captureRequestStillCapture.set(CaptureRequest.SENSOR_EXPOSURE_TIME, exposureTime)
        captureRequestStillCapture.set(CaptureRequest.SENSOR_SENSITIVITY, sensitivity)

        // Flush any images left in the image reader
        @Suppress("ControlFlowWithEmptyBody")
        while (imageReader.acquireNextImage() != null) {}

        // Start a new image queue
        var imageQueue = ArrayBlockingQueue<Image>(IMAGE_BUFFER_SIZE)
        imageReader.setOnImageAvailableListener({ reader ->
            var image = reader.acquireNextImage()
            imageQueue.add(image)
        }, imageReaderHandler)

        session.capture(captureRequestStillCapture.build(), object : CameraCaptureSession.CaptureCallback() {

            override fun onCaptureStarted(
                session: CameraCaptureSession,
                request: CaptureRequest,
                timestamp: Long,
                frameNumber: Long) {
                super.onCaptureStarted(session, request, timestamp, frameNumber)
                viewFinder.post(animationTask)
            }

            override fun onCaptureCompleted(
                session: CameraCaptureSession,
                request: CaptureRequest,
                result: TotalCaptureResult) {
                super.onCaptureCompleted(session, request, result)
                var resultTimestamp = result.get(CaptureResult.SENSOR_TIMESTAMP)
                Log.d(TAG, "Capture result received: $resultTimestamp")

                // Set a timeout in case image captured is dropped from the pipeline
                var exc = TimeoutException("Image dequeuing took too long")
                var timeoutRunnable = Runnable { cont.resumeWithException(exc) }
                imageReaderHandler.postDelayed(timeoutRunnable, IMAGE_CAPTURE_TIMEOUT_MILLIS)

                // Loop in the coroutine's context until an image with matching timestamp comes
                // We need to launch the coroutine context again because the callback is done in
                //  the handler provided to the `capture` method, not in our coroutine context
                @Suppress("BlockingMethodInNonBlockingContext")
                lifecycleScope.launch(cont.context) {
                    while (true) {
                        // Dequeue images while timestamps don't match
                        var image = imageQueue.take()
                        // TODO(owahltinez): b/142011420
                        // if (image.timestamp != resultTimestamp) continue
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q &&
                            image.format != ImageFormat.DEPTH_JPEG &&
                            image.timestamp != resultTimestamp) continue
                        Log.d(TAG, "Matching image dequeued: ${image.timestamp}")

                        // Unset the image reader listener
                        imageReaderHandler.removeCallbacks(timeoutRunnable)
                        imageReader.setOnImageAvailableListener(null, null)

                        // Clear the queue of images, if there are left
                        while (imageQueue.size > 0) {
                            imageQueue.take().close()
                        }

                        // Compute EXIF orientation metadata
                        //val rotation = relativeOrientation.value ?: 0
                        var rotation = 0
                        //val mirrored = characteristics.get(CameraCharacteristics.LENS_FACING) ==
                                CameraCharacteristics.LENS_FACING_FRONT
                        var mirrored = false
                        var exifOrientation = computeExifOrientation(rotation, mirrored)

                        // Build the result and resume progress
                        cont.resume(CombinedCaptureResult(
                            image, result, exifOrientation, imageReader.imageFormat))
                        break
                    }
                }
            }
        }, cameraHandler)
    }




    override fun onStop() {
        super.onStop()
        try {
            camera.close()
        } catch (exc: Throwable) {
            Log.e(TAG, "Error closing camera", exc)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        cameraThread.quitSafely()
        imageReaderThread.quitSafely()
    }

    companion object {
        val TAG = CameraFragment::class.java.simpleName

        /** Maximum number of images that will be held in the reader's buffer */
        const val IMAGE_BUFFER_SIZE: Int = 30

        /** Maximum time allowed to wait for the result of an image capture */
        private const val IMAGE_CAPTURE_TIMEOUT_MILLIS: Long = 5000

        /** Helper data class used to hold capture metadata with their associated image */
        data class CombinedCaptureResult(
            val image: Image,
            val metadata: CaptureResult,
            val orientation: Int,
            val format: Int
        ) : Closeable {
            override fun close() = image.close()
        }

        /**
         * Create a [File] named a using formatted timestamp with the current date and time.
         *
         * @return [File] created.
         */
        private fun createFile(context: Context, extension: String): File {
            val sdf = SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS", Locale.US)
            return File(context.filesDir, "IMG_${sdf.format(Date())}.$extension")
        }
    }

}

fun maxFinder(intensidades: IntArray) : List<Int> {
    /** Declaracion de variables a utilizar */
    var posicionesMaximos = ArrayList<Int>()
    val intensidadesEnMaximos = mutableListOf<Int>()
    val ancho = 100 // Ancho con el que defino que un punto es un maximo o minimo

    for (i in ancho+1..intensidades.size - (ancho+1)) {
        /** Si cumplen estas condiciones es un máximo */
        if (intensidades[i] >= intensidades.sliceArray(i-ancho..i-1).maxOrNull()!! &&
            intensidades[i] >= intensidades.sliceArray(i+1..i+ancho).maxOrNull()!! && intensidades[i] > 30) // antes 50
        {

            posicionesMaximos.add(i) // Adjunta la posicion del maximo al vector de maximos
            intensidadesEnMaximos.add(intensidades[i])
        }
    }

    val ordenCero = encontrarMaximo(intensidadesEnMaximos)[0]
    var ordenUnoLista = encontrarOrdenUno(intensidadesEnMaximos,ordenCero)
    var ordenUno = ordenUnoLista[0]
    var posOrdenUno = posicionesMaximos[ordenUnoLista[1]]

    return listOf(ordenUno,posOrdenUno)
}

fun firstIndexOf(xs : MutableList<Int>, x : Number ) : Number {
    var n = 0
    for (k in 0 until xs.lastIndex) {
        if (xs[k].toFloat()<x.toFloat()){
            continue
        } else if (xs[k].toFloat()==x.toFloat()) {
            n = k
            break
        } else {
            n = k-1
            break
        }
    }
    return n
}

fun encontrarMaximo (xs : MutableList<Int>) : List<Int> {
    val l = xs.size
    if (l==0) {
        return listOf<Int>(0,0)
    } else {
        var x0 = xs[0]
        var n = 0
        if (l >= 2 ) {
            for (k in 1..(l-1)) {
                if (xs[k] <= x0) {
                    continue
                } else {
                    x0 = xs[k]
                    n = k
                }
            }
        }
        return listOf<Int>(x0,n)
    }
}

fun encontrarMinimo (xs : MutableList<Int>) : List<Int> {
    val l = xs.size
    if (l==0) {
        return listOf<Int>()
    } else {
        var x0 = xs[0]
        var n = 0
        if (l >= 2 ) {
            for (k in 1..(l-1)) {
                if (xs[k] >= x0) {
                    continue
                } else {
                    x0 = xs[k]
                    n = k
                }
            }
        }
        return listOf<Int>(x0,n)
    }
}

fun encontrarOrdenUno (xs : MutableList<Int>, I : Int) : List<Int> {
    val l = xs.size
    if (l==0) {
        return listOf<Int>()
    } else {
        var x0 = xs[0]
        var n = 0
        if (l >= 2 ) {
            for (k in 1..(l-1)) {
                if (xs[k] <= x0 || xs[k]>=I) {
                    continue
                } else {
                    x0 = xs[k]
                    n = k
                }
            }
        }
        return listOf<Int>(x0,n)
    }
}

fun maxFinderPorIndice(intensidades: IntArray, j : Int, tol : Int) : List<Int> {
    /** Declaracion de variables a utilizar */
    var posicionesMaximos = ArrayList<Int>()
    val intensidadesEnMaximos = mutableListOf<Int>()
    val ancho = 100 // Ancho con el que defino que un punto es un maximo o minimo

    for (i in ancho+1..intensidades.size - (ancho+1)) {
        /** Si cumplen estas condiciones es un máximo */
        if (intensidades[i] >= intensidades.sliceArray(i-ancho..i-1).maxOrNull()!! &&
            intensidades[i] >= intensidades.sliceArray(i+1..i+ancho).maxOrNull()!! &&
            abs(i-j)<=tol &&
            intensidades[i] > 30) // antes 50
        {
            posicionesMaximos.add(i) // Adjunta la posicion del maximo al vector de maximos
            intensidadesEnMaximos.add(intensidades[i])
        }
    }

    var ordenUnoLista = encontrarMaximo(intensidadesEnMaximos)
    var ordenUno = ordenUnoLista[0]
    var posOrdenUno = posicionesMaximos[ordenUnoLista[1]]

    return listOf(ordenUno,posOrdenUno)
}

fun orientationFunction (orientation : Int) : Int {
    if (orientation == 0 || orientation == 90) {
        return 0
    } else {
        return 180
    }
}

fun doubleList(start : Int, final : Int) : MutableList<Double> {
    val xs = mutableListOf<Double>()
    var n0 = start.toDouble()
    while (n0<=final){
        xs.add(n0)
        n0+=1.toDouble()
    }
    return xs
}

fun heavisideTheta (x : Number) : Float {
    var y = x.toFloat()
    if (y<0){
        return 0f
    } else {
        return 1f
    }
}

fun calculateSD(numArray: DoubleArray): Double {
    var sum = 0.0
    var standardDeviation = 0.0

    for (num in numArray) {
        sum += num
    }

    val mean = sum / numArray.size

    for (num in numArray) {
        standardDeviation += Math.pow(num - mean, 2.0)
    }

    return Math.sqrt(standardDeviation / numArray.size)
}

fun zeros(n: Int) : MutableList<Float> {
    val xs : MutableList<Float> = mutableListOf()
    repeat(n){
        xs.add(0f)
    }
    return xs
}

fun zerosMatrix(nRows: Int, nCols: Int): MutableList<MutableList<Float>> {
    require(nRows >= 0 && nCols >= 0) { "Dimensions must be non-negative" }
    return MutableList(nCols) { MutableList(nRows) { 0f } }
}

fun zeroToHero(list: MutableList<Float>) : MutableList<Float> {
    for (n in list.indices){
        list[n] = n.toFloat()
    }
    return list
}