import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input height and weight
        System.out.print("Enter height in meters: ");
        double heightInMeters = scanner.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Calculate BMI
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determine BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        scanner.close();
    }
}
