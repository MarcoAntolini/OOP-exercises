class TestComplexNumCalculator {
    public static void main(String[] args) {
        ComplexNumCalculator calc = new ComplexNumCalculator();
        calc.build();

        ComplexNum num1 = new ComplexNum();
        num1.build(1, 2);
        ComplexNum num2 = new ComplexNum();
        num2.build(2, 3);
        calc.add(num1, num2);
        System.out.println(calc.lastRes.toStringRep());
        System.out.println(calc.nOpDone);

        ComplexNum num3 = new ComplexNum();
        num3.build(4, 5);
        ComplexNum num4 = new ComplexNum();
        num4.build(6, 7);
        calc.sub(num3, num4);
        System.out.println(calc.lastRes.toStringRep());
        System.out.println(calc.nOpDone);

        ComplexNum num5 = new ComplexNum();
        num5.build(8, 2);
        ComplexNum num6 = new ComplexNum();
        num6.build(3, -1);
        calc.mul(num5, num6);
        System.out.println(calc.lastRes.toStringRep());
        System.out.println(calc.nOpDone);
    }
}
