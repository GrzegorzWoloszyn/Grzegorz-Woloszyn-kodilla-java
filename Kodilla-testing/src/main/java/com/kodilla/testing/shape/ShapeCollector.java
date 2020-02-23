package com.kodilla.testing.shape;

        import java.util.ArrayList;
        import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public int addFigure(Shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }
        return  shapes.size();

    }

    public boolean removeFigure(Shape shape) {

        if (shape == null) return false;
        return shapes.remove(shape);
    }

    public Shape getFigure(int figureNumber) {
        Shape shape = null;
        if (figureNumber <= 0 && figureNumber < shapes.size()) {
            shape = shapes.get(figureNumber);
        }
        return shape;
    }

    public String showFigures(List<Shape> shapeList) {

        return "Shape/s: " + shapeList;
    }

}
