package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private static final String name = "triangle";

    private final int base;
    private final int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getField() {
        return (base * height) / 2.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (base != triangle.base) return false;
        return height == triangle.height;
    }

    @Override
    public int hashCode() {
        int result = base;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return getName() + "(" + base + "," + height + ")";
    }
}
