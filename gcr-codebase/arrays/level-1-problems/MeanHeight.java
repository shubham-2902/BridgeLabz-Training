import java.util.Scanner;
public class MeanHeight
 {
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Heights of footballer ");
    double Heights [] = new double[11];
    double Sum = 0.0;
    for(int i=0;i<Heights.length;i++)
     {
       Heights[i] = sc.nextDouble();
       Sum+=Heights[i];  
     }
   double meanHeight = Sum/11;
   System.out.println("The mean heights of the  football team is "+ meanHeight);


  }
 }