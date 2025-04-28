package com.example.android.camera2.basic.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.android.camera2.basic.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CameraFragmentDirections {
  private CameraFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCameraToPermissions() {
    return new ActionOnlyNavDirections(R.id.action_camera_to_permissions);
  }

  @NonNull
  public static ActionCameraFragmentToImagenEspectroFragment actionCameraFragmentToImagenEspectroFragment(
      @NonNull int[] datosX, @NonNull float[] datosL, @NonNull float[] datosR,
      @NonNull float[] datosG, @NonNull float[] datosB) {
    return new ActionCameraFragmentToImagenEspectroFragment(datosX, datosL, datosR, datosG, datosB);
  }

  public static class ActionCameraFragmentToImagenEspectroFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionCameraFragmentToImagenEspectroFragment(@NonNull int[] datosX,
        @NonNull float[] datosL, @NonNull float[] datosR, @NonNull float[] datosG,
        @NonNull float[] datosB) {
      if (datosX == null) {
        throw new IllegalArgumentException("Argument \"datosX\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosX", datosX);
      if (datosL == null) {
        throw new IllegalArgumentException("Argument \"datosL\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosL", datosL);
      if (datosR == null) {
        throw new IllegalArgumentException("Argument \"datosR\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosR", datosR);
      if (datosG == null) {
        throw new IllegalArgumentException("Argument \"datosG\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosG", datosG);
      if (datosB == null) {
        throw new IllegalArgumentException("Argument \"datosB\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosB", datosB);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCameraFragmentToImagenEspectroFragment setDatosX(@NonNull int[] datosX) {
      if (datosX == null) {
        throw new IllegalArgumentException("Argument \"datosX\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosX", datosX);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCameraFragmentToImagenEspectroFragment setDatosL(@NonNull float[] datosL) {
      if (datosL == null) {
        throw new IllegalArgumentException("Argument \"datosL\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosL", datosL);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCameraFragmentToImagenEspectroFragment setDatosR(@NonNull float[] datosR) {
      if (datosR == null) {
        throw new IllegalArgumentException("Argument \"datosR\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosR", datosR);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCameraFragmentToImagenEspectroFragment setDatosG(@NonNull float[] datosG) {
      if (datosG == null) {
        throw new IllegalArgumentException("Argument \"datosG\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosG", datosG);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCameraFragmentToImagenEspectroFragment setDatosB(@NonNull float[] datosB) {
      if (datosB == null) {
        throw new IllegalArgumentException("Argument \"datosB\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("datosB", datosB);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("datosX")) {
        int[] datosX = (int[]) arguments.get("datosX");
        __result.putIntArray("datosX", datosX);
      }
      if (arguments.containsKey("datosL")) {
        float[] datosL = (float[]) arguments.get("datosL");
        __result.putFloatArray("datosL", datosL);
      }
      if (arguments.containsKey("datosR")) {
        float[] datosR = (float[]) arguments.get("datosR");
        __result.putFloatArray("datosR", datosR);
      }
      if (arguments.containsKey("datosG")) {
        float[] datosG = (float[]) arguments.get("datosG");
        __result.putFloatArray("datosG", datosG);
      }
      if (arguments.containsKey("datosB")) {
        float[] datosB = (float[]) arguments.get("datosB");
        __result.putFloatArray("datosB", datosB);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_camera_fragment_to_imagenEspectroFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public int[] getDatosX() {
      return (int[]) arguments.get("datosX");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public float[] getDatosL() {
      return (float[]) arguments.get("datosL");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public float[] getDatosR() {
      return (float[]) arguments.get("datosR");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public float[] getDatosG() {
      return (float[]) arguments.get("datosG");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public float[] getDatosB() {
      return (float[]) arguments.get("datosB");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCameraFragmentToImagenEspectroFragment that = (ActionCameraFragmentToImagenEspectroFragment) object;
      if (arguments.containsKey("datosX") != that.arguments.containsKey("datosX")) {
        return false;
      }
      if (getDatosX() != null ? !getDatosX().equals(that.getDatosX()) : that.getDatosX() != null) {
        return false;
      }
      if (arguments.containsKey("datosL") != that.arguments.containsKey("datosL")) {
        return false;
      }
      if (getDatosL() != null ? !getDatosL().equals(that.getDatosL()) : that.getDatosL() != null) {
        return false;
      }
      if (arguments.containsKey("datosR") != that.arguments.containsKey("datosR")) {
        return false;
      }
      if (getDatosR() != null ? !getDatosR().equals(that.getDatosR()) : that.getDatosR() != null) {
        return false;
      }
      if (arguments.containsKey("datosG") != that.arguments.containsKey("datosG")) {
        return false;
      }
      if (getDatosG() != null ? !getDatosG().equals(that.getDatosG()) : that.getDatosG() != null) {
        return false;
      }
      if (arguments.containsKey("datosB") != that.arguments.containsKey("datosB")) {
        return false;
      }
      if (getDatosB() != null ? !getDatosB().equals(that.getDatosB()) : that.getDatosB() != null) {
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
      result = 31 * result + java.util.Arrays.hashCode(getDatosX());
      result = 31 * result + java.util.Arrays.hashCode(getDatosL());
      result = 31 * result + java.util.Arrays.hashCode(getDatosR());
      result = 31 * result + java.util.Arrays.hashCode(getDatosG());
      result = 31 * result + java.util.Arrays.hashCode(getDatosB());
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionCameraFragmentToImagenEspectroFragment(actionId=" + getActionId() + "){"
          + "datosX=" + getDatosX()
          + ", datosL=" + getDatosL()
          + ", datosR=" + getDatosR()
          + ", datosG=" + getDatosG()
          + ", datosB=" + getDatosB()
          + "}";
    }
  }
}
