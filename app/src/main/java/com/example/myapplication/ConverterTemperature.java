package com.example.myapplication;

public class ConverterTemperature {
    public final float convertFahrenheitToCelsius(float Fahrenheit){
        float result = ((Fahrenheit - 32) *5/9);
        return  result;
    }

    public final int convertCelsiusToFahrenheit(int Celsius ){
        int result = ((Celsius * 9 )/ 5) + 32 ;
        return  result;
    }
}
