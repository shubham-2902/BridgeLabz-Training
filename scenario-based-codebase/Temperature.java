import java.util.*;
public class Temperature{
	public static void main(String args[]){
		double temperature[]=new double[7];
		double mx=Integer.MIN_VALUE;
		double avg=0;
		
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++){
			System.out.println("Enter temperature of Day "+(i+1));
			temperature[i]=sc.nextDouble();
			avg+=temperature[i];
			if(temperature[i]>mx){
				mx=temperature[i];
			}
		}
		
		System.out.println("The maximum temperature is "+mx);
		System.out.println("The average temperature is "+avg/7);
	
	}

}