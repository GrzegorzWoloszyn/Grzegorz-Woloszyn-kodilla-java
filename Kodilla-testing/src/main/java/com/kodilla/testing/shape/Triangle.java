package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private int sideLengthA;
    private int sideLengthH;

    public Triangle(String name, int sideLengthA, int sideLengthH) {
        this.name = name;
        this.sideLengthA = sideLengthA;
        this.sideLengthH = sideLengthH;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return (sideLengthA * sideLengthH) /2;
    }

}
