package oop.lab03.acme;

public class Exam {

    private final int id;
    private final int maxStudents;
    private int registeredStudents;
    private final String courseName;
    private final Professor professor;
    private final ExamRoom room;
    private Student[] students;

    public Exam(final int id, final int maxStudents, final String courseName, final Professor professor,
            final ExamRoom room) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[maxStudents];
    }

    public int getId() {
        return this.id;
    }

    public Student[] getStudents() {
        return students;
    }

    public boolean isFull() {
        return this.registeredStudents == this.maxStudents;
    }

    public void registerStudent(Student student) {
        if (!this.isFull()) {
            this.students[this.registeredStudents] = student;
            this.registeredStudents++;
        }
    }

    public String toString() {
        return "Exam [id=" + this.id + ", maxStudents=" + this.maxStudents + ", registeredStudents="
                + this.registeredStudents
                + ", courseName=" + this.courseName + ", professor=" + this.professor + ", room=" + this.room + "]";
    }
}