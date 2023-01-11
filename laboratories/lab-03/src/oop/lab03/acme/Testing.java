package oop.lab03.acme;

public final class Testing {

    private Testing() {
    }

    public static void main(final String[] args) {
        final Student student1 = new Student(1, "Mario", "Rossi", "password");
        final Student student2 = new Student(2, "Luigi", "Verdi", "password");
        final Student student3 = new Student(3, "Piero", "Baldo", "1234");
        final Professor prof1 = new Professor(1, "Dio", "Ghini", "Bash", null);
        final Professor prof2 = new Professor(1, "Prof", "Paolo", "asl", null);
        final ExamRoom room1 = new ExamRoom(100, "Aula 1", true, true);
        final ExamRoom room2 = new ExamRoom(80, "Aula 2", false, false);
        final Exam exam1 = new Exam(1, 10, "OS", prof1, room1);
        final Exam exam2 = new Exam(2, 2, "OOP", prof2, room2);
        exam1.registerStudent(student1);
        exam1.registerStudent(student2);
        exam1.registerStudent(student3);
        exam2.registerStudent(student1);
        exam2.registerStudent(student2);
        exam2.registerStudent(student3);
        System.out.println(exam1);
        System.out.println(exam2);
    }
}
