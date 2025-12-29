/**8. Shopkeeper’s Discount Dashboard 
A shopkeeper gives discounts based on total bill:
>Input item prices in a for-loop.
> Use if-else for discount logic.
> Use proper indentation, constants, and comments.
**/

import java.util.Scanner;
public class ShopDiscount
{
   public static void main (String args[])
    {
       Scanner sc = new Scanner(System.in);
       double totalBill = 0.0;
       double price;
       double discountedBill;
       // An infinite for loop since we don't know the number of itmes initally 
        for(;;)
        {
          System.out.println("Enter the price of the items and enter (-1) in case of exit");
                price = sc.nextDouble();
                if(price>0)
                {totalBill+=price;
                System.out.println("Your total bill is Rs "+totalBill);}

        if(price==-1)
         {
          System.out.println("Your total bill is Rs "+totalBill);
          break;
         }
         //price = sc.nextDouble();
         //totalBill+=price;
         }
         // Different if else block for discount checking
         if(totalBill>=1000)
         {
              discountedBill =totalBill-(0.1*totalBill);
              System.out.println(" Congratulations! You are eligible for flat 10 percent discount on your totalBill and your updated total Bill is Rs "+discountedBill);
           }
       else if(totalBill>=500)
         {
              discountedBill =totalBill-(0.05*totalBill);
              System.out.println("Congratulations! You are eligible for flat 5 percent discount on your totalBill and your updated total Bill is Rs  "+discountedBill);
           }
        else
           {
             System.out.println("Please shop for alleast Rs 500 to avail discount");
         }

          }

}