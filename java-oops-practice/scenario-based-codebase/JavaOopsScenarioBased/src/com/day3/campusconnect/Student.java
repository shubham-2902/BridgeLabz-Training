package com.day3.campusconnect;
public class Student extends Person implements ICourseActions {

    private int totalMarks;   // sensitive
    private int subjects;

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    public void addGrade(int marks) {
        totalMarks += marks;
        subjects++;
    }

    // GPA calculation using operators
    public double calculateGPA() {
        if (subjects == 0) return 0;
        return (double) totalMarks / subjects;
    }

    @Override
    public void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    @Override
    public void dropCourse(Course course) {
        course.removeStudent(this);
        System.out.println(name + " dropped " + course.getCourseName());
    }

    // Polymorphism
    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("GPA: " + calculateGPA());
    }
}
