package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilderIngredients() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .sauce("spicy")
                .burgers(3)
                .ingredient("mushrooms")
                .ingredient("cheese")
                .ingredient("onion")
                .ingredient("cucumber")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
    }

    @Test
    public void testBigmacBuilderBurgers() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .sauce("spicy")
                .burgers(3)
                .ingredient("mushrooms")
                .ingredient("cheese")
                .ingredient("onion")
                .ingredient("cucumber")
                .build();

        //When
        int howManyBurgers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(3, howManyBurgers);
    }

}
