package linkedlist.circularlinkedlist.taskscheduler;


public class TaskScheduler {

    private TaskNode head;
    private TaskNode current; 
    //Add at Beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add at End
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode=new TaskNode(id, name, priority, dueDate);

        if (head==null) {
            head=newNode;
            newNode.next=head;
            current=head;
            return;
        }

        TaskNode temp=head;
        while (temp.next!=head) {
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.next=head;
    }

    // 3️⃣ Add at Specific Position (1-based)
    public void addAtPosition(int position, int id, String name, int priority, String dueDate) {
        if (position <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    //  Remove by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == taskId) {

                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                    current = head;
                } else {
                    prev.next = temp.next;
                }

                System.out.println("Task removed successfully.");
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found!");
    }

    // View Current Task
    public void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        displayTask(current);
    }

    // Move to Next Task
    public void moveToNextTask() {
        if (current != null) {
            current = current.next;
            System.out.println("Moved to next task:");
            displayTask(current);
        }
    }

    // Display All Tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        do {
            displayTask(temp);
            System.out.println("-------------------");
            temp = temp.next;
        } while (temp != head);
    }

    //  Search by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with this priority.");
        }
    }

    // Helper Method
    private void displayTask(TaskNode t) {
        System.out.println("Task ID - " + t.taskId);
        System.out.println("Task Name - " + t.taskName);
        System.out.println("Priority - " + t.priority);
        System.out.println("Due Date - " + t.dueDate);
    }
}