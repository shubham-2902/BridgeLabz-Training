import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter number of persons: ");
        number = input.nextInt();

        double[][] personData = new double[number][3]; // 0-weight, 1-height, 2-BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();

            if (personData[i][0] <= 0) {
                System.out.println("Invalid weight, enter again");
                i--;
                continue;
            }

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();

            if (personData[i][1] <= 0) {
                System.out.println("Invalid height, enter again");
                i--;
                continue;
            }
        }

        for (int i = 0; i < number; i++) {

            double heightMeter = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightMeter * heightMeter);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nWeight  Height  BMI  Status");
        for (int i = 0; i < number; i++) {
            System.out.println(
                    personData[i][0] + "kg  " +
                    personData[i][1] + "cm  " +
                    personData[i][2] + "  " +
                    weightStatus[i]
            );
        }

        input.close();
    }
}
