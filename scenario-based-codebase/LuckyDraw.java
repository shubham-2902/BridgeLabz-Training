// Festival Lucky Draw 🎉
//At Diwali mela, each visitor draws a number.
//If the number is divisible by 3 and 5, they win a gift.
//● Use if, modulus, and loop for multiple visitors.
//● continue if input is invalid.

import java.util.Scanner;
public class LuckyDraw
 { 
   public static void main(String args[])
     {
       Scanner sc = new Scanner(System.in);
       
        int visitor =0;
         while(visitor<10) 
              {
                System.out.println("Enter your number");
                // taking input from user
                int number= sc.nextInt();
                            
              if(number%3==0 && number %5==0)
               {
               System.out.println("Congratulations You won a gift");
                visitor++;
               }
        else
            {
              System.out.println(" Better luck next Time");
              visitor++;
            }
              }
            }
}