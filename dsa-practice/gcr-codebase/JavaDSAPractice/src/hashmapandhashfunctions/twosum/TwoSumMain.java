package hashmapandhashfunctions.twosum;
import java.util.*;

public class TwoSumMain {
	    public static void main(String[] args) {

	    	//Taking the input from the user
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the size of the array and enter elements");
	    	int n= sc.nextInt();
	        int[] nums = new int[n];
	        for(int i=0;i<n;i++) {
	        	nums[i]=sc.nextInt();
	        }
	        System.out.println("Enter target:");
	        int target = sc.nextInt();

	        //Calling the function
	        int[] result = TwoSumSolver.twoSum(nums,target);

	        if(result.length==0) {
	        	System.out.println("No indices found");
	        	
	        }
	        else
	        {
	        //printing out the desired results
	        System.out.println("Indices are -  "+ result[0]+","+result[1]);
	    }
	        }
	}


