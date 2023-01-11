package oop.lab03.encapsulation;

public class Calculator {

    private int nOpDone;
    private double lastRes;

    public Calculator() {
        nOpDone = 0;
        lastRes = 0;
    }

    public int getnOpDone() {
        return nOpDone;
    }

    public double getLastRes() {
        return lastRes;
    }

    public double add(final double n1, final double n2) {
        lastRes = n1 + n2;
        nOpDone++;
        return lastRes;
    }

    public double sub(final double n1, final double n2) {
        lastRes = n1 - n2;
        nOpDone++;
        return lastRes;
    }

    public double mul(final double n1, final double n2) {
        lastRes = n1 * n2;
        nOpDone++;
        return lastRes;
    }

    public double div(final double n1, final double n2) {
        lastRes = n1 / n2;
        nOpDone++;
        return lastRes;
    }

    public static void main(final String[] args) {
        Calculator calc = new Calculator();

        System.out.println("1+2=" + calc.add(1, 2));
        System.out.println("nOpDone=" + calc.nOpDone);
        System.out.println("lastRes=" + calc.lastRes + "\n");

        System.out.println("-1-(+2)=" + calc.sub(-1, 2));
        System.out.println("nOpDone=" + calc.nOpDone);
        System.out.println("lastRes=" + calc.lastRes + "\n");

        System.out.println("2*1=" + calc.mul(2, 1));
        System.out.println("nOpDone=" + calc.nOpDone);
        System.out.println("lastRes=" + calc.lastRes + "\n");

        System.out.println("8/4=" + calc.div(8, 4));
        System.out.println("nOpDone=" + calc.nOpDone);
        System.out.println("lastRes=" + calc.lastRes + "\n");
    }
}
