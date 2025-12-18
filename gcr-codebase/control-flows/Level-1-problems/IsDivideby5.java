import java.util.Scanner;
public class IsDivideby5
 {
  public static void main(String args[])
  {
   Scanner sc  = new Scanner(System.in);
   System.out.println("Enter the number: ");
   int number = sc.nextInt();
    String result;
    if(number%5==0)
     {
       result = "Yes";
      } 
     else
         { 
           result = "No";
          }
     
       System.out.println("Is the number "+number+" divisible by 5 ? " + result);
       
  }
 }
 