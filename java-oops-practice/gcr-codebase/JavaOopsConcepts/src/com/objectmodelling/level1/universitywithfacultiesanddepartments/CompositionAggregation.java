package com.objectmodelling.level1.universitywithfacultiesanddepartments;

public class CompositionAggregation {
	

	    public static void main(String[] args) {

	        // Faculty exists independently (Aggregation)
	        Faculty f1 = new Faculty(101, "Dr. Sharma");
	        Faculty f2 = new Faculty(102, "Dr. Mehta");

	        // University
	        University university = new University("National Tech University");

	        // Composition: Departments created inside University
	        university.addDepartment("Computer Science");
	        university.addDepartment("Mechanical Engineering");

	        // Aggregation: Faculty added to University
	        university.addFaculty(f1);
	        university.addFaculty(f2);

	        university.displayUniversityDetails();

	        // Deleting University
	        university = null;

	        System.out.println("\nUniversity deleted.");
	        System.out.println("Departments are deleted automatically.");
	        System.out.println("Faculty still exists independently:");
	        f1.displayFaculty();
	    }
	}


