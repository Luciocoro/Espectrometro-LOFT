package com.example.android.camera2.basic.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0017R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/android/camera2/basic/fragments/MenuFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/example/android/camera2/basic/fragments/MenuFragmentArgs;", "getArgs", "()Lcom/example/android/camera2/basic/fragments/MenuFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "getCameraManager", "()Landroid/hardware/camera2/CameraManager;", "cameraManager$delegate", "Lkotlin/Lazy;", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "getCharacteristics", "()Landroid/hardware/camera2/CameraCharacteristics;", "characteristics$delegate", "relativeOrientation", "Lcom/example/android/camera/utils/OrientationLiveData;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MenuFragment extends androidx.fragment.app.Fragment {
    
    /**
     * AndroidX navigation arguments
     */
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    
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
    
    public MenuFragment() {
        super();
    }
    
    /**
     * AndroidX navigation arguments
     */
    private final com.example.android.camera2.basic.fragments.MenuFragmentArgs getArgs() {
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
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
}