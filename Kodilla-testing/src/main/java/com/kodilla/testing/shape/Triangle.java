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

        return "Triangle";
    }

    public double getField() {

        return (sideLengthA * sideLengthH) /2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (sideLengthA != triangle.sideLengthA) return false;
        if (sideLengthH != triangle.sideLengthH) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + sideLengthA;
        result = 31 * result + sideLengthH;
        return result;
    }
}
