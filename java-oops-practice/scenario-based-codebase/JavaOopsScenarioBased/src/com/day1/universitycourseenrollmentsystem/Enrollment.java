package com.day1.universitycourseenrollmentsystem;

public class Enrollment implements Graded {

    private Student student;
    private Course course;
    private String grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    @Override
    public void assignGrade(String grade) {
        this.grade = grade;

        // GPA calculation using operators
        double gpaPoints = 0;

        if (grade.equals("A")) gpaPoints = 4.0;
        else if (grade.equals("B")) gpaPoints = 3.0;
        else if (grade.equals("C")) gpaPoints = 2.0;

        // Simple GPA formula
        double gpa = (gpaPoints * course.getCredits()) / course.getCredits();
        student.setGpa(gpa);
    }

    public void displayEnrollment() {
        course.displayCourse();
        System.out.println("Grade Assigned: " + grade);
        System.out.println(student.getTranscript());
    }
}
