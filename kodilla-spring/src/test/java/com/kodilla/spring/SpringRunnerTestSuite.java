package com.kodilla.spring;

import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {

    @Test
    public void getCircleLoadedIntoContainer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("circle");

        String name = shape.getShapeName();

        Assert.assertEquals("This is a circle.", name);
    }

    @Test
    public void getTriangleLoadedIntoContainer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("triangle");

        String name = shape.getShapeName();

        Assert.assertEquals("This is a triangle.", name);
    }

    @Test
    public void testSquareLoadedIntoContainer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Shape shape = (Shape) context.getBean("createSquare");

        String name = shape.getShapeName();

        Assert.assertEquals("This is a square.", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("chosenShape");

        String name = shape.getShapeName();

        System.out.println("Chosen shape says: " + name);
    }
}
