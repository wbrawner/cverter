package com.wbrawner.cverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        celsiusToFahrenheit.text = String.format(
            "40℃ is equal to %3.0f℉",
            ConversionHelper.celsiusToFahrenheit(40.0)
        )
        fahrenheitToCelsius.text = String.format(
            "40℉ is equal to %2.1f℃",
            ConversionHelper.fahrenheitToCelsius(40.0)
        )
    }
}
