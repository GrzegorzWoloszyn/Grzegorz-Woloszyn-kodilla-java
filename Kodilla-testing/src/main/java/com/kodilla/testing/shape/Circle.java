package com.kodilla.testing.shape;

public class Circle implements Shape {

    final double PI = 3.14;
    private String name;
    private int radius;

    public Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return PI * (radius * radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.PI, PI) != 0) return false;
        if (radius != circle.radius) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(PI);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + radius;
        return result;
    }
}
