package com.example.android.camera2.basic.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b\'\u0010(R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001a\u0010:\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010=\u001a\u000202X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001a\u0010@\u001a\u00020AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\u001a\u0010I\u001a\u00020JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\f\"\u0004\bQ\u0010\u000eR\u000e\u0010R\u001a\u00020SX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010V\u001a\u00020JX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010LR\u001a\u0010X\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\f\"\u0004\bZ\u0010\u000eR\u001b\u0010[\u001a\u00020\\8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b_\u0010\u0014\u001a\u0004\b]\u0010^R\u000e\u0010`\u001a\u00020aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010b\u001a\u00020JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010L\"\u0004\bd\u0010NR\u000e\u0010e\u001a\u00020fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020hX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020jX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010k\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\f\"\u0004\bm\u0010\u000eR\u001a\u0010n\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\f\"\u0004\bp\u0010\u000eR\u001a\u0010q\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010\f\"\u0004\bs\u0010\u000e\u00a8\u0006t"}, d2 = {"Lcom/example/android/camera2/basic/fragments/CameraFragment;", "Landroidx/fragment/app/Fragment;", "()V", "D", "", "getD", "()F", "setD", "(F)V", "aargb", "", "getAargb", "()I", "setAargb", "(I)V", "animationTask", "Ljava/lang/Runnable;", "getAnimationTask", "()Ljava/lang/Runnable;", "animationTask$delegate", "Lkotlin/Lazy;", "args", "Lcom/example/android/camera2/basic/fragments/CameraFragmentArgs;", "getArgs", "()Lcom/example/android/camera2/basic/fragments/CameraFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "bitmapRotado", "Landroid/graphics/Bitmap;", "getBitmapRotado", "()Landroid/graphics/Bitmap;", "setBitmapRotado", "(Landroid/graphics/Bitmap;)V", "camera", "Landroid/hardware/camera2/CameraDevice;", "cameraHandler", "Landroid/os/Handler;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "cameraManager$delegate", "cameraThread", "Landroid/os/HandlerThread;", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "getCharacteristics", "()Landroid/hardware/camera2/CameraCharacteristics;", "characteristics$delegate", "datosB", "", "getDatosB", "()[F", "setDatosB", "([F)V", "datosG", "getDatosG", "setDatosG", "datosL", "getDatosL", "setDatosL", "datosR", "getDatosR", "setDatosR", "datosX", "", "getDatosX", "()[I", "setDatosX", "([I)V", "delta", "getDelta", "setDelta", "exposureTime", "", "getExposureTime", "()J", "setExposureTime", "(J)V", "flagMedicion", "getFlagMedicion", "setFlagMedicion", "imageReader", "Landroid/media/ImageReader;", "imageReaderHandler", "imageReaderThread", "interval", "getInterval", "n", "getN", "setN", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "overlay", "Landroid/view/View;", "previousMillis", "getPreviousMillis", "setPreviousMillis", "relativeOrientation", "Lcom/example/android/camera/utils/OrientationLiveData;", "session", "Landroid/hardware/camera2/CameraCaptureSession;", "viewFinder", "Lcom/example/android/camera/utils/AutoFitSurfaceView;", "x", "getX", "setX", "yf", "getYf", "setYf", "yi", "getYi", "setYi", "app_debug"})
public final class CameraFragment extends androidx.fragment.app.Fragment {
    private int x = 0;
    private final long interval = 2000L;
    private long previousMillis = 0L;
    private long exposureTime = 10000000L;
    private int aargb = 0;
    public android.graphics.Bitmap bitmapRotado;
    private int n = 5;
    
    /**
     * AndroidX navigation arguments
     */
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private int yi = 0;
    private int yf = 10;
    private int delta = 10;
    @org.jetbrains.annotations.NotNull
    private int[] datosX;
    @org.jetbrains.annotations.NotNull
    private float[] datosL;
    @org.jetbrains.annotations.NotNull
    private float[] datosR;
    @org.jetbrains.annotations.NotNull
    private float[] datosG;
    @org.jetbrains.annotations.NotNull
    private float[] datosB;
    private float D = 4000.0F;
    private int flagMedicion = 0;
    
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
    private android.hardware.camera2.CameraCaptureSession session;
    
    /**
     * Live data listener for changes in the device orientation relative to the camera
     */
    private com.example.android.camera.utils.OrientationLiveData relativeOrientation;
    
    public CameraFragment() {
        super();
    }
    
    public final int getX() {
        return 0;
    }
    
    public final void setX(int p0) {
    }
    
    public final long getInterval() {
        return 0L;
    }
    
    public final long getPreviousMillis() {
        return 0L;
    }
    
    public final void setPreviousMillis(long p0) {
    }
    
    public final long getExposureTime() {
        return 0L;
    }
    
    public final void setExposureTime(long p0) {
    }
    
    public final int getAargb() {
        return 0;
    }
    
    public final void setAargb(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getBitmapRotado() {
        return null;
    }
    
    public final void setBitmapRotado(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap p0) {
    }
    
    public final int getN() {
        return 0;
    }
    
    public final void setN(int p0) {
    }
    
    /**
     * AndroidX navigation arguments
     */
    private final com.example.android.camera2.basic.fragments.CameraFragmentArgs getArgs() {
        return null;
    }
    
    public final int getYi() {
        return 0;
    }
    
    public final void setYi(int p0) {
    }
    
    public final int getYf() {
        return 0;
    }
    
    public final void setYf(int p0) {
    }
    
    public final int getDelta() {
        return 0;
    }
    
    public final void setDelta(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final int[] getDatosX() {
        return null;
    }
    
    public final void setDatosX(@org.jetbrains.annotations.NotNull
    int[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final float[] getDatosL() {
        return null;
    }
    
    public final void setDatosL(@org.jetbrains.annotations.NotNull
    float[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final float[] getDatosR() {
        return null;
    }
    
    public final void setDatosR(@org.jetbrains.annotations.NotNull
    float[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final float[] getDatosG() {
        return null;
    }
    
    public final void setDatosG(@org.jetbrains.annotations.NotNull
    float[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final float[] getDatosB() {
        return null;
    }
    
    public final void setDatosB(@org.jetbrains.annotations.NotNull
    float[] p0) {
    }
    
    public final float getD() {
        return 0.0F;
    }
    
    public final void setD(float p0) {
    }
    
    public final int getFlagMedicion() {
        return 0;
    }
    
    public final void setFlagMedicion(int p0) {
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
}