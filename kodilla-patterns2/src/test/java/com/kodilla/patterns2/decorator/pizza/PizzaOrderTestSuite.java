package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
    //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
    //When
        BigDecimal cost = pizzaOrder.getCost();
    //Then
        Assert.assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Basic pizza with tomato sauce, cheese", desc);
    }

    @Test
    public void testPizzaWithChickenAndPaprikaGetCost() {
     //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithChickenAndPaprika(pizzaOrder);

     //When
        BigDecimal cost = pizzaOrder.getCost();

     //Then
        Assert.assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testPizzaWithChickenAndPaprikaGetDescription() {
    //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithChickenAndPaprika(pizzaOrder);

    //When
        String desc = pizzaOrder.getDescription();

    //Then
        Assert.assertEquals("Basic pizza with tomato sauce, cheese, chicken, paprika", desc);
    }

    @Test
    public void testPizzaWithSpinachAndPastramiGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithSpinachAndPastrami(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(35), cost);
    }

    @Test
    public void testPizzaWithSpinachAndPastramiGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithSpinachAndPastrami(pizzaOrder);

        //When
        String desc = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Basic pizza with tomato sauce, cheese, spinach, pastrami", desc);
    }

    @Test
    public void testPizzaWithChickenAndPaprikaAndSpinachAndPastramiGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithChickenAndPaprika(pizzaOrder);
        pizzaOrder = new PizzaWithSpinachAndPastrami(pizzaOrder);

        //When
        BigDecimal cost = pizzaOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(45), cost);
    }

    @Test
    public void testPizzaWithChickenAndPaprikaAndSpinachAndPastramiGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithChickenAndPaprika(pizzaOrder);
        pizzaOrder = new PizzaWithSpinachAndPastrami(pizzaOrder);

        //When
        String desc = pizzaOrder.getDescription();

        //Then
        Assert.assertEquals("Basic pizza with tomato sauce, cheese, chicken, paprika, spinach, pastrami", desc);
    }
}
