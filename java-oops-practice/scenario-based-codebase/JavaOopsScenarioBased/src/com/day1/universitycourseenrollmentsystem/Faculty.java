package com.day1.universitycourseenrollmentsystem;

public class Faculty {

    private int facultyId;
    private String name;

    public Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public void displayFaculty() {
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Faculty Name: " + name);
    }
}
