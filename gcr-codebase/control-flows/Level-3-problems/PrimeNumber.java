import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}
