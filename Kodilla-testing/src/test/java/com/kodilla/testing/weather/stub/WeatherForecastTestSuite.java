package com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWihtStub() {
        //Given
        Tempreratures tempreratures = new TemperaturesStub();
        WeatherForecast weatherForecast  = new WeatherForecast(tempreratures);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
