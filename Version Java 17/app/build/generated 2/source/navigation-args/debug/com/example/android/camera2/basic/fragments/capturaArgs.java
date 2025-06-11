package com.example.android.camera2.basic.fragments;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class capturaArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private capturaArgs() {
  }

  @SuppressWarnings("unchecked")
  private capturaArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static capturaArgs fromBundle(@NonNull Bundle bundle) {
    capturaArgs __result = new capturaArgs();
    bundle.setClassLoader(capturaArgs.class.getClassLoader());
    if (bundle.containsKey("bitmap")) {
      Bitmap bitmap;
      if (Parcelable.class.isAssignableFrom(Bitmap.class) || Serializable.class.isAssignableFrom(Bitmap.class)) {
        bitmap = (Bitmap) bundle.get("bitmap");
      } else {
        throw new UnsupportedOperationException(Bitmap.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (bitmap == null) {
        throw new IllegalArgumentException("Argument \"bitmap\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("bitmap", bitmap);
    } else {
      throw new IllegalArgumentException("Required argument \"bitmap\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("camera_id")) {
      String cameraId;
      cameraId = bundle.getString("camera_id");
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("camera_id", cameraId);
    } else {
      throw new IllegalArgumentException("Required argument \"camera_id\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("pixel_format")) {
      int pixelFormat;
      pixelFormat = bundle.getInt("pixel_format");
      __result.arguments.put("pixel_format", pixelFormat);
    } else {
      throw new IllegalArgumentException("Required argument \"pixel_format\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("blueOrder1")) {
      float[] blueOrder1;
      blueOrder1 = bundle.getFloatArray("blueOrder1");
      if (blueOrder1 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder1\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("blueOrder1", blueOrder1);
    } else {
      throw new IllegalArgumentException("Required argument \"blueOrder1\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("redOrder1")) {
      float[] redOrder1;
      redOrder1 = bundle.getFloatArray("redOrder1");
      if (redOrder1 == null) {
        throw new IllegalArgumentException("Argument \"redOrder1\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("redOrder1", redOrder1);
    } else {
      throw new IllegalArgumentException("Required argument \"redOrder1\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("greenOrder1")) {
      float[] greenOrder1;
      greenOrder1 = bundle.getFloatArray("greenOrder1");
      if (greenOrder1 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder1\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("greenOrder1", greenOrder1);
    } else {
      throw new IllegalArgumentException("Required argument \"greenOrder1\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("blueOrder2")) {
      float[] blueOrder2;
      blueOrder2 = bundle.getFloatArray("blueOrder2");
      if (blueOrder2 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder2\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("blueOrder2", blueOrder2);
    } else {
      throw new IllegalArgumentException("Required argument \"blueOrder2\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("redOrder2")) {
      float[] redOrder2;
      redOrder2 = bundle.getFloatArray("redOrder2");
      if (redOrder2 == null) {
        throw new IllegalArgumentException("Argument \"redOrder2\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("redOrder2", redOrder2);
    } else {
      throw new IllegalArgumentException("Required argument \"redOrder2\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("greenOrder2")) {
      float[] greenOrder2;
      greenOrder2 = bundle.getFloatArray("greenOrder2");
      if (greenOrder2 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder2\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("greenOrder2", greenOrder2);
    } else {
      throw new IllegalArgumentException("Required argument \"greenOrder2\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("listaIndices")) {
      float[] listaIndices;
      listaIndices = bundle.getFloatArray("listaIndices");
      if (listaIndices == null) {
        throw new IllegalArgumentException("Argument \"listaIndices\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("listaIndices", listaIndices);
    } else {
      throw new IllegalArgumentException("Required argument \"listaIndices\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("posicionEnXOrden0")) {
      int posicionEnXOrden0;
      posicionEnXOrden0 = bundle.getInt("posicionEnXOrden0");
      __result.arguments.put("posicionEnXOrden0", posicionEnXOrden0);
    } else {
      throw new IllegalArgumentException("Required argument \"posicionEnXOrden0\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("posicionEnXMaxBlue1")) {
      int posicionEnXMaxBlue1;
      posicionEnXMaxBlue1 = bundle.getInt("posicionEnXMaxBlue1");
      __result.arguments.put("posicionEnXMaxBlue1", posicionEnXMaxBlue1);
    } else {
      throw new IllegalArgumentException("Required argument \"posicionEnXMaxBlue1\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("grisesSinMuestra")) {
      FloatMatrix grisesSinMuestra;
      if (Parcelable.class.isAssignableFrom(FloatMatrix.class) || Serializable.class.isAssignableFrom(FloatMatrix.class)) {
        grisesSinMuestra = (FloatMatrix) bundle.get("grisesSinMuestra");
      } else {
        throw new UnsupportedOperationException(FloatMatrix.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (grisesSinMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesSinMuestra\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("grisesSinMuestra", grisesSinMuestra);
    } else {
      throw new IllegalArgumentException("Required argument \"grisesSinMuestra\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("grisesConMuestra")) {
      FloatMatrix grisesConMuestra;
      if (Parcelable.class.isAssignableFrom(FloatMatrix.class) || Serializable.class.isAssignableFrom(FloatMatrix.class)) {
        grisesConMuestra = (FloatMatrix) bundle.get("grisesConMuestra");
      } else {
        throw new UnsupportedOperationException(FloatMatrix.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (grisesConMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesConMuestra\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("grisesConMuestra", grisesConMuestra);
    } else {
      throw new IllegalArgumentException("Required argument \"grisesConMuestra\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("numberOfPictures")) {
      int numberOfPictures;
      numberOfPictures = bundle.getInt("numberOfPictures");
      __result.arguments.put("numberOfPictures", numberOfPictures);
    } else {
      throw new IllegalArgumentException("Required argument \"numberOfPictures\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("exposureTime")) {
      long exposureTime;
      exposureTime = bundle.getLong("exposureTime");
      __result.arguments.put("exposureTime", exposureTime);
    } else {
      throw new IllegalArgumentException("Required argument \"exposureTime\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("sensitivity")) {
      int sensitivity;
      sensitivity = bundle.getInt("sensitivity");
      __result.arguments.put("sensitivity", sensitivity);
    } else {
      throw new IllegalArgumentException("Required argument \"sensitivity\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("focalDistance")) {
      float focalDistance;
      focalDistance = bundle.getFloat("focalDistance");
      __result.arguments.put("focalDistance", focalDistance);
    } else {
      throw new IllegalArgumentException("Required argument \"focalDistance\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static capturaArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    capturaArgs __result = new capturaArgs();
    if (savedStateHandle.contains("bitmap")) {
      Bitmap bitmap;
      bitmap = savedStateHandle.get("bitmap");
      if (bitmap == null) {
        throw new IllegalArgumentException("Argument \"bitmap\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("bitmap", bitmap);
    } else {
      throw new IllegalArgumentException("Required argument \"bitmap\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("camera_id")) {
      String cameraId;
      cameraId = savedStateHandle.get("camera_id");
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("camera_id", cameraId);
    } else {
      throw new IllegalArgumentException("Required argument \"camera_id\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("pixel_format")) {
      int pixelFormat;
      pixelFormat = savedStateHandle.get("pixel_format");
      __result.arguments.put("pixel_format", pixelFormat);
    } else {
      throw new IllegalArgumentException("Required argument \"pixel_format\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("blueOrder1")) {
      float[] blueOrder1;
      blueOrder1 = savedStateHandle.get("blueOrder1");
      if (blueOrder1 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder1\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("blueOrder1", blueOrder1);
    } else {
      throw new IllegalArgumentException("Required argument \"blueOrder1\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("redOrder1")) {
      float[] redOrder1;
      redOrder1 = savedStateHandle.get("redOrder1");
      if (redOrder1 == null) {
        throw new IllegalArgumentException("Argument \"redOrder1\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("redOrder1", redOrder1);
    } else {
      throw new IllegalArgumentException("Required argument \"redOrder1\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("greenOrder1")) {
      float[] greenOrder1;
      greenOrder1 = savedStateHandle.get("greenOrder1");
      if (greenOrder1 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder1\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("greenOrder1", greenOrder1);
    } else {
      throw new IllegalArgumentException("Required argument \"greenOrder1\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("blueOrder2")) {
      float[] blueOrder2;
      blueOrder2 = savedStateHandle.get("blueOrder2");
      if (blueOrder2 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder2\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("blueOrder2", blueOrder2);
    } else {
      throw new IllegalArgumentException("Required argument \"blueOrder2\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("redOrder2")) {
      float[] redOrder2;
      redOrder2 = savedStateHandle.get("redOrder2");
      if (redOrder2 == null) {
        throw new IllegalArgumentException("Argument \"redOrder2\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("redOrder2", redOrder2);
    } else {
      throw new IllegalArgumentException("Required argument \"redOrder2\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("greenOrder2")) {
      float[] greenOrder2;
      greenOrder2 = savedStateHandle.get("greenOrder2");
      if (greenOrder2 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder2\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("greenOrder2", greenOrder2);
    } else {
      throw new IllegalArgumentException("Required argument \"greenOrder2\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("listaIndices")) {
      float[] listaIndices;
      listaIndices = savedStateHandle.get("listaIndices");
      if (listaIndices == null) {
        throw new IllegalArgumentException("Argument \"listaIndices\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("listaIndices", listaIndices);
    } else {
      throw new IllegalArgumentException("Required argument \"listaIndices\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("posicionEnXOrden0")) {
      int posicionEnXOrden0;
      posicionEnXOrden0 = savedStateHandle.get("posicionEnXOrden0");
      __result.arguments.put("posicionEnXOrden0", posicionEnXOrden0);
    } else {
      throw new IllegalArgumentException("Required argument \"posicionEnXOrden0\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("posicionEnXMaxBlue1")) {
      int posicionEnXMaxBlue1;
      posicionEnXMaxBlue1 = savedStateHandle.get("posicionEnXMaxBlue1");
      __result.arguments.put("posicionEnXMaxBlue1", posicionEnXMaxBlue1);
    } else {
      throw new IllegalArgumentException("Required argument \"posicionEnXMaxBlue1\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("grisesSinMuestra")) {
      FloatMatrix grisesSinMuestra;
      grisesSinMuestra = savedStateHandle.get("grisesSinMuestra");
      if (grisesSinMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesSinMuestra\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("grisesSinMuestra", grisesSinMuestra);
    } else {
      throw new IllegalArgumentException("Required argument \"grisesSinMuestra\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("grisesConMuestra")) {
      FloatMatrix grisesConMuestra;
      grisesConMuestra = savedStateHandle.get("grisesConMuestra");
      if (grisesConMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesConMuestra\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("grisesConMuestra", grisesConMuestra);
    } else {
      throw new IllegalArgumentException("Required argument \"grisesConMuestra\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("numberOfPictures")) {
      int numberOfPictures;
      numberOfPictures = savedStateHandle.get("numberOfPictures");
      __result.arguments.put("numberOfPictures", numberOfPictures);
    } else {
      throw new IllegalArgumentException("Required argument \"numberOfPictures\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("exposureTime")) {
      long exposureTime;
      exposureTime = savedStateHandle.get("exposureTime");
      __result.arguments.put("exposureTime", exposureTime);
    } else {
      throw new IllegalArgumentException("Required argument \"exposureTime\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("sensitivity")) {
      int sensitivity;
      sensitivity = savedStateHandle.get("sensitivity");
      __result.arguments.put("sensitivity", sensitivity);
    } else {
      throw new IllegalArgumentException("Required argument \"sensitivity\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("focalDistance")) {
      float focalDistance;
      focalDistance = savedStateHandle.get("focalDistance");
      __result.arguments.put("focalDistance", focalDistance);
    } else {
      throw new IllegalArgumentException("Required argument \"focalDistance\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bitmap getBitmap() {
    return (Bitmap) arguments.get("bitmap");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getCameraId() {
    return (String) arguments.get("camera_id");
  }

  @SuppressWarnings("unchecked")
  public int getPixelFormat() {
    return (int) arguments.get("pixel_format");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getBlueOrder1() {
    return (float[]) arguments.get("blueOrder1");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getRedOrder1() {
    return (float[]) arguments.get("redOrder1");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getGreenOrder1() {
    return (float[]) arguments.get("greenOrder1");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getBlueOrder2() {
    return (float[]) arguments.get("blueOrder2");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getRedOrder2() {
    return (float[]) arguments.get("redOrder2");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getGreenOrder2() {
    return (float[]) arguments.get("greenOrder2");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public float[] getListaIndices() {
    return (float[]) arguments.get("listaIndices");
  }

  @SuppressWarnings("unchecked")
  public int getPosicionEnXOrden0() {
    return (int) arguments.get("posicionEnXOrden0");
  }

  @SuppressWarnings("unchecked")
  public int getPosicionEnXMaxBlue1() {
    return (int) arguments.get("posicionEnXMaxBlue1");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public FloatMatrix getGrisesSinMuestra() {
    return (FloatMatrix) arguments.get("grisesSinMuestra");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public FloatMatrix getGrisesConMuestra() {
    return (FloatMatrix) arguments.get("grisesConMuestra");
  }

  @SuppressWarnings("unchecked")
  public int getNumberOfPictures() {
    return (int) arguments.get("numberOfPictures");
  }

  @SuppressWarnings("unchecked")
  public long getExposureTime() {
    return (long) arguments.get("exposureTime");
  }

  @SuppressWarnings("unchecked")
  public int getSensitivity() {
    return (int) arguments.get("sensitivity");
  }

  @SuppressWarnings("unchecked")
  public float getFocalDistance() {
    return (float) arguments.get("focalDistance");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("bitmap")) {
      Bitmap bitmap = (Bitmap) arguments.get("bitmap");
      if (Parcelable.class.isAssignableFrom(Bitmap.class) || bitmap == null) {
        __result.putParcelable("bitmap", Parcelable.class.cast(bitmap));
      } else if (Serializable.class.isAssignableFrom(Bitmap.class)) {
        __result.putSerializable("bitmap", Serializable.class.cast(bitmap));
      } else {
        throw new UnsupportedOperationException(Bitmap.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    if (arguments.containsKey("camera_id")) {
      String cameraId = (String) arguments.get("camera_id");
      __result.putString("camera_id", cameraId);
    }
    if (arguments.containsKey("pixel_format")) {
      int pixelFormat = (int) arguments.get("pixel_format");
      __result.putInt("pixel_format", pixelFormat);
    }
    if (arguments.containsKey("blueOrder1")) {
      float[] blueOrder1 = (float[]) arguments.get("blueOrder1");
      __result.putFloatArray("blueOrder1", blueOrder1);
    }
    if (arguments.containsKey("redOrder1")) {
      float[] redOrder1 = (float[]) arguments.get("redOrder1");
      __result.putFloatArray("redOrder1", redOrder1);
    }
    if (arguments.containsKey("greenOrder1")) {
      float[] greenOrder1 = (float[]) arguments.get("greenOrder1");
      __result.putFloatArray("greenOrder1", greenOrder1);
    }
    if (arguments.containsKey("blueOrder2")) {
      float[] blueOrder2 = (float[]) arguments.get("blueOrder2");
      __result.putFloatArray("blueOrder2", blueOrder2);
    }
    if (arguments.containsKey("redOrder2")) {
      float[] redOrder2 = (float[]) arguments.get("redOrder2");
      __result.putFloatArray("redOrder2", redOrder2);
    }
    if (arguments.containsKey("greenOrder2")) {
      float[] greenOrder2 = (float[]) arguments.get("greenOrder2");
      __result.putFloatArray("greenOrder2", greenOrder2);
    }
    if (arguments.containsKey("listaIndices")) {
      float[] listaIndices = (float[]) arguments.get("listaIndices");
      __result.putFloatArray("listaIndices", listaIndices);
    }
    if (arguments.containsKey("posicionEnXOrden0")) {
      int posicionEnXOrden0 = (int) arguments.get("posicionEnXOrden0");
      __result.putInt("posicionEnXOrden0", posicionEnXOrden0);
    }
    if (arguments.containsKey("posicionEnXMaxBlue1")) {
      int posicionEnXMaxBlue1 = (int) arguments.get("posicionEnXMaxBlue1");
      __result.putInt("posicionEnXMaxBlue1", posicionEnXMaxBlue1);
    }
    if (arguments.containsKey("grisesSinMuestra")) {
      FloatMatrix grisesSinMuestra = (FloatMatrix) arguments.get("grisesSinMuestra");
      if (Parcelable.class.isAssignableFrom(FloatMatrix.class) || grisesSinMuestra == null) {
        __result.putParcelable("grisesSinMuestra", Parcelable.class.cast(grisesSinMuestra));
      } else if (Serializable.class.isAssignableFrom(FloatMatrix.class)) {
        __result.putSerializable("grisesSinMuestra", Serializable.class.cast(grisesSinMuestra));
      } else {
        throw new UnsupportedOperationException(FloatMatrix.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    if (arguments.containsKey("grisesConMuestra")) {
      FloatMatrix grisesConMuestra = (FloatMatrix) arguments.get("grisesConMuestra");
      if (Parcelable.class.isAssignableFrom(FloatMatrix.class) || grisesConMuestra == null) {
        __result.putParcelable("grisesConMuestra", Parcelable.class.cast(grisesConMuestra));
      } else if (Serializable.class.isAssignableFrom(FloatMatrix.class)) {
        __result.putSerializable("grisesConMuestra", Serializable.class.cast(grisesConMuestra));
      } else {
        throw new UnsupportedOperationException(FloatMatrix.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    if (arguments.containsKey("numberOfPictures")) {
      int numberOfPictures = (int) arguments.get("numberOfPictures");
      __result.putInt("numberOfPictures", numberOfPictures);
    }
    if (arguments.containsKey("exposureTime")) {
      long exposureTime = (long) arguments.get("exposureTime");
      __result.putLong("exposureTime", exposureTime);
    }
    if (arguments.containsKey("sensitivity")) {
      int sensitivity = (int) arguments.get("sensitivity");
      __result.putInt("sensitivity", sensitivity);
    }
    if (arguments.containsKey("focalDistance")) {
      float focalDistance = (float) arguments.get("focalDistance");
      __result.putFloat("focalDistance", focalDistance);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("bitmap")) {
      Bitmap bitmap = (Bitmap) arguments.get("bitmap");
      if (Parcelable.class.isAssignableFrom(Bitmap.class) || bitmap == null) {
        __result.set("bitmap", Parcelable.class.cast(bitmap));
      } else if (Serializable.class.isAssignableFrom(Bitmap.class)) {
        __result.set("bitmap", Serializable.class.cast(bitmap));
      } else {
        throw new UnsupportedOperationException(Bitmap.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    if (arguments.containsKey("camera_id")) {
      String cameraId = (String) arguments.get("camera_id");
      __result.set("camera_id", cameraId);
    }
    if (arguments.containsKey("pixel_format")) {
      int pixelFormat = (int) arguments.get("pixel_format");
      __result.set("pixel_format", pixelFormat);
    }
    if (arguments.containsKey("blueOrder1")) {
      float[] blueOrder1 = (float[]) arguments.get("blueOrder1");
      __result.set("blueOrder1", blueOrder1);
    }
    if (arguments.containsKey("redOrder1")) {
      float[] redOrder1 = (float[]) arguments.get("redOrder1");
      __result.set("redOrder1", redOrder1);
    }
    if (arguments.containsKey("greenOrder1")) {
      float[] greenOrder1 = (float[]) arguments.get("greenOrder1");
      __result.set("greenOrder1", greenOrder1);
    }
    if (arguments.containsKey("blueOrder2")) {
      float[] blueOrder2 = (float[]) arguments.get("blueOrder2");
      __result.set("blueOrder2", blueOrder2);
    }
    if (arguments.containsKey("redOrder2")) {
      float[] redOrder2 = (float[]) arguments.get("redOrder2");
      __result.set("redOrder2", redOrder2);
    }
    if (arguments.containsKey("greenOrder2")) {
      float[] greenOrder2 = (float[]) arguments.get("greenOrder2");
      __result.set("greenOrder2", greenOrder2);
    }
    if (arguments.containsKey("listaIndices")) {
      float[] listaIndices = (float[]) arguments.get("listaIndices");
      __result.set("listaIndices", listaIndices);
    }
    if (arguments.containsKey("posicionEnXOrden0")) {
      int posicionEnXOrden0 = (int) arguments.get("posicionEnXOrden0");
      __result.set("posicionEnXOrden0", posicionEnXOrden0);
    }
    if (arguments.containsKey("posicionEnXMaxBlue1")) {
      int posicionEnXMaxBlue1 = (int) arguments.get("posicionEnXMaxBlue1");
      __result.set("posicionEnXMaxBlue1", posicionEnXMaxBlue1);
    }
    if (arguments.containsKey("grisesSinMuestra")) {
      FloatMatrix grisesSinMuestra = (FloatMatrix) arguments.get("grisesSinMuestra");
      if (Parcelable.class.isAssignableFrom(FloatMatrix.class) || grisesSinMuestra == null) {
        __result.set("grisesSinMuestra", Parcelable.class.cast(grisesSinMuestra));
      } else if (Serializable.class.isAssignableFrom(FloatMatrix.class)) {
        __result.set("grisesSinMuestra", Serializable.class.cast(grisesSinMuestra));
      } else {
        throw new UnsupportedOperationException(FloatMatrix.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    if (arguments.containsKey("grisesConMuestra")) {
      FloatMatrix grisesConMuestra = (FloatMatrix) arguments.get("grisesConMuestra");
      if (Parcelable.class.isAssignableFrom(FloatMatrix.class) || grisesConMuestra == null) {
        __result.set("grisesConMuestra", Parcelable.class.cast(grisesConMuestra));
      } else if (Serializable.class.isAssignableFrom(FloatMatrix.class)) {
        __result.set("grisesConMuestra", Serializable.class.cast(grisesConMuestra));
      } else {
        throw new UnsupportedOperationException(FloatMatrix.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    if (arguments.containsKey("numberOfPictures")) {
      int numberOfPictures = (int) arguments.get("numberOfPictures");
      __result.set("numberOfPictures", numberOfPictures);
    }
    if (arguments.containsKey("exposureTime")) {
      long exposureTime = (long) arguments.get("exposureTime");
      __result.set("exposureTime", exposureTime);
    }
    if (arguments.containsKey("sensitivity")) {
      int sensitivity = (int) arguments.get("sensitivity");
      __result.set("sensitivity", sensitivity);
    }
    if (arguments.containsKey("focalDistance")) {
      float focalDistance = (float) arguments.get("focalDistance");
      __result.set("focalDistance", focalDistance);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    capturaArgs that = (capturaArgs) object;
    if (arguments.containsKey("bitmap") != that.arguments.containsKey("bitmap")) {
      return false;
    }
    if (getBitmap() != null ? !getBitmap().equals(that.getBitmap()) : that.getBitmap() != null) {
      return false;
    }
    if (arguments.containsKey("camera_id") != that.arguments.containsKey("camera_id")) {
      return false;
    }
    if (getCameraId() != null ? !getCameraId().equals(that.getCameraId()) : that.getCameraId() != null) {
      return false;
    }
    if (arguments.containsKey("pixel_format") != that.arguments.containsKey("pixel_format")) {
      return false;
    }
    if (getPixelFormat() != that.getPixelFormat()) {
      return false;
    }
    if (arguments.containsKey("blueOrder1") != that.arguments.containsKey("blueOrder1")) {
      return false;
    }
    if (getBlueOrder1() != null ? !getBlueOrder1().equals(that.getBlueOrder1()) : that.getBlueOrder1() != null) {
      return false;
    }
    if (arguments.containsKey("redOrder1") != that.arguments.containsKey("redOrder1")) {
      return false;
    }
    if (getRedOrder1() != null ? !getRedOrder1().equals(that.getRedOrder1()) : that.getRedOrder1() != null) {
      return false;
    }
    if (arguments.containsKey("greenOrder1") != that.arguments.containsKey("greenOrder1")) {
      return false;
    }
    if (getGreenOrder1() != null ? !getGreenOrder1().equals(that.getGreenOrder1()) : that.getGreenOrder1() != null) {
      return false;
    }
    if (arguments.containsKey("blueOrder2") != that.arguments.containsKey("blueOrder2")) {
      return false;
    }
    if (getBlueOrder2() != null ? !getBlueOrder2().equals(that.getBlueOrder2()) : that.getBlueOrder2() != null) {
      return false;
    }
    if (arguments.containsKey("redOrder2") != that.arguments.containsKey("redOrder2")) {
      return false;
    }
    if (getRedOrder2() != null ? !getRedOrder2().equals(that.getRedOrder2()) : that.getRedOrder2() != null) {
      return false;
    }
    if (arguments.containsKey("greenOrder2") != that.arguments.containsKey("greenOrder2")) {
      return false;
    }
    if (getGreenOrder2() != null ? !getGreenOrder2().equals(that.getGreenOrder2()) : that.getGreenOrder2() != null) {
      return false;
    }
    if (arguments.containsKey("listaIndices") != that.arguments.containsKey("listaIndices")) {
      return false;
    }
    if (getListaIndices() != null ? !getListaIndices().equals(that.getListaIndices()) : that.getListaIndices() != null) {
      return false;
    }
    if (arguments.containsKey("posicionEnXOrden0") != that.arguments.containsKey("posicionEnXOrden0")) {
      return false;
    }
    if (getPosicionEnXOrden0() != that.getPosicionEnXOrden0()) {
      return false;
    }
    if (arguments.containsKey("posicionEnXMaxBlue1") != that.arguments.containsKey("posicionEnXMaxBlue1")) {
      return false;
    }
    if (getPosicionEnXMaxBlue1() != that.getPosicionEnXMaxBlue1()) {
      return false;
    }
    if (arguments.containsKey("grisesSinMuestra") != that.arguments.containsKey("grisesSinMuestra")) {
      return false;
    }
    if (getGrisesSinMuestra() != null ? !getGrisesSinMuestra().equals(that.getGrisesSinMuestra()) : that.getGrisesSinMuestra() != null) {
      return false;
    }
    if (arguments.containsKey("grisesConMuestra") != that.arguments.containsKey("grisesConMuestra")) {
      return false;
    }
    if (getGrisesConMuestra() != null ? !getGrisesConMuestra().equals(that.getGrisesConMuestra()) : that.getGrisesConMuestra() != null) {
      return false;
    }
    if (arguments.containsKey("numberOfPictures") != that.arguments.containsKey("numberOfPictures")) {
      return false;
    }
    if (getNumberOfPictures() != that.getNumberOfPictures()) {
      return false;
    }
    if (arguments.containsKey("exposureTime") != that.arguments.containsKey("exposureTime")) {
      return false;
    }
    if (getExposureTime() != that.getExposureTime()) {
      return false;
    }
    if (arguments.containsKey("sensitivity") != that.arguments.containsKey("sensitivity")) {
      return false;
    }
    if (getSensitivity() != that.getSensitivity()) {
      return false;
    }
    if (arguments.containsKey("focalDistance") != that.arguments.containsKey("focalDistance")) {
      return false;
    }
    if (Float.compare(that.getFocalDistance(), getFocalDistance()) != 0) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getBitmap() != null ? getBitmap().hashCode() : 0);
    result = 31 * result + (getCameraId() != null ? getCameraId().hashCode() : 0);
    result = 31 * result + getPixelFormat();
    result = 31 * result + java.util.Arrays.hashCode(getBlueOrder1());
    result = 31 * result + java.util.Arrays.hashCode(getRedOrder1());
    result = 31 * result + java.util.Arrays.hashCode(getGreenOrder1());
    result = 31 * result + java.util.Arrays.hashCode(getBlueOrder2());
    result = 31 * result + java.util.Arrays.hashCode(getRedOrder2());
    result = 31 * result + java.util.Arrays.hashCode(getGreenOrder2());
    result = 31 * result + java.util.Arrays.hashCode(getListaIndices());
    result = 31 * result + getPosicionEnXOrden0();
    result = 31 * result + getPosicionEnXMaxBlue1();
    result = 31 * result + (getGrisesSinMuestra() != null ? getGrisesSinMuestra().hashCode() : 0);
    result = 31 * result + (getGrisesConMuestra() != null ? getGrisesConMuestra().hashCode() : 0);
    result = 31 * result + getNumberOfPictures();
    result = 31 * result + (int)(getExposureTime() ^ (getExposureTime() >>> 32));
    result = 31 * result + getSensitivity();
    result = 31 * result + Float.floatToIntBits(getFocalDistance());
    return result;
  }

  @Override
  public String toString() {
    return "capturaArgs{"
        + "bitmap=" + getBitmap()
        + ", cameraId=" + getCameraId()
        + ", pixelFormat=" + getPixelFormat()
        + ", blueOrder1=" + getBlueOrder1()
        + ", redOrder1=" + getRedOrder1()
        + ", greenOrder1=" + getGreenOrder1()
        + ", blueOrder2=" + getBlueOrder2()
        + ", redOrder2=" + getRedOrder2()
        + ", greenOrder2=" + getGreenOrder2()
        + ", listaIndices=" + getListaIndices()
        + ", posicionEnXOrden0=" + getPosicionEnXOrden0()
        + ", posicionEnXMaxBlue1=" + getPosicionEnXMaxBlue1()
        + ", grisesSinMuestra=" + getGrisesSinMuestra()
        + ", grisesConMuestra=" + getGrisesConMuestra()
        + ", numberOfPictures=" + getNumberOfPictures()
        + ", exposureTime=" + getExposureTime()
        + ", sensitivity=" + getSensitivity()
        + ", focalDistance=" + getFocalDistance()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull capturaArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Bitmap bitmap, @NonNull String cameraId, int pixelFormat,
        @NonNull float[] blueOrder1, @NonNull float[] redOrder1, @NonNull float[] greenOrder1,
        @NonNull float[] blueOrder2, @NonNull float[] redOrder2, @NonNull float[] greenOrder2,
        @NonNull float[] listaIndices, int posicionEnXOrden0, int posicionEnXMaxBlue1,
        @NonNull FloatMatrix grisesSinMuestra, @NonNull FloatMatrix grisesConMuestra,
        int numberOfPictures, long exposureTime, int sensitivity, float focalDistance) {
      if (bitmap == null) {
        throw new IllegalArgumentException("Argument \"bitmap\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bitmap", bitmap);
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      this.arguments.put("pixel_format", pixelFormat);
      if (blueOrder1 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder1\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueOrder1", blueOrder1);
      if (redOrder1 == null) {
        throw new IllegalArgumentException("Argument \"redOrder1\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("redOrder1", redOrder1);
      if (greenOrder1 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder1\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("greenOrder1", greenOrder1);
      if (blueOrder2 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueOrder2", blueOrder2);
      if (redOrder2 == null) {
        throw new IllegalArgumentException("Argument \"redOrder2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("redOrder2", redOrder2);
      if (greenOrder2 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("greenOrder2", greenOrder2);
      if (listaIndices == null) {
        throw new IllegalArgumentException("Argument \"listaIndices\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("listaIndices", listaIndices);
      this.arguments.put("posicionEnXOrden0", posicionEnXOrden0);
      this.arguments.put("posicionEnXMaxBlue1", posicionEnXMaxBlue1);
      if (grisesSinMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesSinMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesSinMuestra", grisesSinMuestra);
      if (grisesConMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesConMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesConMuestra", grisesConMuestra);
      this.arguments.put("numberOfPictures", numberOfPictures);
      this.arguments.put("exposureTime", exposureTime);
      this.arguments.put("sensitivity", sensitivity);
      this.arguments.put("focalDistance", focalDistance);
    }

    @NonNull
    public capturaArgs build() {
      capturaArgs result = new capturaArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setBitmap(@NonNull Bitmap bitmap) {
      if (bitmap == null) {
        throw new IllegalArgumentException("Argument \"bitmap\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bitmap", bitmap);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setCameraId(@NonNull String cameraId) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPixelFormat(int pixelFormat) {
      this.arguments.put("pixel_format", pixelFormat);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setBlueOrder1(@NonNull float[] blueOrder1) {
      if (blueOrder1 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder1\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueOrder1", blueOrder1);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setRedOrder1(@NonNull float[] redOrder1) {
      if (redOrder1 == null) {
        throw new IllegalArgumentException("Argument \"redOrder1\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("redOrder1", redOrder1);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setGreenOrder1(@NonNull float[] greenOrder1) {
      if (greenOrder1 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder1\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("greenOrder1", greenOrder1);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setBlueOrder2(@NonNull float[] blueOrder2) {
      if (blueOrder2 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueOrder2", blueOrder2);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setRedOrder2(@NonNull float[] redOrder2) {
      if (redOrder2 == null) {
        throw new IllegalArgumentException("Argument \"redOrder2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("redOrder2", redOrder2);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setGreenOrder2(@NonNull float[] greenOrder2) {
      if (greenOrder2 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("greenOrder2", greenOrder2);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setListaIndices(@NonNull float[] listaIndices) {
      if (listaIndices == null) {
        throw new IllegalArgumentException("Argument \"listaIndices\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("listaIndices", listaIndices);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPosicionEnXOrden0(int posicionEnXOrden0) {
      this.arguments.put("posicionEnXOrden0", posicionEnXOrden0);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPosicionEnXMaxBlue1(int posicionEnXMaxBlue1) {
      this.arguments.put("posicionEnXMaxBlue1", posicionEnXMaxBlue1);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setGrisesSinMuestra(@NonNull FloatMatrix grisesSinMuestra) {
      if (grisesSinMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesSinMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesSinMuestra", grisesSinMuestra);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setGrisesConMuestra(@NonNull FloatMatrix grisesConMuestra) {
      if (grisesConMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesConMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesConMuestra", grisesConMuestra);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNumberOfPictures(int numberOfPictures) {
      this.arguments.put("numberOfPictures", numberOfPictures);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setExposureTime(long exposureTime) {
      this.arguments.put("exposureTime", exposureTime);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setSensitivity(int sensitivity) {
      this.arguments.put("sensitivity", sensitivity);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setFocalDistance(float focalDistance) {
      this.arguments.put("focalDistance", focalDistance);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Bitmap getBitmap() {
      return (Bitmap) arguments.get("bitmap");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getCameraId() {
      return (String) arguments.get("camera_id");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getPixelFormat() {
      return (int) arguments.get("pixel_format");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public float[] getBlueOrder1() {
      return (float[]) arguments.get("blueOrder1");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public float[] getRedOrder1() {
      return (float[]) arguments.get("redOrder1");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public float[] getGreenOrder1() {
      return (float[]) arguments.get("greenOrder1");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public float[] getBlueOrder2() {
      return (float[]) arguments.get("blueOrder2");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public float[] getRedOrder2() {
      return (float[]) arguments.get("redOrder2");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public float[] getGreenOrder2() {
      return (float[]) arguments.get("greenOrder2");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public float[] getListaIndices() {
      return (float[]) arguments.get("listaIndices");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getPosicionEnXOrden0() {
      return (int) arguments.get("posicionEnXOrden0");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getPosicionEnXMaxBlue1() {
      return (int) arguments.get("posicionEnXMaxBlue1");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public FloatMatrix getGrisesSinMuestra() {
      return (FloatMatrix) arguments.get("grisesSinMuestra");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public FloatMatrix getGrisesConMuestra() {
      return (FloatMatrix) arguments.get("grisesConMuestra");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getNumberOfPictures() {
      return (int) arguments.get("numberOfPictures");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public long getExposureTime() {
      return (long) arguments.get("exposureTime");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getSensitivity() {
      return (int) arguments.get("sensitivity");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public float getFocalDistance() {
      return (float) arguments.get("focalDistance");
    }
  }
}
