import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String coffeeType;

        // Loop continues until user types "exit"
        while (true) {

            System.out.print("\nEnter coffee type (Espresso / Cappuccino / Latte) or 'exit' to stop: ");
            coffeeType = scanner.next();

            // Exit condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting Ravi's Cafe");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            double pricePerCup = 0;

            // Decide coffee price using switch
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "cappuccino":
                    pricePerCup = 150;
                    break;
                case "latte":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue; // Skip rest and ask again
            }

            // Calculate total price
            double totalAmount = pricePerCup * quantity;
            double gst = totalAmount * 0.05; // 5% GST
            double finalBill = totalAmount + gst;

            // Display bill
            System.out.println("Total Amount: Rs " + totalAmount);
            System.out.println("GST (5%): Rs " + gst);
            System.out.println("Final Bill Amount: Rs " + finalBill);
        }

        scanner.close();
    }
}
