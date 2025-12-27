import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ");
        int balance = sc.nextInt();

        while (balance > 0) {

            System.out.print("Enter distance to travell(km) or -1 to quit: ");
            int distance = sc.nextInt();

            if (distance == -1) {
                break;
            }

            // Fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 :
                       (distance <= 15) ? 20 : 30;

            if (fare > balance) {
                System.out.println("Insufficient balance!");
                break;
            }

            balance -= fare;

            System.out.println("Fare deducted: Rs " + fare);
            System.out.println("Remaining balance: Rs " + balance);
            System.out.println("---------------------------");
        }

        System.out.println("Transaction ended. Final balance: Rs " + balance);
        sc.close();
    }
}
