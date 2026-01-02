package com.day1.universitycourseenrollmentsystem;

public class UniversityApp {

    public static void main(String[] args) {

        // Faculty
        Faculty faculty = new Faculty(201, "Dr. Mehta");
        faculty.displayFaculty();

        // Students
        Student ugStudent = new Undergraduate(101, "Rahul", "AI");
        Student pgStudent = new Postgraduate(102, "Anita");

        // Course
        Course course = new Course("CS101", "Data Structures", 4);

        // Enrollment
        Enrollment e1 = new Enrollment(ugStudent, course);
        Enrollment e2 = new Enrollment(pgStudent, course);

        // Assign grades
        e1.assignGrade("A");
        e2.assignGrade("B");

        System.out.println("\n--- Enrollment Details ---");
        e1.displayEnrollment();
        System.out.println();
        e2.displayEnrollment();
    }
}
