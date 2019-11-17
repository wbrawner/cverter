package com.wbrawner.cverter

object ConversionHelper {
    external fun celsiusToFahrenheit(celsius: Double): Double
    external fun fahrenheitToCelsius(fahrenheit: Double): Double

    init {
        System.loadLibrary("c-verter")
    }
}