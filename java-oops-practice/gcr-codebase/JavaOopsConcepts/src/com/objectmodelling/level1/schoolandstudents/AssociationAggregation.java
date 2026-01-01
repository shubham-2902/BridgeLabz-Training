package com.objectmodelling.level1.schoolandstudents;

public class AssociationAggregation {
	
	    public static void main(String[] args) {

	        // School (Aggregation)
	        School school = new School("Green Valley School");

	        // Students
	        Student s1 = new Student(1, "Aman");
	        Student s2 = new Student(2, "Neha");

	        // Courses
	        Course math = new Course("Mathematics");
	        Course science = new Course("Science");

	        // Aggregation
	        school.addStudent(s1);
	        school.addStudent(s2);

	        // Association (Many-to-Many)
	        s1.enrollCourse(math);
	        s1.enrollCourse(science);

	        s2.enrollCourse(science);

	        // Output
	        school.displayStudents();
	        System.out.println();

	        s1.displayCourses();
	        System.out.println();

	        science.displayStudents();
	    }
	}


