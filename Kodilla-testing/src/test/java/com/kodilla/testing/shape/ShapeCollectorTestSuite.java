package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    Shape shape;
    ShapeCollector shapeCollector = new ShapeCollector();
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Circle(5);
        //When
        boolean result = shapeCollector.addFigure(shape);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Square( 25);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape triangle = new Triangle( 20, 30);
        Shape square = new Square( 25);
        Shape circle = new Circle(5);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        //When
        Shape result = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(square, result);
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape triangle = new Triangle( 20, 30);
        Shape square = new Square( 25);
        Shape circle = new Circle(5);

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        //When /Then
        shapeCollector.showFigures();

    }

}
