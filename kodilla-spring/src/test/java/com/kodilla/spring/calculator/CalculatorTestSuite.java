package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");

        Calculator calculator = (Calculator) context.getBean("calculator");

        double sum = calculator.add(5.5, 10.1);
        double subRsult = calculator.sub(5.5, 10.1);
        double product = calculator.mul(5.5, 10.1);
        double quotient = calculator.div(5.5, 10.1);

        Assert.assertEquals(15.6, sum, 0.001);
        Assert.assertEquals(-4.6, subRsult, 0.001);
        Assert.assertEquals(55.55, product, 0.001);
        Assert.assertEquals(0.544, quotient, 0.001);

    }
}
