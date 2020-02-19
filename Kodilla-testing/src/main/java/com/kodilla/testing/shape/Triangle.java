package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private int base;
    private int height;

    public Triangle(String name, int sideLengthA, int sideLengthH) {
        this.name = name;
        this.base = sideLengthA;
        this.height = sideLengthH;
    }

    public String getShapeName() {

        return name;
    }

    public double getField() {
        return (base * height) /2;
    }

}
