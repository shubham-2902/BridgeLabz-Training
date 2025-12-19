import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {

            System.out.print("Enter a number: ");
            double value = input.nextDouble();

            if (value <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            numbers[index] = value;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);// Printed the numbers entered
            total = total + numbers[i];// printed the sum of all the numbers entered
        }

        System.out.println("Total sum = " + total);

        input.close();
    }
}
