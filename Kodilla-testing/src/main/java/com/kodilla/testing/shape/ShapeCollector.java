package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> figuresList = new ArrayList<>();

    public int addFigure(Shape shape) {
        if ( shape != null) {
            figuresList.add(shape);
        }
        return  figuresList.size();

    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figuresList.contains(shape)) {
            figuresList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int figureNumber) {
        Shape shape = null;
        if (figureNumber <= 0 && figureNumber < figuresList.size()) {
            shape = figuresList.get(figureNumber);
        }
        return shape;
    }

    public Shape showFigures(Shape shape) {
        if (figuresList.contains(shape)) { }
        return shape;
    }

}
