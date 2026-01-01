package com.objectmodelling.level1.universitymanagementApplication;

public class UniversityManagementApplication {

	

	    public static void main(String[] args) {

	        Student s1 = new Student(1, "Aman");
	        Student s2 = new Student(2, "Neha");

	        Professor prof = new Professor(101, "Dr. Sharma");

	        Course java = new Course("Core Java");

	        s1.enrollCourse(java);
	        s2.enrollCourse(java);

	        prof.assignCourse(java);

	        System.out.println();
	        java.showCourseDetails();
	    }
	}


