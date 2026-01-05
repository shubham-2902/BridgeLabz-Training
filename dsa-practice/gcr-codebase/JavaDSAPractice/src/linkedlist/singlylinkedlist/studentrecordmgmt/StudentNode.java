package linkedlist.singlylinkedlist.studentrecordmgmt;



public class StudentNode {
	
	//Declaration of the variables and data structure
    int rollNo;
    String name;
    int age;
    String grade;
    StudentNode next;

    //Constructor
    StudentNode(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}