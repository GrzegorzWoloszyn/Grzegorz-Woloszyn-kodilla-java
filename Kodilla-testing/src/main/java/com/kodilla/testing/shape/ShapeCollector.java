package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        if ( shape != null) {
            shapes.add(shape);
            return true;
        }
        return false;
    }

    public boolean removeFigure(Shape shape) {
        if ( shape != null) {
            return shapes.remove(shape);
        }
        return false;
    }

    public Shape getFigure(int figureNumber) {
        Shape shape = null;
        if (figureNumber >= 0 && figureNumber <= shapes.size()) {
            shape = shapes.get(figureNumber);
        }
        return shape;
    }

    public void showFigures() {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
