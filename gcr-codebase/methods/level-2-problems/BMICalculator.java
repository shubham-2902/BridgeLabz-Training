import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate 3rd column
    public static void calculateBMI(double[][] personData) {

        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];          // kg
            double heightCm = personData[i][1];        // cm
            double heightM = heightCm / 100;           // convert to meters

            double bmi = weight / (heightM * heightM);
            personData[i][2] = bmi;                    // store BMI
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] personData) {

        String[] status = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];

            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10 persons, 3 columns (weight, height, BMI)
        double[][] personData = new double[10][3];

        System.out.println("Enter Weight (kg) and Height (cm) for 10 persons");

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(personData);

        // Determine Status
        String[] bmiStatus = determineBMIStatus(personData);

        // Display Output
        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf(
                "%d\t%.2f\t%.2f\t%.2f\t%s\n",
                (i + 1),
                personData[i][0],
                personData[i][1],
                personData[i][2],
                bmiStatus[i]
            );
        }

        sc.close();
    }
}
