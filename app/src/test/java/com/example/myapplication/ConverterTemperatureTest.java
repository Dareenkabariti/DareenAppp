package com.example.myapplication;

import static org.junit.Assert.*;
import static org.junit.Before.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConverterTemperatureTest {

    @BeforeClass
    public static void BeforeClass() {
        System.out.println("Before class");
    }
    @Before
    public void Before() {
        System.out.println("Before");
    }


    @Test
    public void convertFahrenheitToCelsius() {
        float input = 212;
        float output ;
        float expected = 100;

        ConverterTemperature converter = new ConverterTemperature();
        output = converter.convertFahrenheitToCelsius(input);
        assertEquals(expected,output,0.1);

        System.out.println("expected"+ expected);
        System.out.println("actual (output)"+ expected);
    }

    @Test
    public void convertCelsiusToFahrenheit() {
        int input = 100;
        int output ;
        int expected = 212;

        ConverterTemperature converter = new ConverterTemperature();
        output = converter.convertCelsiusToFahrenheit(input);
        assertEquals(expected,output,0.1);

        System.out.println("expected"+ expected);
        System.out.println("actual (output)"+ expected);

    }

    @After
    public void After() {
        System.out.println("After");
    }
    @AfterClass
    public static void AfterClass() {
        System.out.println("After class");
    }
}