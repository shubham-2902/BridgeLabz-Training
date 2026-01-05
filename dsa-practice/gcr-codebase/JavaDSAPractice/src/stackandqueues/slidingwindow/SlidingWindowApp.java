package stackandqueues.slidingwindow;
import java.util.Scanner;
	public class SlidingWindowApp {
	    public static void main(String[] args) {

	        int[] arr=new int[8];
	        
	        Scanner sc=new Scanner(System.in);
	        for(int i=0;i<8;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        
	        int k = 3;

	        int[] result = SlidingWindowMaximum.maxSlidingWindow(arr, k);

	        System.out.print("Sliding Window Maximums: ");
	        for (int val : result) {
	            System.out.print(val + " ");
	        }
	    }
	}

