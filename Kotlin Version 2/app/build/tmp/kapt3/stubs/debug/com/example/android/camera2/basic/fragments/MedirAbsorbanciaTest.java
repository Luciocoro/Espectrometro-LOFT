package com.example.android.camera2.basic.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00ab\u00012\u00020\u0001:\u0002\u00ab\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J9\u0010\u0080\u0001\u001a\u00020g2\u0007\u0010\u0081\u0001\u001a\u00020&2\u000e\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010N2\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010(H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0085\u0001J/\u0010\u0086\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020n2\u0007\u0010\u0089\u0001\u001a\u00020\u00182\u0007\u0010\u008a\u0001\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008b\u0001J-\u0010\u008c\u0001\u001a\u0004\u0018\u00010e2\b\u0010\u008d\u0001\u001a\u00030\u008e\u00012\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u0016J\n\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0016J\n\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0016J\u001f\u0010\u0096\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u0097\u0001\u001a\u00020e2\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u0017J3\u0010\u0098\u0001\u001a\u00020&2\u0007\u0010\u0099\u0001\u001a\u00020*2\b\u0010\u009a\u0001\u001a\u00030\u009b\u00012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010(H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u009c\u0001J%\u0010\u009d\u0001\u001a\u00030\u0087\u00012\u0007\u0010\u0088\u0001\u001a\u00020n2\u0007\u0010\u0089\u0001\u001a\u00020\u00182\u0007\u0010\u008a\u0001\u001a\u00020\u0013H\u0003JL\u0010\u009e\u0001\u001a\u00030\u0087\u00012\b\u0010\u009f\u0001\u001a\u00030\u00a0\u00012\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u00012\b\u0010\u00a3\u0001\u001a\u00030\u00a4\u00012\u0007\u0010\u0088\u0001\u001a\u00020n2\u0007\u0010\u00a5\u0001\u001a\u00020\u00182\u0007\u0010\u0089\u0001\u001a\u00020\u00182\u0007\u0010\u008a\u0001\u001a\u00020\u0013H\u0002J8\u0010\u00a6\u0001\u001a\u00030\u00a7\u00012\u0007\u0010\u0088\u0001\u001a\u00020n2\u0007\u0010\u0089\u0001\u001a\u00020\u00182\u0007\u0010\u00a8\u0001\u001a\u00020\u00132\u0007\u0010\u00a9\u0001\u001a\u00020gH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00aa\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b+\u0010,R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR \u0010G\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR \u0010J\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010D\"\u0004\bL\u0010FR\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00180NX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010P\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\u00188B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u000e\u0010W\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020ZX\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010[\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\u00188B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b^\u0010V\u001a\u0004\b\\\u0010R\"\u0004\b]\u0010TR\u001b\u0010_\u001a\u00020`8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\ba\u0010bR\u000e\u0010d\u001a\u00020eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020gX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020iX\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010j\u001a\u00020\u00182\u0006\u0010O\u001a\u00020\u00188B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bm\u0010V\u001a\u0004\bk\u0010R\"\u0004\bl\u0010TR+\u0010o\u001a\u00020n2\u0006\u0010O\u001a\u00020n8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\bt\u0010V\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u000e\u0010u\u001a\u00020gX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020ZX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020|X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u007fX\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00ac\u0001"}, d2 = {"Lcom/example/android/camera2/basic/fragments/MedirAbsorbanciaTest;", "Landroidx/fragment/app/Fragment;", "()V", "activarBotonContinuar", "", "animationTask", "Ljava/lang/Runnable;", "getAnimationTask", "()Ljava/lang/Runnable;", "animationTask$delegate", "Lkotlin/Lazy;", "args", "Lcom/example/android/camera2/basic/fragments/MedirAbsorbanciaTestArgs;", "getArgs", "()Lcom/example/android/camera2/basic/fragments/MedirAbsorbanciaTestArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "blueOrder1", "", "", "blueOrder1IndexList", "", "blueOrder2", "blueX1", "", "buffer", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;", "setBuffer", "(Ljava/nio/ByteBuffer;)V", "bytes", "", "getBytes", "()[B", "setBytes", "([B)V", "camera", "Landroid/hardware/camera2/CameraDevice;", "cameraHandler", "Landroid/os/Handler;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "cameraManager$delegate", "cameraThread", "Landroid/os/HandlerThread;", "canvasParaEditar", "Landroid/graphics/Canvas;", "captureRequestPreview", "Landroid/hardware/camera2/CaptureRequest$Builder;", "captureRequestStillCapture", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "getCharacteristics", "()Landroid/hardware/camera2/CameraCharacteristics;", "characteristics$delegate", "greenOrder1", "greenOrder1IndexList", "greenOrder2", "imageReader", "Landroid/media/ImageReader;", "imageReaderHandler", "imageReaderThread", "listaConMetrica", "listaFinalIntensidadesBlue", "getListaFinalIntensidadesBlue", "()Ljava/util/List;", "setListaFinalIntensidadesBlue", "(Ljava/util/List;)V", "listaFinalIntensidadesGreen", "getListaFinalIntensidadesGreen", "setListaFinalIntensidadesGreen", "listaFinalIntensidadesRed", "getListaFinalIntensidadesRed", "setListaFinalIntensidadesRed", "listaIndices", "", "<set-?>", "m", "getM", "()I", "setM", "(I)V", "m$delegate", "Lkotlin/properties/ReadWriteProperty;", "modoMonocromatico", "mostrarProgreso", "myBitmap", "Landroid/graphics/Bitmap;", "n", "getN", "setN", "n$delegate", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "overlay", "Landroid/view/View;", "picturesSession", "Landroid/hardware/camera2/CameraCaptureSession;", "poneleColor", "Landroid/graphics/Paint;", "posicionEnXOrdenCero", "getPosicionEnXOrdenCero", "setPosicionEnXOrdenCero", "posicionEnXOrdenCero$delegate", "", "previewExposureTime", "getPreviewExposureTime", "()J", "setPreviewExposureTime", "(J)V", "previewExposureTime$delegate", "previewSession", "progreso", "prueba", "redOrder1", "redOrder1IndexList", "redOrder2", "relativeOrientation", "Lcom/example/android/camera/utils/OrientationLiveData;", "testMode", "viewFinder", "Lcom/example/android/camera/utils/AutoFitSurfaceView;", "createCaptureSession", "device", "targets", "Landroid/view/Surface;", "handler", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makePreviewSession", "Lkotlinx/coroutines/Job;", "exposureTime", "sensitivity", "focalDistance", "(JIFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onStop", "onViewCreated", "view", "openCamera", "manager", "cameraId", "", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openDevice", "script", "barraProgreso", "Landroid/widget/ProgressBar;", "textoProgreso", "Landroid/widget/TextView;", "captureButton", "Landroid/widget/ImageButton;", "numberOfPictures", "takePhoto", "Lcom/example/android/camera2/basic/fragments/MedirAbsorbanciaTest$Companion$CombinedCaptureResult;", "focusDistance", "session", "(JIFLandroid/hardware/camera2/CameraCaptureSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class MedirAbsorbanciaTest extends androidx.fragment.app.Fragment {
    
    /**
     * AndroidX navigation arguments
     */
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private android.graphics.Canvas canvasParaEditar;
    private android.graphics.Paint poneleColor;
    private android.graphics.Bitmap myBitmap;
    private android.graphics.Bitmap prueba;
    private final kotlin.properties.ReadWriteProperty n$delegate = null;
    private final kotlin.properties.ReadWriteProperty m$delegate = null;
    private boolean activarBotonContinuar = false;
    private final java.util.List<java.lang.Float> listaConMetrica = null;
    public java.util.List<java.lang.Integer> listaFinalIntensidadesRed;
    public java.util.List<java.lang.Integer> listaFinalIntensidadesGreen;
    public java.util.List<java.lang.Integer> listaFinalIntensidadesBlue;
    
    /**
     * Host's navigation controller
     */
    private final kotlin.Lazy navController$delegate = null;
    
    /**
     * Detects, characterizes, and connects to a CameraDevice (used for all camera operations)
     */
    private final kotlin.Lazy cameraManager$delegate = null;
    
    /**
     * [CameraCharacteristics] corresponding to the provided Camera ID
     */
    private final kotlin.Lazy characteristics$delegate = null;
    
    /**
     * Readers used as buffers for camera still shots
     */
    private android.media.ImageReader imageReader;
    
    /**
     * [HandlerThread] where all camera operations run
     */
    private final android.os.HandlerThread cameraThread = null;
    
    /**
     * [Handler] corresponding to [cameraThread]
     */
    private final android.os.Handler cameraHandler = null;
    
    /**
     * Performs recording animation of flashing screen
     */
    private final kotlin.Lazy animationTask$delegate = null;
    
    /**
     * [HandlerThread] where all buffer reading operations run
     */
    private final android.os.HandlerThread imageReaderThread = null;
    
    /**
     * [Handler] corresponding to [imageReaderThread]
     */
    private final android.os.Handler imageReaderHandler = null;
    
    /**
     * Where the camera preview is displayed
     */
    private com.example.android.camera.utils.AutoFitSurfaceView viewFinder;
    
    /**
     * Overlay on top of the camera preview
     */
    private android.view.View overlay;
    
    /**
     * The [CameraDevice] that will be opened in this fragment
     */
    private android.hardware.camera2.CameraDevice camera;
    
    /**
     * Internal reference to the ongoing [CameraCaptureSession] configured with our parameters
     */
    private android.hardware.camera2.CameraCaptureSession picturesSession;
    private android.hardware.camera2.CameraCaptureSession previewSession;
    
    /**
     * Live data listener for changes in the device orientation relative to the camera
     */
    private com.example.android.camera.utils.OrientationLiveData relativeOrientation;
    private android.hardware.camera2.CaptureRequest.Builder captureRequestStillCapture;
    private android.hardware.camera2.CaptureRequest.Builder captureRequestPreview;
    public java.nio.ByteBuffer buffer;
    public byte[] bytes;
    private int progreso = 0;
    private boolean mostrarProgreso = false;
    private final boolean testMode = false;
    private java.util.List<java.lang.Float> blueOrder1;
    private int[] blueOrder1IndexList;
    private java.util.List<java.lang.Float> blueOrder2;
    private java.util.List<java.lang.Float> redOrder1;
    private int[] redOrder1IndexList;
    private java.util.List<java.lang.Float> redOrder2;
    private java.util.List<java.lang.Float> greenOrder1;
    private int[] greenOrder1IndexList;
    private java.util.List<java.lang.Float> greenOrder2;
    private java.util.List<java.lang.Integer> listaIndices;
    private final kotlin.properties.ReadWriteProperty posicionEnXOrdenCero$delegate = null;
    private int blueX1 = 0;
    private boolean modoMonocromatico = false;
    private final kotlin.properties.ReadWriteProperty previewExposureTime$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.camera2.basic.fragments.MedirAbsorbanciaTest.Companion Companion = null;
    private static final java.lang.String TAG = null;
    
    /**
     * Maximum number of images that will be held in the reader's buffer
     */
    public static final int IMAGE_BUFFER_SIZE = 30;
    
    /**
     * Maximum time allowed to wait for the result of an image capture
     */
    private static final long IMAGE_CAPTURE_TIMEOUT_MILLIS = 5000L;
    
    public MedirAbsorbanciaTest() {
        super();
    }
    
    /**
     * AndroidX navigation arguments
     */
    private final com.example.android.camera2.basic.fragments.MedirAbsorbanciaTestArgs getArgs() {
        return null;
    }
    
    private final int getN() {
        return 0;
    }
    
    private final void setN(int p0) {
    }
    
    private final int getM() {
        return 0;
    }
    
    private final void setM(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getListaFinalIntensidadesRed() {
        return null;
    }
    
    public final void setListaFinalIntensidadesRed(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getListaFinalIntensidadesGreen() {
        return null;
    }
    
    public final void setListaFinalIntensidadesGreen(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getListaFinalIntensidadesBlue() {
        return null;
    }
    
    public final void setListaFinalIntensidadesBlue(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> p0) {
    }
    
    /**
     * Host's navigation controller
     */
    private final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    /**
     * Detects, characterizes, and connects to a CameraDevice (used for all camera operations)
     */
    private final android.hardware.camera2.CameraManager getCameraManager() {
        return null;
    }
    
    /**
     * [CameraCharacteristics] corresponding to the provided Camera ID
     */
    private final android.hardware.camera2.CameraCharacteristics getCharacteristics() {
        return null;
    }
    
    /**
     * Performs recording animation of flashing screen
     */
    private final java.lang.Runnable getAnimationTask() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.nio.ByteBuffer getBuffer() {
        return null;
    }
    
    public final void setBuffer(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] getBytes() {
        return null;
    }
    
    public final void setBytes(@org.jetbrains.annotations.NotNull()
    byte[] p0) {
    }
    
    private final int getPosicionEnXOrdenCero() {
        return 0;
    }
    
    private final void setPosicionEnXOrdenCero(int p0) {
    }
    
    private final long getPreviewExposureTime() {
        return 0L;
    }
    
    private final void setPreviewExposureTime(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlinx.coroutines.Job script(android.widget.ProgressBar barraProgreso, android.widget.TextView textoProgreso, android.widget.ImageButton captureButton, long exposureTime, int numberOfPictures, int sensitivity, float focalDistance) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final kotlinx.coroutines.Job openDevice(long exposureTime, int sensitivity, float focalDistance) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final java.lang.Object openCamera(android.hardware.camera2.CameraManager manager, java.lang.String cameraId, android.os.Handler handler, kotlin.coroutines.Continuation<? super android.hardware.camera2.CameraDevice> continuation) {
        return null;
    }
    
    private final java.lang.Object makePreviewSession(long exposureTime, int sensitivity, float focalDistance, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Job> continuation) {
        return null;
    }
    
    private final java.lang.Object createCaptureSession(android.hardware.camera2.CameraDevice device, java.util.List<? extends android.view.Surface> targets, android.os.Handler handler, kotlin.coroutines.Continuation<? super android.hardware.camera2.CameraCaptureSession> continuation) {
        return null;
    }
    
    private final java.lang.Object takePhoto(long exposureTime, int sensitivity, float focusDistance, android.hardware.camera2.CameraCaptureSession session, kotlin.coroutines.Continuation<? super com.example.android.camera2.basic.fragments.MedirAbsorbanciaTest.Companion.CombinedCaptureResult> continuation) {
        return null;
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/android/camera2/basic/fragments/MedirAbsorbanciaTest$Companion;", "", "()V", "IMAGE_BUFFER_SIZE", "", "IMAGE_CAPTURE_TIMEOUT_MILLIS", "", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "createFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "extension", "CombinedCaptureResult", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final java.lang.String getTAG() {
            return null;
        }
        
        /**
         * Create a [File] named a using formatted timestamp with the current date and time.
         *
         * @return [File] created.
         */
        private final java.io.File createFile(android.content.Context context, java.lang.String extension) {
            return null;
        }
        
        /**
         * Helper data class used to hold capture metadata with their associated image
         */
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/example/android/camera2/basic/fragments/MedirAbsorbanciaTest$Companion$CombinedCaptureResult;", "Ljava/io/Closeable;", "image", "Landroid/media/Image;", "metadata", "Landroid/hardware/camera2/CaptureResult;", "orientation", "", "format", "(Landroid/media/Image;Landroid/hardware/camera2/CaptureResult;II)V", "getFormat", "()I", "getImage", "()Landroid/media/Image;", "getMetadata", "()Landroid/hardware/camera2/CaptureResult;", "getOrientation", "close", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class CombinedCaptureResult implements java.io.Closeable {
            @org.jetbrains.annotations.NotNull()
            private final android.media.Image image = null;
            @org.jetbrains.annotations.NotNull()
            private final android.hardware.camera2.CaptureResult metadata = null;
            private final int orientation = 0;
            private final int format = 0;
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @org.jetbrains.annotations.NotNull()
            public final com.example.android.camera2.basic.fragments.MedirAbsorbanciaTest.Companion.CombinedCaptureResult copy(@org.jetbrains.annotations.NotNull()
            android.media.Image image, @org.jetbrains.annotations.NotNull()
            android.hardware.camera2.CaptureResult metadata, int orientation, int format) {
                return null;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Helper data class used to hold capture metadata with their associated image
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public CombinedCaptureResult(@org.jetbrains.annotations.NotNull()
            android.media.Image image, @org.jetbrains.annotations.NotNull()
            android.hardware.camera2.CaptureResult metadata, int orientation, int format) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.media.Image component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.media.Image getImage() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.hardware.camera2.CaptureResult component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.hardware.camera2.CaptureResult getMetadata() {
                return null;
            }
            
            public final int component3() {
                return 0;
            }
            
            public final int getOrientation() {
                return 0;
            }
            
            public final int component4() {
                return 0;
            }
            
            public final int getFormat() {
                return 0;
            }
            
            @java.lang.Override()
            public void close() {
            }
        }
    }
}