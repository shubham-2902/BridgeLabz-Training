package stackandqueues.stockspan;
import java.util.Scanner;

public class StockSpanMain {
	    public static void main(String[] args) {

	        int prices[]=new int[5];
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter each day prices");
	        
	        for(int i=0;i<5;i++) {
	        	prices[i]=sc.nextInt();
	        }

	        int[] span = StockSpanCalculator.calculateSpan(prices);

	        System.out.print("Stock Spans -> ");
	        for (int s : span) {
	            System.out.print(s + " ");
	        }
	    }
	}


