package com.example.myapplication;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ConverterTemperatureTest1 {

    private int input ;
    private  int expected ;

    @Parameterized.Parameters
    public static Collection<Object[]>data(){
        return Arrays.asList(new Object[][]{
                {212,100}
        });
    }

   public ConverterTemperatureTest1 (int input, int expected){
      this.input = input;
      this.expected = expected;
   }

   @Test
   public void convertCelsiusToFahrenheit() {

       ConverterTemperature converter = new ConverterTemperature();
       Assert.assertNotEquals(converter.convertCelsiusToFahrenheit(expected),input);



   }

}