package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Tempreratures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithMock() {
        //Given
        Tempreratures tempreraturesMock = mock(Tempreratures.class);
        WeatherForecast weatherForecast = new WeatherForecast(tempreraturesMock);
        HashMap<Integer, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put(0, 25.5);
        temperaturesMap.put(1, 22.5);
        temperaturesMap.put(2, 21.5);
        temperaturesMap.put(3, 23.5);
        temperaturesMap.put(4, 26.5);

        when(tempreraturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
