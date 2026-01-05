package linkedlist.circularlinkedlist.taskscheduler;

public class TaskSchedulerMain {
	
	    public static void main(String[] args) {

	        TaskScheduler scheduler = new TaskScheduler();

	        scheduler.addAtBeginning(1, "Design Module", 1, "12 sept");
	        scheduler.addAtEnd(2, "Implement Code", 2, "19 oct");
	        scheduler.addAtEnd(3, "Testing", 1, "27 july");

	        scheduler.addAtPosition(2, 4, "Documentation", 3, "20-Oct");

	        System.out.println("All Tasks - ");
	        scheduler.displayAllTasks();

	        System.out.println("\n Current Task:");
	        scheduler.viewCurrentTask();

	        System.out.println("\n Move to Next Task -");
	        scheduler.moveToNextTask();

	        System.out.println("\n Search Tasks with Priority 1 -");
	        scheduler.searchByPriority(1);

	        System.out.println("\n Remove Task with ID 2 -");
	        scheduler.removeByTaskId(2);

	        System.out.println("\n Final Task List -");
	        scheduler.displayAllTasks();
	    }
	}


