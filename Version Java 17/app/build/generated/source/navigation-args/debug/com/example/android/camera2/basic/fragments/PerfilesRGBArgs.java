package com.example.android.camera2.basic.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.System;
import java.util.HashMap;

public class PerfilesRGBArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PerfilesRGBArgs() {
  }

  @SuppressWarnings("unchecked")
  private PerfilesRGBArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static PerfilesRGBArgs fromBundle(@NonNull Bundle bundle) {
    PerfilesRGBArgs __result = new PerfilesRGBArgs();
    bundle.setClassLoader(PerfilesRGBArgs.class.getClassLoader());
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
    if (bundle.containsKey("grisesSinMuestra")) {
      mutableListOf<mutableListOf<Float>>[] grisesSinMuestra;
      Parcelable[] __array = bundle.getParcelableArray("grisesSinMuestra");
      if (__array != null) {
        grisesSinMuestra = new mutableListOf<mutableListOf<Float>>[__array.length];
        System.arraycopy(__array, 0, grisesSinMuestra, 0, __array.length);
      } else {
        grisesSinMuestra = null;
      }
      if (grisesSinMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesSinMuestra\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("grisesSinMuestra", grisesSinMuestra);
    } else {
      throw new IllegalArgumentException("Required argument \"grisesSinMuestra\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("grisesConMuestra")) {
      mutableListOf<mutableListOf<Float>>[] grisesConMuestra;
      Parcelable[] __array = bundle.getParcelableArray("grisesConMuestra");
      if (__array != null) {
        grisesConMuestra = new mutableListOf<mutableListOf<Float>>[__array.length];
        System.arraycopy(__array, 0, grisesConMuestra, 0, __array.length);
      } else {
        grisesConMuestra = null;
      }
      if (grisesConMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesConMuestra\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("grisesConMuestra", grisesConMuestra);
    } else {
      throw new IllegalArgumentException("Required argument \"grisesConMuestra\" is missing and does not have an android:defaultValue");
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
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PerfilesRGBArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    PerfilesRGBArgs __result = new PerfilesRGBArgs();
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
    if (savedStateHandle.contains("grisesSinMuestra")) {
      mutableListOf<mutableListOf<Float>>[] grisesSinMuestra;
      grisesSinMuestra = savedStateHandle.get("grisesSinMuestra");
      if (grisesSinMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesSinMuestra\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("grisesSinMuestra", grisesSinMuestra);
    } else {
      throw new IllegalArgumentException("Required argument \"grisesSinMuestra\" is missing and does not have an android:defaultValue");
    }
    if (savedStateHandle.contains("grisesConMuestra")) {
      mutableListOf<mutableListOf<Float>>[] grisesConMuestra;
      grisesConMuestra = savedStateHandle.get("grisesConMuestra");
      if (grisesConMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesConMuestra\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("grisesConMuestra", grisesConMuestra);
    } else {
      throw new IllegalArgumentException("Required argument \"grisesConMuestra\" is missing and does not have an android:defaultValue");
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
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getCameraId() {
    return (String) arguments.get("camera_id");
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
  public mutableListOf<mutableListOf<Float>>[] getGrisesSinMuestra() {
    return (mutableListOf<mutableListOf<Float>>[]) arguments.get("grisesSinMuestra");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public mutableListOf<mutableListOf<Float>>[] getGrisesConMuestra() {
    return (mutableListOf<mutableListOf<Float>>[]) arguments.get("grisesConMuestra");
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
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("camera_id")) {
      String cameraId = (String) arguments.get("camera_id");
      __result.putString("camera_id", cameraId);
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
    if (arguments.containsKey("grisesSinMuestra")) {
      mutableListOf<mutableListOf<Float>>[] grisesSinMuestra = (mutableListOf<mutableListOf<Float>>[]) arguments.get("grisesSinMuestra");
      __result.putParcelableArray("grisesSinMuestra", grisesSinMuestra);
    }
    if (arguments.containsKey("grisesConMuestra")) {
      mutableListOf<mutableListOf<Float>>[] grisesConMuestra = (mutableListOf<mutableListOf<Float>>[]) arguments.get("grisesConMuestra");
      __result.putParcelableArray("grisesConMuestra", grisesConMuestra);
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
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("camera_id")) {
      String cameraId = (String) arguments.get("camera_id");
      __result.set("camera_id", cameraId);
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
    if (arguments.containsKey("grisesSinMuestra")) {
      mutableListOf<mutableListOf<Float>>[] grisesSinMuestra = (mutableListOf<mutableListOf<Float>>[]) arguments.get("grisesSinMuestra");
      __result.set("grisesSinMuestra", grisesSinMuestra);
    }
    if (arguments.containsKey("grisesConMuestra")) {
      mutableListOf<mutableListOf<Float>>[] grisesConMuestra = (mutableListOf<mutableListOf<Float>>[]) arguments.get("grisesConMuestra");
      __result.set("grisesConMuestra", grisesConMuestra);
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
    PerfilesRGBArgs that = (PerfilesRGBArgs) object;
    if (arguments.containsKey("camera_id") != that.arguments.containsKey("camera_id")) {
      return false;
    }
    if (getCameraId() != null ? !getCameraId().equals(that.getCameraId()) : that.getCameraId() != null) {
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
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCameraId() != null ? getCameraId().hashCode() : 0);
    result = 31 * result + java.util.Arrays.hashCode(getBlueOrder1());
    result = 31 * result + java.util.Arrays.hashCode(getRedOrder1());
    result = 31 * result + java.util.Arrays.hashCode(getGreenOrder1());
    result = 31 * result + java.util.Arrays.hashCode(getGrisesSinMuestra());
    result = 31 * result + java.util.Arrays.hashCode(getGrisesConMuestra());
    result = 31 * result + java.util.Arrays.hashCode(getBlueOrder2());
    result = 31 * result + java.util.Arrays.hashCode(getRedOrder2());
    result = 31 * result + java.util.Arrays.hashCode(getGreenOrder2());
    result = 31 * result + java.util.Arrays.hashCode(getListaIndices());
    result = 31 * result + getPosicionEnXOrden0();
    result = 31 * result + getPosicionEnXMaxBlue1();
    return result;
  }

  @Override
  public String toString() {
    return "PerfilesRGBArgs{"
        + "cameraId=" + getCameraId()
        + ", blueOrder1=" + getBlueOrder1()
        + ", redOrder1=" + getRedOrder1()
        + ", greenOrder1=" + getGreenOrder1()
        + ", grisesSinMuestra=" + getGrisesSinMuestra()
        + ", grisesConMuestra=" + getGrisesConMuestra()
        + ", blueOrder2=" + getBlueOrder2()
        + ", redOrder2=" + getRedOrder2()
        + ", greenOrder2=" + getGreenOrder2()
        + ", listaIndices=" + getListaIndices()
        + ", posicionEnXOrden0=" + getPosicionEnXOrden0()
        + ", posicionEnXMaxBlue1=" + getPosicionEnXMaxBlue1()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull PerfilesRGBArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String cameraId, @NonNull float[] blueOrder1,
        @NonNull float[] redOrder1, @NonNull float[] greenOrder1,
        @NonNull mutableListOf<mutableListOf<Float>>[] grisesSinMuestra,
        @NonNull mutableListOf<mutableListOf<Float>>[] grisesConMuestra,
        @NonNull float[] blueOrder2, @NonNull float[] redOrder2, @NonNull float[] greenOrder2,
        @NonNull float[] listaIndices, int posicionEnXOrden0, int posicionEnXMaxBlue1) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
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
      if (grisesSinMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesSinMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesSinMuestra", grisesSinMuestra);
      if (grisesConMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesConMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesConMuestra", grisesConMuestra);
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
    }

    @NonNull
    public PerfilesRGBArgs build() {
      PerfilesRGBArgs result = new PerfilesRGBArgs(arguments);
      return result;
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
    public Builder setGrisesSinMuestra(
        @NonNull mutableListOf<mutableListOf<Float>>[] grisesSinMuestra) {
      if (grisesSinMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesSinMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesSinMuestra", grisesSinMuestra);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setGrisesConMuestra(
        @NonNull mutableListOf<mutableListOf<Float>>[] grisesConMuestra) {
      if (grisesConMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesConMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesConMuestra", grisesConMuestra);
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

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getCameraId() {
      return (String) arguments.get("camera_id");
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
    public mutableListOf<mutableListOf<Float>>[] getGrisesSinMuestra() {
      return (mutableListOf<mutableListOf<Float>>[]) arguments.get("grisesSinMuestra");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public mutableListOf<mutableListOf<Float>>[] getGrisesConMuestra() {
      return (mutableListOf<mutableListOf<Float>>[]) arguments.get("grisesConMuestra");
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
  }
}
