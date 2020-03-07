package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        List<Country> countries = new ArrayList<>();

        Country japan = new Country("Japan", new BigDecimal("123456789"));
        Country india = new Country("India", new BigDecimal("1234567890123456789"));
        Country poland = new Country("Poland", new BigDecimal("123456789123456"));
        Country italy = new Country("Italy", new BigDecimal("12345678912"));
        Country kanada = new Country("Kanada", new BigDecimal("1234567891234567890"));
        Country usa  = new Country("USA", new BigDecimal("12345678901234567899"));

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent northAmerika = new Continent("North Amerika");

        asia.addCountry(japan);
        asia.addCountry(india);
        europe.addCountry(poland);
        europe.addCountry(italy);
        northAmerika.addCountry(kanada);
        northAmerika.addCountry(usa);

        countries.add(japan);
        countries.add(india);
        countries.add(poland);
        countries.add(italy);
        countries.add(kanada);
        countries.add(usa);

        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(northAmerika);
        //When
        BigDecimal population = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(population, new BigDecimal("14814938151850851735"));
    }
}
