package com.objectmodelling.level1.Companyanddepartments;

public class Composition {

	
	    public static void main(String[] args) {

	        Company company = new Company("TechNova Pvt Ltd");

	        Department it = new Department("IT");
	        it.addEmployee(101, "Aman");
	        it.addEmployee(102, "Neha");

	        Department hr = new Department("HR");
	        hr.addEmployee(201, "Rohit");

	        company.addDepartment(it);
	        company.addDepartment(hr);

	        company.displayCompany();

	        // Composition behavior
	        company = null;

	        System.out.println("\nCompany deleted. All Departments and Employees are removed.");
	    }
	}


