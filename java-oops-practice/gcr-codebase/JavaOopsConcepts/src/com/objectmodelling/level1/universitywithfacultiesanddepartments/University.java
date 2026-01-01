package com.objectmodelling.level1.universitywithfacultiesanddepartments;
import java.util.ArrayList;
import java.util.List;

 public class University {

    private String universityName;

    // Composition
    private List<Department> departments = new ArrayList<>();

    // Aggregation
    private List<Faculty> faculties = new ArrayList<>();

    University(String universityName) {
        this.universityName = universityName;
    }

    // Composition: create departments inside university
    void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Aggregation: accept existing faculty objects
    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void displayUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("\nDepartments:");
        for (Department d : departments) {
            d.displayDepartment();
        }

        System.out.println("\nFaculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }
}

