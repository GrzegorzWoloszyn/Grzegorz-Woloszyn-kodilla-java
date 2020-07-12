package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithChickenAndPaprika extends AbstractPizzaOrderDecorator {


    protected PizzaWithChickenAndPaprika(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    public String getDescription() {
        return super.getDescription() + ", chicken, paprika";
    }
}
