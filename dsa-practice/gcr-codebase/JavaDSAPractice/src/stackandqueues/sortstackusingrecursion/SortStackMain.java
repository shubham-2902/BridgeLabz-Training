package stackandqueues.sortstackusingrecursion;

import java.util.Stack;

public class SortStackMain {
	
	    public static void main(String[] args) {

	        Stack<Integer> stack = new Stack<>();

	        stack.push(40);
	        stack.push(30);
	        stack.push(55);
	        stack.push(26);

	        System.out.println("Original Stack: " + stack);

	        SortStack.sortStack(stack);

	        System.out.println("Sorted Stack: " + stack);
	    }
	}

