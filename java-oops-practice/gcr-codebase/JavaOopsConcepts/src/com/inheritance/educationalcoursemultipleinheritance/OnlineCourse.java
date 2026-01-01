package com.inheritance.educationalcoursemultipleinheritance;

//OnlineCourse.java
public class OnlineCourse extends Course {

 String platform;
 boolean isRecorded;

 public OnlineCourse(String courseName, int duration,
                     String platform, boolean isRecorded) {
     super(courseName, duration);
     this.platform = platform;
     this.isRecorded = isRecorded;
 }

 @Override
 public void displayCourseDetails() {
     super.displayCourseDetails();
     System.out.println("Platform    : " + platform);
     System.out.println("Recorded    : " + (isRecorded ? "Yes" : "No"));
 }
}
