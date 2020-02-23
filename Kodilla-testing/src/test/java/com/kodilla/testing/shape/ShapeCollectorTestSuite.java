package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    Shape shape;
    ShapeCollector shapeCollector = new ShapeCollector();
    private static int testCounter = 0;
    private List<Shape> shapes = new ArrayList<>();

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
        shapeCollector.addFigure(shape);
        Shape result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals("triangle", shape.getShapeName());
    }

    @Test
    public void testShowFigures() {
        //Given
        shapeCollector.addFigure(new Triangle("triangle", 20, 30));
        shapeCollector.addFigure(new Square("square", 25));
        shapeCollector.addFigure(new Square("square", 25));
        //When
        String result = shapeCollector.showFigures(shapes);
        //Then
        Assert.assertEquals(result, "Shape/s: " + shapes);
    }



}
