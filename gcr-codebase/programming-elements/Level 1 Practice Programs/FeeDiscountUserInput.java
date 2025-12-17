import java.util.Scanner;

public class FeeDiscountUserInput 
 {
    public static void main(String[] args) 
      {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fee: ");
        double fee = sc.nextDouble();// took fee input from user

        System.out.print("Enter Discount Percentage: ");
        double discountPercent = sc.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println(
                "The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee
        );
     }
 }
