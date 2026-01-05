package hashmapandhashfunctions.checkpair;
import java.util.Scanner;

public class PairWithSumMain {
	
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the size  of the array");
	    	int size = sc.nextInt();

	        int[] arr = new int[size];
	        
	        System.out.println("Enter the elements  of the array");
	        for(int i=0;i<size;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        System.out.println("Enter target");
	        
	        	int target = sc.nextInt();
	        

	        boolean exists = PairWithGivenSum.hasPairWithSum(arr, target);
	        System.out.println("Pair exists is  " + exists);
	    }
	}

