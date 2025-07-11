// Generated by view binder compiler. Do not edit!
package com.example.android.camera2.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android.camera2.basic.R;
import com.github.mikephil.charting.charts.LineChart;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FiguresFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final ImageButton botonContinuar;

  @NonNull
  public final LineChart intensityChart;

  @NonNull
  public final ConstraintLayout relativeLayout;

  private FiguresFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton backButton, @NonNull ImageButton botonContinuar,
      @NonNull LineChart intensityChart, @NonNull ConstraintLayout relativeLayout) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.botonContinuar = botonContinuar;
    this.intensityChart = intensityChart;
    this.relativeLayout = relativeLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FiguresFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FiguresFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.figures_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FiguresFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backButton;
      ImageButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.botonContinuar;
      ImageButton botonContinuar = ViewBindings.findChildViewById(rootView, id);
      if (botonContinuar == null) {
        break missingId;
      }

      id = R.id.intensity_chart;
      LineChart intensityChart = ViewBindings.findChildViewById(rootView, id);
      if (intensityChart == null) {
        break missingId;
      }

      ConstraintLayout relativeLayout = (ConstraintLayout) rootView;

      return new FiguresFragmentBinding((ConstraintLayout) rootView, backButton, botonContinuar,
          intensityChart, relativeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
