package com.example.android.camera2.basic.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.camera2.basic.R;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class PerfilesRGBDirections {
  private PerfilesRGBDirections() {
  }

  @NonNull
  public static ActionPerfilesToMenuFragment actionPerfilesToMenuFragment(@NonNull String cameraId,
      int pixelFormat) {
    return new ActionPerfilesToMenuFragment(cameraId, pixelFormat);
  }

  @NonNull
  public static ActionPerfilesToFiguresFragment actionPerfilesToFiguresFragment(
      @NonNull String cameraId, @NonNull float[] blueOrder1, @NonNull float[] redOrder1,
      @NonNull float[] greenOrder1, @NonNull FloatMatrix grisesSinMuestra,
      @NonNull FloatMatrix grisesConMuestra, @NonNull float[] blueOrder2,
      @NonNull float[] redOrder2, @NonNull float[] greenOrder2, @NonNull float[] listaIndices,
      int posicionEnXOrden0, int posicionEnXMaxBlue1) {
    return new ActionPerfilesToFiguresFragment(cameraId, blueOrder1, redOrder1, greenOrder1, grisesSinMuestra, grisesConMuestra, blueOrder2, redOrder2, greenOrder2, listaIndices, posicionEnXOrden0, posicionEnXMaxBlue1);
  }

  public static class ActionPerfilesToMenuFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionPerfilesToMenuFragment(@NonNull String cameraId, int pixelFormat) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      this.arguments.put("pixel_format", pixelFormat);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToMenuFragment setCameraId(@NonNull String cameraId) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToMenuFragment setPixelFormat(int pixelFormat) {
      this.arguments.put("pixel_format", pixelFormat);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("camera_id")) {
        String cameraId = (String) arguments.get("camera_id");
        __result.putString("camera_id", cameraId);
      }
      if (arguments.containsKey("pixel_format")) {
        int pixelFormat = (int) arguments.get("pixel_format");
        __result.putInt("pixel_format", pixelFormat);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_perfiles_to_menuFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionPerfilesToMenuFragment that = (ActionPerfilesToMenuFragment) object;
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
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getCameraId() != null ? getCameraId().hashCode() : 0);
      result = 31 * result + getPixelFormat();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionPerfilesToMenuFragment(actionId=" + getActionId() + "){"
          + "cameraId=" + getCameraId()
          + ", pixelFormat=" + getPixelFormat()
          + "}";
    }
  }

  public static class ActionPerfilesToFiguresFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionPerfilesToFiguresFragment(@NonNull String cameraId, @NonNull float[] blueOrder1,
        @NonNull float[] redOrder1, @NonNull float[] greenOrder1,
        @NonNull FloatMatrix grisesSinMuestra, @NonNull FloatMatrix grisesConMuestra,
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
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setCameraId(@NonNull String cameraId) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setBlueOrder1(@NonNull float[] blueOrder1) {
      if (blueOrder1 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder1\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueOrder1", blueOrder1);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setRedOrder1(@NonNull float[] redOrder1) {
      if (redOrder1 == null) {
        throw new IllegalArgumentException("Argument \"redOrder1\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("redOrder1", redOrder1);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setGreenOrder1(@NonNull float[] greenOrder1) {
      if (greenOrder1 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder1\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("greenOrder1", greenOrder1);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setGrisesSinMuestra(
        @NonNull FloatMatrix grisesSinMuestra) {
      if (grisesSinMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesSinMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesSinMuestra", grisesSinMuestra);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setGrisesConMuestra(
        @NonNull FloatMatrix grisesConMuestra) {
      if (grisesConMuestra == null) {
        throw new IllegalArgumentException("Argument \"grisesConMuestra\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("grisesConMuestra", grisesConMuestra);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setBlueOrder2(@NonNull float[] blueOrder2) {
      if (blueOrder2 == null) {
        throw new IllegalArgumentException("Argument \"blueOrder2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("blueOrder2", blueOrder2);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setRedOrder2(@NonNull float[] redOrder2) {
      if (redOrder2 == null) {
        throw new IllegalArgumentException("Argument \"redOrder2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("redOrder2", redOrder2);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setGreenOrder2(@NonNull float[] greenOrder2) {
      if (greenOrder2 == null) {
        throw new IllegalArgumentException("Argument \"greenOrder2\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("greenOrder2", greenOrder2);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setListaIndices(@NonNull float[] listaIndices) {
      if (listaIndices == null) {
        throw new IllegalArgumentException("Argument \"listaIndices\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("listaIndices", listaIndices);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setPosicionEnXOrden0(int posicionEnXOrden0) {
      this.arguments.put("posicionEnXOrden0", posicionEnXOrden0);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionPerfilesToFiguresFragment setPosicionEnXMaxBlue1(int posicionEnXMaxBlue1) {
      this.arguments.put("posicionEnXMaxBlue1", posicionEnXMaxBlue1);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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

    @Override
    public int getActionId() {
      return R.id.action_perfiles_to_figuresFragment;
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
    public FloatMatrix getGrisesSinMuestra() {
      return (FloatMatrix) arguments.get("grisesSinMuestra");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public FloatMatrix getGrisesConMuestra() {
      return (FloatMatrix) arguments.get("grisesConMuestra");
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionPerfilesToFiguresFragment that = (ActionPerfilesToFiguresFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + (getGrisesSinMuestra() != null ? getGrisesSinMuestra().hashCode() : 0);
      result = 31 * result + (getGrisesConMuestra() != null ? getGrisesConMuestra().hashCode() : 0);
      result = 31 * result + java.util.Arrays.hashCode(getBlueOrder2());
      result = 31 * result + java.util.Arrays.hashCode(getRedOrder2());
      result = 31 * result + java.util.Arrays.hashCode(getGreenOrder2());
      result = 31 * result + java.util.Arrays.hashCode(getListaIndices());
      result = 31 * result + getPosicionEnXOrden0();
      result = 31 * result + getPosicionEnXMaxBlue1();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionPerfilesToFiguresFragment(actionId=" + getActionId() + "){"
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
  }
}
