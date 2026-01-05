package stackandqueues.queueusingstack;


import java.util.Stack;

class QueueUsingStack {

    private Stack<Integer> stackEnq = new Stack<>();
    private Stack<Integer> stackDeq = new Stack<>();

    // Enqueue operation
    public void enqueue(int data) {
        stackEnq.push(data);
        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        // Transfer elements only if dequeue stack is empty
        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }

        return stackDeq.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        if (stackDeq.isEmpty()) {
            while (!stackEnq.isEmpty()) {
                stackDeq.push(stackEnq.pop());
            }
        }

        return stackDeq.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stackEnq.isEmpty() && stackDeq.isEmpty();
    }
}