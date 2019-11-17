package com.wbrawner.cverter;

public class ConversionHelper {
    static {
        System.loadLibrary("c-verter");
    }

    public static native double celsiusToFahrenheit(double celsius);

    public static native double fahrenheitToCelsius(double celsius);
}
