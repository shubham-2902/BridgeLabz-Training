import java.util.Scanner;
public class Bonus
  {
     public static void main(String args[])
       {
         System.out.println("Enter Year of Service");
          Scanner input = new Scanner(System.in);
          int serviceYear = input.nextInt();
          if(serviceYear>=5)
           {
            System.out.println("Enter Salary");
             int Salary = input.nextInt();
             int bonus = (Salary*5)/100;
             //int updatedSalary = bonus+Salary;
              System.out.println("Your bonus will be := "+bonus);
             }
         else
          { 
           System.out.println("You are not eligible"); 
           }
         }
 

   }