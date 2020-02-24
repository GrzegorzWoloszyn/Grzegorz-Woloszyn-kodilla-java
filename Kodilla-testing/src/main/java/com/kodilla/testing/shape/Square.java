package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    private int sideLength;

    public Square(String name, int sideLength) {
        this.name = name;
        this.sideLength = sideLength;
    }

    public String getShapeName() {

        return "Square";
    }

    public double getField()
    {
        return sideLength * sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (sideLength != square.sideLength) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + sideLength;
        return result;
    }
}
