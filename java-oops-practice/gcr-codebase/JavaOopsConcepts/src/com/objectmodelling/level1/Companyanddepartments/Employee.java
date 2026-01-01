package com.objectmodelling.level1.Companyanddepartments;

public class Employee {
	

	    private int empId;
	    private String empName;

	    Employee(int empId, String empName) {
	        this.empId = empId;
	        this.empName = empName;
	    }

	    void displayEmployee() {
	        System.out.println("    Employee ID: " + empId + ", Name: " + empName);
	    }
	}



