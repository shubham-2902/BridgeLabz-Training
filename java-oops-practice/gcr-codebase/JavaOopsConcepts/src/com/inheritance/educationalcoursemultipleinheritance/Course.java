package com.inheritance.educationalcoursemultipleinheritance;

//Course.java
public class Course {

 String courseName;
 int duration; // in hours

 public Course(String courseName, int duration) {
     this.courseName = courseName;
     this.duration = duration;
 }

 public void displayCourseDetails() {
     System.out.println("Course Name : " + courseName);
     System.out.println("Duration    : " + duration + " hours");
 }
}
