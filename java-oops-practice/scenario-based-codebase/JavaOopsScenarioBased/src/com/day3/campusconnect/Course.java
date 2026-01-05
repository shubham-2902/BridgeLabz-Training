package com.day3.campusconnect;
import java.util.ArrayList;

public class Course {

    private String courseCode;
    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseCode, String courseName, Faculty faculty) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void showCourseDetails() {
        System.out.println(courseCode + " - " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled Students: " + students.size());
    }
}
