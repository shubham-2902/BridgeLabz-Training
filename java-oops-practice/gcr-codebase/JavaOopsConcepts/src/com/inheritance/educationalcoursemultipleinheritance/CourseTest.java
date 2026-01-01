package com.inheritance.educationalcoursemultipleinheritance;

//CourseTest.java
public class CourseTest {

 public static void main(String[] args) {

     PaidOnlineCourse course =
             new PaidOnlineCourse(
                     "Core Java",
                     40,
                     "Udemy",
                     true,
                     4999,
                     20
             );

     course.displayCourseDetails();
 }
}
