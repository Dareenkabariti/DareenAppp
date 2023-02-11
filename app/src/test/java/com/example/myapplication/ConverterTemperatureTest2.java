package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConverterTemperatureTest2 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class ");
    }

    @Before
    public void beforeFunc(){
        System.out.println("before function test");
    }
    @Test
    public void convertFahrenheitToCelsius() {
        float input = 212;
        float output ;
        float expected = 10;
        float delta = 0.1f;

        ConverterTemperature converter = new ConverterTemperature();
        output = converter.convertFahrenheitToCelsius(input);
        assertEquals(expected,output,delta);

        System.out.println("Expected"+ expected + "Actual (output)"+ output);
    }

    @Test
    public void convertCelsiusToFahrenheit() {
        System.out.println("test 2");
    }
    @After
    public void afterFunc(){
        System.out.println("after function test");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }
}