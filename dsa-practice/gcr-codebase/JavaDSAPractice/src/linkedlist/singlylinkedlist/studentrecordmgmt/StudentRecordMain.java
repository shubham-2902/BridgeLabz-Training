package linkedlist.singlylinkedlist.studentrecordmgmt;

public class StudentRecordMain {

	    public static void main(String[] args) {

	        StudentLinkedList list = new StudentLinkedList();

	        list.addAtBeginning(1, "Ram", 20, "A");
	        list.addAtEnd(2, "abc", 21, "B");
	        list.addAtEnd(3, "xyz", 19, "A");

	        list.addAtPosition(2, 4, "abcde", 22, "C");

	        System.out.println("All Student Records:");
	        list.displayAll();

	        System.out.println("\n Searching Roll No 21:");
	        list.searchByRollNo(2);

	        System.out.println("\n Updating Grade of Roll No 35:");
	        list.updateGrade(3, "A+");

	        System.out.println("\n Deleting Roll No 1:");
	        list.deleteByRollNo(1);

	        System.out.println("\n Final Student Records:");
	        list.displayAll();
	    }
	}
