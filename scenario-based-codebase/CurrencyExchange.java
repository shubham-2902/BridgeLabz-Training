//18. Currency Exchange Kiosk
//Design a currency converter:
//Take INR amount and target currency.
//Use a switch to apply the correct rate.
// Ask if the user wants another conversion (do-while).


import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        char again;

        do {
            System.out.print("Enter the INR amount: ");
            double amount = sc.nextDouble();

            System.out.println("""
                Choose conversion type:
                1. USD (United States Dollar)
                2. EUR (Euro)
                3. JPY (Japanese Yen)
                4. GBP (British Pound)
                5. CNY (Chinese Yuan)
            """);

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Converted Amount: " + (amount * 0.011) + " USD");
                    break;
                case 2:
                    System.out.println("Converted Amount: " + (amount * 0.0095) + " EUR");
                    break;
                case 3:
                    System.out.println("Converted Amount: " + (amount * 1.74) + " JPY");
                    break;
                case 4:
                    System.out.println("Converted Amount: " + (amount * 0.0083) + " GBP");
                    break;
                case 5:
                    System.out.println("Converted Amount: " + (amount * 0.078) + " CNY");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want another conversion? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("Thank You!");
        sc.close();
    }
}
