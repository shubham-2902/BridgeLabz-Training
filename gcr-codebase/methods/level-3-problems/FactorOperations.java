public class FactorOperations {

    public static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                count++;
        return count;
    }

    public static int[] findFactors(int num) {
        int count = countFactors(num);
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                factors[index++] = i;
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors)
            sum += f;
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors)
            product *= f;
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors)
            product *= Math.pow(f, 3);
        return product;
    }

    public static void main(String[] args) {
        int number = 6;
        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
    }
}
