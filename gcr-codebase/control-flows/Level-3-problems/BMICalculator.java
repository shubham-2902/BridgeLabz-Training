import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double heightCm;
        double heightMeter;
        double bmi;

        System.out.print("Enter weight in kg: ");
        weight = input.nextDouble();

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        heightMeter = heightCm / 100;
        bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);

        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        input.close();
    }
}
