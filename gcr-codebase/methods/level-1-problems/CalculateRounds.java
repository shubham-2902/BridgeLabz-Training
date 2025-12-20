import java.util.Scanner;
public class CalculateRounds
{
 public static double roundsCalculator(double s1,double s2, double s3)
  { 
    double perimeter = s1+s2+s3;
    return (5.00*1000.00)/perimeter;

  }
  public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter the sides of triangle in meter");
 
  // taking input 
   double side1 = sc.nextDouble();
   double side2 = sc.nextDouble();
   double side3 = sc.nextDouble();
 System.out.println("The number of rounds needed to complete 5km run is :-  "+roundsCalculator(side1,side2,side3));

 
 }
}