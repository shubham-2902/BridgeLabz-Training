package linkedlist.singlylinkedlist.studentrecordmgmt;

public class StudentLinkedList {

    private StudentNode head;

    // Method for Adding  at the Beginning
    public void addAtBeginning(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Method for adding at the end
    public void addAtEnd(int rollNo, String name, int age, String grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    // Adding at the specific position
    public void addAtPosition(int position, int rollNo, String name, int age, String grade) {
        if (position <= 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Deleting by the roll no
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted successfully.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted successfully.");
        }
    }

    // Searching by the roll Number
    public void searchByRollNo(int rollNo) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // Updating the grade
    public void updateGrade(int rollNo, String newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // Displaying all the students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            displayStudent(temp);
            System.out.println("---------------------");
            temp = temp.next;
        }
    }

    // Helper Method
    private void displayStudent(StudentNode s) {
        System.out.println("Roll No - " + s.rollNo);
        System.out.println("Name - " + s.name);
        System.out.println("Age - " + s.age);
        System.out.println("Grade - " + s.grade);
    }
}