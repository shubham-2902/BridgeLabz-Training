import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int n1, int n2) {
        if (n1 > n2)
            return 1;
        if (n1 == n2)
            return 0;
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i]))
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);

        if (result == 1)
            System.out.println("First element is greater than last");
        else if (result == 0)
            System.out.println("First and last elements are equal");
        else
            System.out.println("First element is less than last");

        sc.close();
    }
}
