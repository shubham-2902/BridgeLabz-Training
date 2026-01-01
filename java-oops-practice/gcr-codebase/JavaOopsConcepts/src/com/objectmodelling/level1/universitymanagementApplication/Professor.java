package com.objectmodelling.level1.universitymanagementApplication;

public class Professor {
	

	    private int professorId;
	    private String professorName;

	    Professor(int professorId, String professorName) {
	        this.professorId = professorId;
	        this.professorName = professorName;
	    }

	    void assignCourse(Course course) {
	        course.assignProfessor(this);
	        System.out.println(professorName + " assigned to " + course.getCourseName());
	    }

	    String getProfessorName() {
	        return professorName;
	    }
	}



