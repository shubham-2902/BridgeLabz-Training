import java.util.Scanner;

public class BMIMultiplePersons {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int persons;

        System.out.print("Enter number of persons: ");
        persons = input.nextInt();

        double[] weight = new double[persons];
        double[] heightCm = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            heightCm[i] = input.nextDouble();
        }

        for (int i = 0; i < persons; i++) {

            double heightMeter = heightCm[i] / 100;
            bmi[i] = weight[i] / (heightMeter * heightMeter);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nHeight  Weight  BMI  Status");
        for (int i = 0; i < persons; i++) {
            System.out.println(
                    heightCm[i] + "cm  " +
                    weight[i] + "kg  " +
                    bmi[i] + "  " +
                    status[i]
            );
        }

        input.close();
    }
}
