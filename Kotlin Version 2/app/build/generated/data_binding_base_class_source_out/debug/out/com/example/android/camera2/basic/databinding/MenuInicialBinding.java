// Generated by view binder compiler. Do not edit!
package com.example.android.camera2.basic.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android.camera2.basic.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import pl.droidsonroids.gif.GifImageView;

public final class MenuInicialBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button AutoRotar;

  @NonNull
  public final GifImageView GIFwave;

  @NonNull
  public final EditText LED;

  @NonNull
  public final ImageView LogoLoft;

  @NonNull
  public final Button MedirAbsorbanciaTest;

  @NonNull
  public final Button Titulo;

  @NonNull
  public final Button botonPrueba;

  @NonNull
  public final Button botonPruebas;

  @NonNull
  public final EditText distfocal;

  @NonNull
  public final ConstraintLayout layoutMenuFragment;

  @NonNull
  public final TextView linkLOFT;

  @NonNull
  public final TextView marcoinferior;

  @NonNull
  public final EditText nrofotos;

  @NonNull
  public final EditText sensibilidad;

  @NonNull
  public final Switch switch1;

  @NonNull
  public final EditText texposicion2;

  @NonNull
  public final TextView valoresPermitidos;

  private MenuInicialBinding(@NonNull ConstraintLayout rootView, @NonNull Button AutoRotar,
      @NonNull GifImageView GIFwave, @NonNull EditText LED, @NonNull ImageView LogoLoft,
      @NonNull Button MedirAbsorbanciaTest, @NonNull Button Titulo, @NonNull Button botonPrueba,
      @NonNull Button botonPruebas, @NonNull EditText distfocal,
      @NonNull ConstraintLayout layoutMenuFragment, @NonNull TextView linkLOFT,
      @NonNull TextView marcoinferior, @NonNull EditText nrofotos, @NonNull EditText sensibilidad,
      @NonNull Switch switch1, @NonNull EditText texposicion2,
      @NonNull TextView valoresPermitidos) {
    this.rootView = rootView;
    this.AutoRotar = AutoRotar;
    this.GIFwave = GIFwave;
    this.LED = LED;
    this.LogoLoft = LogoLoft;
    this.MedirAbsorbanciaTest = MedirAbsorbanciaTest;
    this.Titulo = Titulo;
    this.botonPrueba = botonPrueba;
    this.botonPruebas = botonPruebas;
    this.distfocal = distfocal;
    this.layoutMenuFragment = layoutMenuFragment;
    this.linkLOFT = linkLOFT;
    this.marcoinferior = marcoinferior;
    this.nrofotos = nrofotos;
    this.sensibilidad = sensibilidad;
    this.switch1 = switch1;
    this.texposicion2 = texposicion2;
    this.valoresPermitidos = valoresPermitidos;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MenuInicialBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MenuInicialBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.menu_inicial, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MenuInicialBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AutoRotar;
      Button AutoRotar = ViewBindings.findChildViewById(rootView, id);
      if (AutoRotar == null) {
        break missingId;
      }

      id = R.id.GIFwave;
      GifImageView GIFwave = ViewBindings.findChildViewById(rootView, id);
      if (GIFwave == null) {
        break missingId;
      }

      id = R.id.LED;
      EditText LED = ViewBindings.findChildViewById(rootView, id);
      if (LED == null) {
        break missingId;
      }

      id = R.id.LogoLoft;
      ImageView LogoLoft = ViewBindings.findChildViewById(rootView, id);
      if (LogoLoft == null) {
        break missingId;
      }

      id = R.id.MedirAbsorbanciaTest;
      Button MedirAbsorbanciaTest = ViewBindings.findChildViewById(rootView, id);
      if (MedirAbsorbanciaTest == null) {
        break missingId;
      }

      id = R.id.Titulo;
      Button Titulo = ViewBindings.findChildViewById(rootView, id);
      if (Titulo == null) {
        break missingId;
      }

      id = R.id.botonPrueba;
      Button botonPrueba = ViewBindings.findChildViewById(rootView, id);
      if (botonPrueba == null) {
        break missingId;
      }

      id = R.id.botonPruebas;
      Button botonPruebas = ViewBindings.findChildViewById(rootView, id);
      if (botonPruebas == null) {
        break missingId;
      }

      id = R.id.distfocal;
      EditText distfocal = ViewBindings.findChildViewById(rootView, id);
      if (distfocal == null) {
        break missingId;
      }

      ConstraintLayout layoutMenuFragment = (ConstraintLayout) rootView;

      id = R.id.linkLOFT;
      TextView linkLOFT = ViewBindings.findChildViewById(rootView, id);
      if (linkLOFT == null) {
        break missingId;
      }

      id = R.id.marcoinferior;
      TextView marcoinferior = ViewBindings.findChildViewById(rootView, id);
      if (marcoinferior == null) {
        break missingId;
      }

      id = R.id.nrofotos;
      EditText nrofotos = ViewBindings.findChildViewById(rootView, id);
      if (nrofotos == null) {
        break missingId;
      }

      id = R.id.sensibilidad;
      EditText sensibilidad = ViewBindings.findChildViewById(rootView, id);
      if (sensibilidad == null) {
        break missingId;
      }

      id = R.id.switch1;
      Switch switch1 = ViewBindings.findChildViewById(rootView, id);
      if (switch1 == null) {
        break missingId;
      }

      id = R.id.texposicion2;
      EditText texposicion2 = ViewBindings.findChildViewById(rootView, id);
      if (texposicion2 == null) {
        break missingId;
      }

      id = R.id.valoresPermitidos;
      TextView valoresPermitidos = ViewBindings.findChildViewById(rootView, id);
      if (valoresPermitidos == null) {
        break missingId;
      }

      return new MenuInicialBinding((ConstraintLayout) rootView, AutoRotar, GIFwave, LED, LogoLoft,
          MedirAbsorbanciaTest, Titulo, botonPrueba, botonPruebas, distfocal, layoutMenuFragment,
          linkLOFT, marcoinferior, nrofotos, sensibilidad, switch1, texposicion2,
          valoresPermitidos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
