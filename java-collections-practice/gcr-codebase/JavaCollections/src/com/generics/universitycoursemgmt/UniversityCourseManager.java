package com.generics.universitycoursemgmt;
import java.util.ArrayList;
import java.util.List;

public class UniversityCourseManager {

    // This list can store courses of any evaluation type (Exam/Assignment/Research)
    private List<Course<? extends CourseType>> courseCatalog;

    public UniversityCourseManager() {
        courseCatalog = new ArrayList<>();
    }

    public void addCourse(Course<? extends CourseType> course) {
        courseCatalog.add(course);
    }

    public Course<? extends CourseType> findCourseByCode(String code) {
        for (Course<? extends CourseType> c : courseCatalog) {
            if (c.getCourseCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }

    public List<Course<? extends CourseType>> getAllCourses() {
        return courseCatalog;
    }

    // Required wildcard usage: handles any type of course dynamically
    public static void displayCourseTypes(List<? extends CourseType> types) {
        if (types.isEmpty()) {
            System.out.println("No course types to display.");
            return;
        }
        System.out.println("\n--- Course Type Details ---");
        for (CourseType ct : types) {
            System.out.println(ct);
        }
    }

    // This method extracts course types from the course catalog and calls the wildcard method
    public void displayAllCourseTypes() {
        List<CourseType> types = new ArrayList<>();
        for (Course<? extends CourseType> c : courseCatalog) {
            types.add(c.getCourseType());
        }
        displayCourseTypes(types); // wildcard method call
    }
}
