package com.objectmodelling.level1.schoolandstudents;
import java.util.ArrayList;
import java.util.List;

public class Student {
	
	
	    private int studentId;
	    private String studentName;
	    private List<Course> courses = new ArrayList<>();

	    Student(int studentId, String studentName) {
	        this.studentId = studentId;
	        this.studentName = studentName;
	    }

	    void enrollCourse(Course course) {
	        courses.add(course);
	        course.addStudent(this); // association (bidirectional)
	    }

	    void displayCourses() {
	        System.out.println("Courses enrolled by " + studentName + ":");
	        for (Course c : courses) {
	            System.out.println("  - " + c.getCourseName());
	        }
	    }

	    String getStudentName() {
	        return studentName;
	    }
	}



