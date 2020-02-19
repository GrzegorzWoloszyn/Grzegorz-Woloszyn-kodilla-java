package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> figureList = new ArrayList<Shape>();

    public List<Shape> addFigure(Shape shape) {
        if (shape != null) {
            figureList.add(shape);
            System.out.println("Figure added.");
        }
        return figureList;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(figureList.contains(shape)) {
            figureList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber) {
        Shape shape = null;
        if (figureNumber <= 0 && figureNumber < figureList.size()) {
            shape = figureList.get(figureNumber);
        }
        return shape;
    }

    public Shape showFigure(Shape shape) {

        if (figureList.contains(shape)) {
            return shape;
        }
        throw new IllegalArgumentException(String.format("The chosen shape doesn't exist in the list.", shape));

    }
}
