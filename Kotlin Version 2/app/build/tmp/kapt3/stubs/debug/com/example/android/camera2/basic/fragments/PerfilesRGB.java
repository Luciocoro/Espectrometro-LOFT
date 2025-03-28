package com.example.android.camera2.basic.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00102\u001a\u000203J&\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00152\f\u00106\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u00107\u001a\u000208H\u0002J&\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u001a\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020:2\b\u0010?\u001a\u0004\u0018\u00010@H\u0017J\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020ER\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020)0(\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010+\u00a8\u0006G"}, d2 = {"Lcom/example/android/camera2/basic/fragments/PerfilesRGB;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/android/camera2/basic/fragments/PerfilesRGBArgs;", "getArgs", "()Lcom/example/android/camera2/basic/fragments/PerfilesRGBArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "cameraManager$delegate", "Lkotlin/Lazy;", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "getCharacteristics", "()Landroid/hardware/camera2/CameraCharacteristics;", "characteristics$delegate", "graphview", "Lcom/jjoe64/graphview/GraphView;", "getGraphview", "()Lcom/jjoe64/graphview/GraphView;", "setGraphview", "(Lcom/jjoe64/graphview/GraphView;)V", "grayOrder1", "", "", "getGrayOrder1", "()Ljava/util/List;", "grayOrder1WaveLengthList", "getGrayOrder1WaveLengthList", "grayOrder2", "getGrayOrder2", "grayOrder2WaveLengthList", "getGrayOrder2WaveLengthList", "relativeOrientation", "Lcom/example/android/camera/utils/OrientationLiveData;", "seriesBlue", "Lcom/jjoe64/graphview/series/LineGraphSeries;", "Lcom/jjoe64/graphview/series/DataPoint;", "getSeriesBlue", "()Lcom/jjoe64/graphview/series/LineGraphSeries;", "seriesGray", "getSeriesGray", "seriesGreen", "getSeriesGreen", "seriesRed", "getSeriesRed", "exportarDatos", "Lkotlinx/coroutines/Job;", "makeGraph", "graph", "series", "action", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "orientationFunction", "", "orientation", "app_debug"})
public final class PerfilesRGB extends androidx.fragment.app.Fragment {
    
    /**
     * Detects, characterizes, and connects to a CameraDevice (used for all camera operations)
     */
    private final kotlin.Lazy cameraManager$delegate = null;
    
    /**
     * [CameraCharacteristics] corresponding to the provided Camera ID
     */
    private final kotlin.Lazy characteristics$delegate = null;
    
    /**
     * Live data listener for changes in the device orientation relative to the camera
     */
    private com.example.android.camera.utils.OrientationLiveData relativeOrientation;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    public com.jjoe64.graphview.GraphView graphview;
    @org.jetbrains.annotations.NotNull()
    private final com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> seriesBlue = null;
    @org.jetbrains.annotations.NotNull()
    private final com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> seriesRed = null;
    @org.jetbrains.annotations.NotNull()
    private final com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> seriesGreen = null;
    @org.jetbrains.annotations.NotNull()
    private final com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> seriesGray = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Float> grayOrder1WaveLengthList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Float> grayOrder1 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Float> grayOrder2WaveLengthList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Float> grayOrder2 = null;
    
    public PerfilesRGB() {
        super();
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
    
    private final com.example.android.camera2.basic.fragments.PerfilesRGBArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jjoe64.graphview.GraphView getGraphview() {
        return null;
    }
    
    public final void setGraphview(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.GraphView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> getSeriesBlue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> getSeriesRed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> getSeriesGreen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> getSeriesGray() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Float> getGrayOrder1WaveLengthList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Float> getGrayOrder1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Float> getGrayOrder2WaveLengthList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Float> getGrayOrder2() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job exportarDatos() {
        return null;
    }
    
    private final kotlinx.coroutines.Job makeGraph(com.jjoe64.graphview.GraphView graph, com.jjoe64.graphview.series.LineGraphSeries<com.jjoe64.graphview.series.DataPoint> series, java.lang.String action) {
        return null;
    }
    
    public final int orientationFunction(int orientation) {
        return 0;
    }
}