package com.objectmodelling.level1.schoolandstudents;
import java.util.ArrayList;
import java.util.List;

   public class School {

	    private String schoolName;
	    private List<Student> students = new ArrayList<>();

	    School(String schoolName) {
	        this.schoolName = schoolName;
	    }

	    void addStudent(Student student) {
	        students.add(student);
	    }

	    void displayStudents() {
	        System.out.println("Students in " + schoolName + ":");
	        for (Student s : students) {
	            System.out.println("  - " + s.getStudentName());
	        }
	    }
	}



