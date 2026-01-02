package com.day1.universitycourseenrollmentsystem;

public class Student {

    protected int studentId;
    protected String name;

    private double gpa;   // sensitive data

    // Constructor without elective
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Constructor with elective preference
    public Student(int studentId, String name, String elective) {
        this.studentId = studentId;
        this.name = name;
        System.out.println("Elective Chosen: " + elective);
    }

    // Encapsulation
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Safe access
    public String getTranscript() {
        return "Student ID: " + studentId +
               ", Name: " + name +
               ", GPA: " + gpa;
    }
}
