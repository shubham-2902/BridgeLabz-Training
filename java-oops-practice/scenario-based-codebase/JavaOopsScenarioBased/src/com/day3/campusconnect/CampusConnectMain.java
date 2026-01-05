package com.day3.campusconnect;
public class CampusConnectMain {

    public static void main(String[] args) {

        // Faculty
        Faculty faculty = new Faculty(201, "Dr. Sharma", "sharma@uni.edu", "Computer Science");

        // Course
        Course course = new Course("CS101", "Data Structures", faculty);

        // Students
        Student s1 = new Student(101, "Rahul", "rahul@uni.edu");
        Student s2 = new Student(102, "Anita", "anita@uni.edu");

        // Enroll students
        s1.enrollCourse(course);
        s2.enrollCourse(course);

        // Add grades
        s1.addGrade(85);
        s1.addGrade(90);

        s2.addGrade(78);
        s2.addGrade(82);

        System.out.println("\n--- Course Info ---");
        course.showCourseDetails();

        System.out.println("\n--- Student Details ---");
        s1.printDetails();
        System.out.println();
        s2.printDetails();

        System.out.println("\n--- Faculty Details ---");
        faculty.printDetails();
    }
}
