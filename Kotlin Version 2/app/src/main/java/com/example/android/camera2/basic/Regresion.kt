package com.example.android.camera2.basic

import org.apache.commons.math3.fitting.PolynomialCurveFitter
import org.apache.commons.math3.fitting.WeightedObservedPoints
// x: Una lista de valores Double con las coordenadas X de los datos
// y: Una lista de valores Double con las coordenadas Y de los datos
// n: El grado del polinomio a ajustar
class Regresion {
    fun getPolynomialFitter(x: MutableList<Double>, y: MutableList<Double>, n: Int): DoubleArray {
        val fitter = PolynomialCurveFitter.create(n) //Halla los coeficientes usando minimos cuadrados.
        val obs = WeightedObservedPoints()
        for (i in 0 until x.size) {
            obs.add(x[i], y[i])
        }
        return fitter.fit(obs.toList())
    }
}