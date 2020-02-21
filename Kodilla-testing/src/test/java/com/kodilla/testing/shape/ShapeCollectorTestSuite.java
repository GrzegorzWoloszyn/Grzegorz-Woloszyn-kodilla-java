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
        Shape shape = new Circle("circle", 25);
        //When
        int result = shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Square("square", 25);
        //When
        shapeCollector.addFigure(shape);
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result == true);
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape shape = new Triangle("triangle", 20, 30);
        //When
        figuresList.add(shape);
        //Then
        Assert.assertEquals("triangle", shape.getShapeName());
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape shape1 = new Triangle("triangle", 20, 30);
        Shape shape2 = new Square("square", 25);
        Shape shape3 = new Square("square", 25);
        //When
        figuresList.add(shape1);
        figuresList.add(shape2);
        figuresList.add(shape3);
        //Then
        Assert.assertEquals(shape1, shapeCollector.showFigures(shape1) );
    }



}
