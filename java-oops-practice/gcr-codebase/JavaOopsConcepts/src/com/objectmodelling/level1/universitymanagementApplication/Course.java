package com.objectmodelling.level1.universitymanagementApplication;
import java.util.ArrayList;
import java.util.List;

class Course {

    private String courseName;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getProfessorName());

        System.out.println("Students:");
        for (Student s : students) {
            System.out.println("  - " + s.getStudentName());
        }
    }

    String getCourseName() {
        return courseName;
    }
}


