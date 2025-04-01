package com.example.android.camera2.basic

import org.apache.commons.math3.fitting.PolynomialCurveFitter
import org.apache.commons.math3.fitting.WeightedObservedPoints

class Regresion {
    fun getPolynomialFitter(x: MutableList<Double>, y: MutableList<Double>, n: Int): DoubleArray {
        val fitter = PolynomialCurveFitter.create(n)
        val obs = WeightedObservedPoints()
        for (i in 0 until x.size) {
            obs.add(x[i], y[i])
        }
        return fitter.fit(obs.toList())
    }
}