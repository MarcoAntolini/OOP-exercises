package oop.lab02.constructors;

public class UseConstructors {

    public static void main(final String[] args) {
        Student student1 = new Student(1014, "Mario", "Rossi", 2013);
        Student student2 = new Student(1018, "Luca", "Bianchi", 2010);
        Student student3 = new Student(1019, "Peppino", "Vitiello", 2012);
        Student student4 = new Student(1020, "Luca", "Verdi", 2013);
        Train train1 = new Train(100, 200);
        Train train2 = new Train(50, 1050);
        Train train3 = new Train(0, 500);
        Train train4 = new Train();
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        student4.printStudentInfo();
        train1.printTrainInfo();
        train2.printTrainInfo();
        train3.printTrainInfo();
        train4.printTrainInfo();
    }
}
