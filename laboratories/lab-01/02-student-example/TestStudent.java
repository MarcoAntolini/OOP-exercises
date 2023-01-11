class TestStudent {
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.build("Mario", "Rossi", 1014, 2020);
    student1.printStudentInfo();
    Student student2 = new Student();
    student2.build("Luigi", "Gentile", 1015, 2019);
    student2.printStudentInfo();
    Student student3 = new Student();
    student3.build("Simone", "Bianchi", 1016, 2018);
    student3.printStudentInfo();
    Student student4 = new Student();
    student4.build("Andrea", "Bracci", 1017, 2017);
    student4.printStudentInfo();
  }

}
