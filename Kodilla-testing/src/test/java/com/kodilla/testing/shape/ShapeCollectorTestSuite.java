package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    Shape shape;
    ShapeCollector shapeCollector = new ShapeCollector();
    private static int testCounter = 0;
    List<Shape> figuresList = new ArrayList<>();

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
        Shape shape = new Circle("Circle", 25);
        //When
        int result = shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Square("Square", 25);
        //When
        shapeCollector.addFigure(shape);
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result == true);
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape shape = new Triangle("Triangle", 20, 30);
        //When
        figuresList.add(shape);
        //Then
        Assert.assertEquals("Triangle", shape.getShapeName());
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape shape1 = new Triangle("Triangle", 20, 30);
        Shape shape2 = new Square("Square", 25);
        Shape shape3 = new Circle("Circle", 35);
        //When
        figuresList.add(shape1);
        figuresList.add(shape2);
        figuresList.add(shape3);
        String result = shapeCollector.showFigures(shape1);
        //Then
        Assert.assertEquals(result, "Triangle" );
    }



}
