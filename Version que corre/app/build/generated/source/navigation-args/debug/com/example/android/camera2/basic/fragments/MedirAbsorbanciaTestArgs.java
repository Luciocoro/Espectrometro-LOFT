package com.example.android.camera2.basic.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MedirAbsorbanciaTestArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private MedirAbsorbanciaTestArgs() {
  }

  @SuppressWarnings("unchecked")
  private MedirAbsorbanciaTestArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static MedirAbsorbanciaTestArgs fromBundle(@NonNull Bundle bundle) {
    MedirAbsorbanciaTestArgs __result = new MedirAbsorbanciaTestArgs();
    bundle.setClassLoader(MedirAbsorbanciaTestArgs.class.getClassLoader());
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
  public static MedirAbsorbanciaTestArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    MedirAbsorbanciaTestArgs __result = new MedirAbsorbanciaTestArgs();
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

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("camera_id")) {
      String cameraId = (String) arguments.get("camera_id");
      __result.set("camera_id", cameraId);
    }
    if (arguments.containsKey("pixel_format")) {
      int pixelFormat = (int) arguments.get("pixel_format");
      __result.set("pixel_format", pixelFormat);
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
    MedirAbsorbanciaTestArgs that = (MedirAbsorbanciaTestArgs) object;
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
    return result;
  }

  @Override
  public String toString() {
    return "MedirAbsorbanciaTestArgs{"
        + "cameraId=" + getCameraId()
        + ", pixelFormat=" + getPixelFormat()
        + ", numberOfPictures=" + getNumberOfPictures()
        + ", exposureTime=" + getExposureTime()
        + ", sensitivity=" + getSensitivity()
        + ", focalDistance=" + getFocalDistance()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull MedirAbsorbanciaTestArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull String cameraId, int pixelFormat, int numberOfPictures,
        long exposureTime, int sensitivity, float focalDistance) {
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
    public MedirAbsorbanciaTestArgs build() {
      MedirAbsorbanciaTestArgs result = new MedirAbsorbanciaTestArgs(arguments);
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
    public Builder setPixelFormat(int pixelFormat) {
      this.arguments.put("pixel_format", pixelFormat);
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
    public String getCameraId() {
      return (String) arguments.get("camera_id");
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public int getPixelFormat() {
      return (int) arguments.get("pixel_format");
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
