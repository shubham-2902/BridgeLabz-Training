package linkedlist.circularlinkedlist.roundrobinschedulingalgo;

public class ProcessNode {
	
		//Declaration
	    int processId;
	    int burstTime;        
	    int priority;

	    int waitingTime;
	    int turnaroundTime;

	    ProcessNode next;

	    //Constructor
	    ProcessNode(int processId, int burstTime, int priority) {
	        this.processId = processId;
	        this.burstTime = burstTime;
	        this.priority = priority;
	        this.waitingTime = 0;
	        this.turnaroundTime = 0;
	        this.next = null;
	    }
	}


