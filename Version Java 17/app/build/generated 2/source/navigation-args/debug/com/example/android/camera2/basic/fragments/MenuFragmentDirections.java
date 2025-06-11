package com.example.android.camera2.basic.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.example.android.camera2.basic.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MenuFragmentDirections {
  private MenuFragmentDirections() {
  }

  @NonNull
  public static ActionMenuFragmentToMedirAbsorbanciaTest actionMenuFragmentToMedirAbsorbanciaTest(
      @NonNull String cameraId, int pixelFormat, int numberOfPictures, long exposureTime,
      int sensitivity, float focalDistance) {
    return new ActionMenuFragmentToMedirAbsorbanciaTest(cameraId, pixelFormat, numberOfPictures, exposureTime, sensitivity, focalDistance);
  }

  public static class ActionMenuFragmentToMedirAbsorbanciaTest implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionMenuFragmentToMedirAbsorbanciaTest(@NonNull String cameraId, int pixelFormat,
        int numberOfPictures, long exposureTime, int sensitivity, float focalDistance) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      this.arguments.put("pixel_format", pixelFormat);
      this.arguments.put("numberOfPictures", numberOfPictures);
      this.arguments.put("exposureTime", exposureTime);
      this.arguments.put("sensitivity", sensitivity);
      this.arguments.put("focalDistance", focalDistance);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMenuFragmentToMedirAbsorbanciaTest setCameraId(@NonNull String cameraId) {
      if (cameraId == null) {
        throw new IllegalArgumentException("Argument \"camera_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("camera_id", cameraId);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMenuFragmentToMedirAbsorbanciaTest setPixelFormat(int pixelFormat) {
      this.arguments.put("pixel_format", pixelFormat);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMenuFragmentToMedirAbsorbanciaTest setNumberOfPictures(int numberOfPictures) {
      this.arguments.put("numberOfPictures", numberOfPictures);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMenuFragmentToMedirAbsorbanciaTest setExposureTime(long exposureTime) {
      this.arguments.put("exposureTime", exposureTime);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMenuFragmentToMedirAbsorbanciaTest setSensitivity(int sensitivity) {
      this.arguments.put("sensitivity", sensitivity);
      return this;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMenuFragmentToMedirAbsorbanciaTest setFocalDistance(float focalDistance) {
      this.arguments.put("focalDistance", focalDistance);
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

    @Override
    public int getActionId() {
      return R.id.actionMenuFragmentToMedirAbsorbanciaTest;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMenuFragmentToMedirAbsorbanciaTest that = (ActionMenuFragmentToMedirAbsorbanciaTest) object;
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
      result = 31 * result + getNumberOfPictures();
      result = 31 * result + (int)(getExposureTime() ^ (getExposureTime() >>> 32));
      result = 31 * result + getSensitivity();
      result = 31 * result + Float.floatToIntBits(getFocalDistance());
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMenuFragmentToMedirAbsorbanciaTest(actionId=" + getActionId() + "){"
          + "cameraId=" + getCameraId()
          + ", pixelFormat=" + getPixelFormat()
          + ", numberOfPictures=" + getNumberOfPictures()
          + ", exposureTime=" + getExposureTime()
          + ", sensitivity=" + getSensitivity()
          + ", focalDistance=" + getFocalDistance()
          + "}";
    }
  }
}
