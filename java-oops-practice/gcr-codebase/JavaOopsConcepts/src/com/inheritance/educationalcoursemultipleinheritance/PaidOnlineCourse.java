package com.inheritance.educationalcoursemultipleinheritance;

//PaidOnlineCourse.java
public class PaidOnlineCourse extends OnlineCourse {

 double fee;
 double discount; // in percentage

 public PaidOnlineCourse(String courseName, int duration,
                         String platform, boolean isRecorded,
                         double fee, double discount) {
     super(courseName, duration, platform, isRecorded);
     this.fee = fee;
     this.discount = discount;
 }

 @Override
 public void displayCourseDetails() {
     super.displayCourseDetails();
     System.out.println("Course Fee  : ₹" + fee);
     System.out.println("Discount    : " + discount + "%");
 }
}
