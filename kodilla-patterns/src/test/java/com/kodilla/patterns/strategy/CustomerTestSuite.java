package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTestSuite {
    @Test
    public void testDefaultInvestingStrategies() {
        //Given
        Customer steven = new IndividualCustomer("Steven Segal");
        Customer john = new IndividualYoungCustomer("John Coffee");
        Customer kodilla = new CorporateCustomer("Kodilla");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.predict();
        System.out.println("Kodilla should: " + kodillaShouldBuy);
        //Then
        Assert.assertEquals("[Conservative predictor]: buy debentures of XYZ.", stevenShouldBuy);
        Assert.assertEquals("[Aggressive predictor]: buy stock of XYZ.", johnShouldBuy);
        Assert.assertEquals("[Balanced predictor]: buy shared units of XYZ. ", kodillaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        Customer steven = new IndividualCustomer("Steven Segal");

        //When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setBuyingStrategy(new AggressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);

        //Then
        Assert.assertEquals("[Aggressive predictor]: buy stock of XYZ.", stevenShouldBuy);
    }

}
