package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> figureList = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShapeCollector)) return false;

        ShapeCollector that = (ShapeCollector) o;

        return figureList.equals(that.figureList);
    }

    @Override
    public int hashCode() {
        return figureList.hashCode();
    }

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
            System.out.println("Figure removed");
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
