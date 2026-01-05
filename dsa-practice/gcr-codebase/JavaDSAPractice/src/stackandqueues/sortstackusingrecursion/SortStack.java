package stackandqueues.sortstackusingrecursion;

import java.util.Stack;

public class SortStack {
	

	    // Function to sort the stack
	    public static void sortStack(Stack<Integer> stack) {
	        if (!stack.isEmpty()) {
	            int top = stack.pop();
	            sortStack(stack);
	            insertInSortedOrder(stack, top);
	        }
	    }

	    // Helper function to insert element in sorted order
	    private static void insertInSortedOrder(Stack<Integer> stack, int value) {

	        // Base case: stack empty or correct position found
	        if (stack.isEmpty() || stack.peek() <= value) {
	            stack.push(value);
	            return;
	        }

	        int temp = stack.pop();
	        insertInSortedOrder(stack, value);
	        stack.push(temp);
	    }
	}


