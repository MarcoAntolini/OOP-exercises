package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Rectangle implements Polygon {

    private static final int EDGE_COUNT = 4;
    private final double base;
    private final double height;

    public Rectangle(final double base, final double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.base + this.height);
    }

    @Override
    public double getArea() {
        return this.base * this.height;
    }

    @Override
    public int getEdgeCount() {
        return EDGE_COUNT;
    }

    public String toString() {
        return "Rectangle [base=" + this.base + ", height=" + this.height + "]";
    }
}