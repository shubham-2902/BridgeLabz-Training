import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status for a person
    public static String[] calculateBMIAndStatus(double weightKg, double heightCm) {
        double heightMeter = heightCm / 100;
        double bmi = weightKg / (heightMeter * heightMeter);

        // Round BMI to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
            String.valueOf(heightCm),
            String.valueOf(weightKg),
            String.valueOf(bmi),
            status
        };
    }

    // Method to process all persons data
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMIAndStatus(data[i][0], data[i][1]);
        }
        return result;
    }

    // Method to display BMI table
    public static void displayResult(String[][] bmiData) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < bmiData.length; i++) {
            System.out.println(
                bmiData[i][0] + "\t\t" +
                bmiData[i][1] + "\t\t" +
                bmiData[i][2] + "\t\t" +
                bmiData[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] personData = new double[10][2];

        // Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = sc.nextDouble();
        }

        String[][] bmiResult = processBMI(personData);
        displayResult(bmiResult);
    }
}
