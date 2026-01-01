package com.objectmodelling.level1.Companyanddepartments;
import java.util.ArrayList;
import java.util.List;

public class Company {
	

	

	
	    private String companyName;
	    private List<Department> departments = new ArrayList<>();

	    Company(String companyName) {
	        this.companyName = companyName;
	    }

	    void addDepartment(Department dept) {
	        departments.add(dept);
	    }

	    void displayCompany() {
	        System.out.println("Company: " + companyName);
	        for (Department d : departments) {
	            d.displayDepartment();
	        }
	    }
	}



