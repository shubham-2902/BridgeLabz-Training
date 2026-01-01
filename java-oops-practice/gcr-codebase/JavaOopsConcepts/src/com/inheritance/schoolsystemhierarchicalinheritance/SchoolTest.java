package com.inheritance.schoolsystemhierarchicalinheritance;

//SchoolTest.java
public class SchoolTest {

 public static void main(String[] args) {

     Teacher teacher = new Teacher("Anita", 35, "Mathematics");
     Student student = new Student("Rahul", 16, "10th Grade");
     Staff staff = new Staff("Suresh", 42, "Administration");

     teacher.displayPersonDetails();
     teacher.displayRole();
     System.out.println("---------------------");

     student.displayPersonDetails();
     student.displayRole();
     System.out.println("---------------------");

     staff.displayPersonDetails();
     staff.displayRole();
 }
}
