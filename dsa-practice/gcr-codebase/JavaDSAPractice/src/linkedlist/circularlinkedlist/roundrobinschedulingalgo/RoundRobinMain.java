package linkedlist.circularlinkedlist.roundrobinschedulingalgo;

public class RoundRobinMain {
	
	    public static void main(String[] args) {

	        RoundRobinScheduler scheduler = new RoundRobinScheduler();

	        scheduler.addProcess(1, 10, 1);
	        scheduler.addProcess(2, 5, 2);
	        scheduler.addProcess(3, 8, 1);

	        System.out.println("Initial Process Queue - ");
	        scheduler.displayProcesses();

	        int timeQuantum = 3;
	        scheduler.simulate(timeQuantum);
	    }
	}


