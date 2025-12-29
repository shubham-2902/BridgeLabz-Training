//
//Phone Recharge Simulator
//Take the user's mobile operator and amount
//Use a switch to display offers.
//Loop to allow repeated recharges.
//Show balance after each recharge.
//
import java.util.Scanner;

public class PhoneRecharge{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;
        int choice;

        while (true) {

            System.out.println("\n1. Jio  2. Airtel  3. VI  4. BSNL  0. Exit");
            System.out.print("Choose operator:(Type serial number only)  ");
            choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.print("Enter recharge amount: ");
            double amount = sc.nextDouble();
            balance += amount;

            switch (choice) {
                case 1:
                    System.out.println("Recharge completed Succesfully for your Jio Sim");
                    break;
                case 2:
                    System.out.println("Recharge completed Succesfully for your Airtel Sim");
                    break;
                case 3:
                    System.out.println("Recharge completed Succesfully for your VI Sim");
                    break;
                case 4:
                    System.out.println("Recharge completed Succesfully for your BSNL Sim");
                    break;
                default:
                    System.out.println("Invalid choice");
                    balance -= amount; // undo recharge
                    continue;
            }

            System.out.println("Balance: Rs " + balance);
        }

        System.out.println("Final Balance: Rs " + balance);
        sc.close();
    }
}
