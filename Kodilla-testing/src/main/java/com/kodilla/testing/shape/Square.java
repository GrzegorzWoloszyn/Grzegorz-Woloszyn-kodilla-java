package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    private int sideLength;

    public Square(String name, int sideLength) {
        this.name = name;
        this.sideLength = sideLength;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return sideLength * sideLength;
    }
}
