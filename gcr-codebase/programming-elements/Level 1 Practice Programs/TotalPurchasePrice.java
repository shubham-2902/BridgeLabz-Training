import java.util.Scanner;

public class TotalPurchasePrice 
   {
    public static void main(String[] args)
      {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity; // calculated the price here

        System.out.println(
                "The total purchase price is INR " + totalPrice +
                " if the quantity " + quantity +
                " and unit price is INR " + unitPrice
        );
      }
 }
