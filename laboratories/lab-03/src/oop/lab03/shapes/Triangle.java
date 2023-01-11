package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Triangle implements Polygon {

    private static final int EDGE_COUNT = 3;
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double heightA;
    private final double heightB;
    private final double heightC;

    public Triangle(final double sideA, final double sideB, final double sideC, final double heightA,
            final double heightB, final double heightC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightA = heightA;
        this.heightB = heightB;
        this.heightC = heightC;
    }

    @Override
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double getArea() {
        return this.sideA * this.heightA / 2;
    }

    @Override
    public int getEdgeCount() {
        return EDGE_COUNT;
    }

    public String toString() {
        return "Triangle [sideA=" + this.sideA + ", sideB=" + this.sideB + ", sideC=" + this.sideC + ", heightA="
                + this.heightA + ", heightB=" + this.heightB + ", heightC=" + this.heightC + "]";
    }
}