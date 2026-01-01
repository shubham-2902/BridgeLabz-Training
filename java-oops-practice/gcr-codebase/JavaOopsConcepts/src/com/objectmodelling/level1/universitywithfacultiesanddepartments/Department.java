package com.objectmodelling.level1.universitywithfacultiesanddepartments;

public class Department {

	

	    private String departmentName;

	    Department(String departmentName) {
	        this.departmentName = departmentName;
	    }

	    void displayDepartment() {
	        System.out.println("Department: " + departmentName);
	    }
	}


