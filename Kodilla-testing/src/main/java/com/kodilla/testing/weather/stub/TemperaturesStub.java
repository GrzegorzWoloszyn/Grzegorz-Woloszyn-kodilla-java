package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.zip.DeflaterOutputStream;

public class TemperaturesStub implements Tempreratures {

    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();
        //dummy date
        stubResult.put(0, 25.5);
        stubResult.put(1, 21.5);
        stubResult.put(2, 22.5);
        stubResult.put(3, 23.5);
        stubResult.put(4, 26.5);

        return stubResult;
    }
}
