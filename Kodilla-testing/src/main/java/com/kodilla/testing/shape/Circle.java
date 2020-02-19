package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String name;
    final double PI = 3.14;
    private int radius;


    public Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return PI * (radius * radius);
    }
}
