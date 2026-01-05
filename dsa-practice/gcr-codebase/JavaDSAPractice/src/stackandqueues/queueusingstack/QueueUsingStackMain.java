package stackandqueues.queueusingstack;

public class QueueUsingStackMain {
	
	    public static void main(String[] args) {

	        QueueUsingStack queue = new QueueUsingStack();

	        queue.enqueue(34);
	        queue.enqueue(21);
	        queue.enqueue(3013);

	        System.out.println("Dequeued Element is  " + queue.dequeue());
	        System.out.println("Front Element is - " + queue.peek());
	        System.out.println("Dequeued element is  " + queue.dequeue());
	        System.out.println("Dequeued element is  " + queue.dequeue());
	        System.out.println("Dequeued element is  " + queue.dequeue());
	    }
	}


