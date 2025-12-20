import java.util.Scanner;

public class FactorsCalculator {

    // Method to find factors and return them in an array
    public static int[] findFactors(int number) {

        int count = 0;

        // First loop: count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array with factor count
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store the factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        // Display factors
        System.out.println("Factors of " + number + " are:");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum of factors = " + sumOfFactors(factors));
        System.out.println("Product of factors = " + productOfFactors(factors));
        System.out.println("Sum of squares of factors = " + sumOfSquaresOfFactors(factors));

        sc.close();
    }
}
