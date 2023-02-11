package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ConverterTemperatureTestParametrized {
     int input ;
     int expected ;

    public ConverterTemperatureTestParametrized(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {212,413},
                {200,100}
        });
    }

    @Test
    public void convertCelsiusToFahrenheit() {
        ConverterTemperature converter = new ConverterTemperature();
        Assert.assertEquals(expected,converter.convertCelsiusToFahrenheit(input));


    }
}