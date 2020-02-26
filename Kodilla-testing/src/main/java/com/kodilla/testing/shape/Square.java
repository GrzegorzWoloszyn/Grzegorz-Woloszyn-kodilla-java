package com.kodilla.testing.shape;

public class Square implements Shape {

    private static final String name = "square";

    private final int side;

    public Square(int side) {
         this.side = side;
    }

    public String getName() {
        return name;
    }

    public double getField() {
        return side * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return side == square.side;
    }

    @Override
    public int hashCode() {
        return side;
    }

    @Override
    public String toString() {
        return getName() + "(" + side + ")";
    }
}
