package com.objectmodelling.level1.universitymanagementApplication;
 public class Student {

    private int studentId;
    private String studentName;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println(studentName + " enrolled in " + course.getCourseName());
    }

    String getStudentName() {
        return studentName;
    }
}
