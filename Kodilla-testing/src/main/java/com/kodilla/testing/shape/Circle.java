package com.kodilla.testing.shape;

public class Circle implements Shape {

    private static final double PI = 3.14;
    private static final String name = "circle";

    private final int radius;

    public Circle(int radius) {
         this.radius = radius;
    }

    public String getName() {
        return name;
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
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(PI);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + radius;
        return result;
    }

    @Override
    public String toString() {
        return getName() + "(" + radius + ")";
    }
}
