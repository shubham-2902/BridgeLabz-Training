package com.objectmodelling.level1.schoolandstudents;
import java.util.ArrayList;
import java.util.List;

public class Course {


	    private String courseName;
	    private List<Student> students = new ArrayList<>();

	    Course(String courseName) {
	        this.courseName = courseName;
	    }

	    void addStudent(Student student) {
	        students.add(student);
	    }

	    void displayStudents() {
	        System.out.println("Students enrolled in " + courseName + ":");
	        for (Student s : students) {
	            System.out.println("  - " + s.getStudentName());
	        }
	    }

	    String getCourseName() {
	        return courseName;
	    }
	}


