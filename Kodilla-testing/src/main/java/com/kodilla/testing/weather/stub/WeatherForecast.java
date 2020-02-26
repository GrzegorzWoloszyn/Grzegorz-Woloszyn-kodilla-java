package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    Tempreratures tempreratures;

    public WeatherForecast(Tempreratures tempreratures) {
        this.tempreratures = tempreratures;
    }

    public HashMap<Integer, Double> calculateForecast() {
        HashMap<Integer, Double> resultMap = new HashMap<>();
        for (Map.Entry<Integer, Double> temperature : tempreratures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }
}
