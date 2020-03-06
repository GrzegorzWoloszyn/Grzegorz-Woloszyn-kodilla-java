package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String name;
    List<Country> countries = new ArrayList<>();

    public Continent(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries() {
        return  new ArrayList<>(countries);
    }
}
