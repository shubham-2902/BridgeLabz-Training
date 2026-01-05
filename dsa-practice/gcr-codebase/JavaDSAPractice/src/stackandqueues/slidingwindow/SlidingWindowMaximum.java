package stackandqueues.slidingwindow;
import java.util.Deque;
import java.util.LinkedList;



	
	
	 public class SlidingWindowMaximum {

	    public static int[] maxSlidingWindow(int[] arr, int k) {

	        if (arr == null || k <= 0)
	            return new int[0];

	        int n = arr.length;
	        int[] result = new int[n - k + 1];
	        Deque<Integer> deque = new LinkedList<>();

	        for (int i = 0; i < n; i++) {

	            // 1️⃣ Remove elements out of this window
	            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
	                deque.pollFirst();
	            }

	            // 2️⃣ Remove smaller elements (useless)
	            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
	                deque.pollLast();
	            }

	            // 3️⃣ Add current index
	            deque.offerLast(i);

	            // 4️⃣ Store result once first window is complete
	            if (i >= k - 1) {
	                result[i - k + 1] = arr[deque.peekFirst()];
	            }
	        }
	        return result;
	    }
	}
