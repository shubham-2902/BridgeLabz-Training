package com.objectmodelling.level1.universitywithfacultiesanddepartments;

public class Faculty {
	

	    private int facultyId;
	    private String facultyName;

	    Faculty(int facultyId, String facultyName) {
	        this.facultyId = facultyId;
	        this.facultyName = facultyName;
	    }

	    void displayFaculty() {
	        System.out.println("Faculty ID: " + facultyId + ", Name: " + facultyName);
	    }

	    String getFacultyName() {
	        return facultyName;
	    }
	}


