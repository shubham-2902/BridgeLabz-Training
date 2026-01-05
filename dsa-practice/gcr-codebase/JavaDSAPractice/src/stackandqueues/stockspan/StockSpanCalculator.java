package stackandqueues.stockspan;
import java.util.Stack;

public class StockSpanCalculator {


	    public static int[] calculateSpan(int[] prices) {

	        int n = prices.length;
	        int[] span = new int[n];
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < n; i++) {

	            // Pop elements while current price is higher
	            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
	                stack.pop();
	            }

	            // If stack empty, span is i+1
	            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();

	            // Push current index
	            stack.push(i);
	        }

	        return span;
	    }
	}

