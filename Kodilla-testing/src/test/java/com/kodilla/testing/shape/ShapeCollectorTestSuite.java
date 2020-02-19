package com.kodilla.testing.shape;
<<<<<<< HEAD

import org.junit.*;

=======
import com.kodilla.testing.shape.ShapeCollector;
import org.junit.*;
>>>>>>> task.6.4:example and task 6.4
import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

<<<<<<< HEAD
    Shape shape;
    ShapeCollector shapeCollector = new ShapeCollector();
    private static int testCounter = 0;
    private List<Shape> shapes = new ArrayList<>();

    @BeforeClass
    public static void beforeAllTests() {
=======
    private static int testCounter = 0;
    public ShapeCollector shapeCollector = new ShapeCollector();
    private List<Shape> figureList = new ArrayList<>();

    @BeforeClass
    public static void beforeAllTests() {

>>>>>>> task.6.4:example and task 6.4
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
<<<<<<< HEAD
     }
=======
    }
>>>>>>> task.6.4:example and task 6.4

    @Test
    public void testAddFigure() {
        //Given
<<<<<<< HEAD
        Shape shape = new Circle("circle", 25);
        //When
        int result = shapeCollector.addFigure(shape);
        //Then
        Assert.assertEquals(1, result);
=======
        Shape shape1 = new Circle("circle", 10);
        Shape shape2 = new Triangle("triangle", 10, 12);
        Shape shape3 = new Square("square", 10);
        //When
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        //Then
        Assert.assertEquals(3, figureList.size());
>>>>>>> task.6.4:example and task 6.4
    }

    @Test
    public void testRemoveFigure() {
        //Given
<<<<<<< HEAD
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

=======
        Shape shape1 = new Circle("circle", 10);
        //When
        shapeCollector.removeFigure(shape1);
        //Then
        Assert.assertEquals(2, figureList.size());
    }
>>>>>>> task.6.4:example and task 6.4

    @Test
    public void testGetFigure() {
        //Given
        Shape shape2 = new Triangle("triangle", 10, 12);
        //When
        shapeCollector.getFigure(1);
        //Thenn
        Assert.assertEquals(shape2, new Triangle("triangle", 10, 12) );
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape shape3 = new Square("square", 10);
        //When
        shapeCollector.showFigure(shape3);
        //Thenn
    }
}
