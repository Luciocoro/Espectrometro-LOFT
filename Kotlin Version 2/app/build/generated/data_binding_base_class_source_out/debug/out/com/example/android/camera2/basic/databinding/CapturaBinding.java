// Generated by view binder compiler. Do not edit!
package com.example.android.camera2.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android.camera2.basic.R;
import com.jjoe64.graphview.GraphView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CapturaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton botonContinuar;

  @NonNull
  public final ImageButton botonRetroceder;

  @NonNull
  public final GraphView graph;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ConstraintLayout layoutcaptura;

  private CapturaBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton botonContinuar,
      @NonNull ImageButton botonRetroceder, @NonNull GraphView graph, @NonNull ImageView imageView,
      @NonNull ConstraintLayout layoutcaptura) {
    this.rootView = rootView;
    this.botonContinuar = botonContinuar;
    this.botonRetroceder = botonRetroceder;
    this.graph = graph;
    this.imageView = imageView;
    this.layoutcaptura = layoutcaptura;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CapturaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CapturaBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.captura, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CapturaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.botonContinuar;
      ImageButton botonContinuar = ViewBindings.findChildViewById(rootView, id);
      if (botonContinuar == null) {
        break missingId;
      }

      id = R.id.botonRetroceder;
      ImageButton botonRetroceder = ViewBindings.findChildViewById(rootView, id);
      if (botonRetroceder == null) {
        break missingId;
      }

      id = R.id.graph;
      GraphView graph = ViewBindings.findChildViewById(rootView, id);
      if (graph == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      ConstraintLayout layoutcaptura = (ConstraintLayout) rootView;

      return new CapturaBinding((ConstraintLayout) rootView, botonContinuar, botonRetroceder, graph,
          imageView, layoutcaptura);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
