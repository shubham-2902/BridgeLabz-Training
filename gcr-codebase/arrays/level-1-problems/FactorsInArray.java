import java.util.Scanner;

public class FactorsInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int maxFactor = 10;
        int index = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive number");
            System.exit(0);
        }

        int[] factors = new int[maxFactor];

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                if (index == maxFactor) {
                   // increases the size of maxFactor
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[index] = i;
                index++;
            }
        }

        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
