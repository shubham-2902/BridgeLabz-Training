package com.constructors.level1;

public class Course {



    // Instance variables
    String courseName;
    int duration;        // in months
    double fee;

    // Class variable (shared by all courses)
    static String instituteName = "ABC Institute";

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    void displayCourseDetails() {
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : ₹" + fee);
        System.out.println("Institute Name : " + instituteName);
        System.out.println();
    }

    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // main method
    public static void main(String[] args) {
        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Python Data Science", 5, 50000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("BridgeLabz");

        System.out.println("After updating institute name:\n");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
