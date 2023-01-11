package oop.lab03.shapes;

public class WorkWithShapes {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3);
        System.out.println(r);
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Area: " + r.getArea());
        Triangle t = new Triangle(3, 4, 5, 4, 3, 2.4);
        System.out.println(t);
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Area: " + t.getArea());
    }
}
