class TestComplexNum {
  public static void main(String[] args) {
    ComplexNum c1 = new ComplexNum();
    c1.build(3, 5);
    ComplexNum c2 = new ComplexNum();
    c2.build(7, -4);
    ComplexNum c3 = new ComplexNum();
    c3.build(-2, 3);
    ComplexNum c4 = new ComplexNum();
    c4.build(-2, 3);
    System.out.println(c1.toStringRep() + " " + c2.toStringRep() + " " + c3.toStringRep() + " " + c4.toStringRep());
    c1.add(c2);
    c2.add(c4);
    System.out.println(c1.toStringRep() + " " + c2.toStringRep() + " " + c3.toStringRep() + " " + c4.toStringRep());
    c3.equal(c1);
    c3.equal(c2);
    c3.equal(c4);
  }
}