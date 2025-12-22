import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generatePCMMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = (int) (Math.random() * 90) + 10; // Physics
            marks[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            marks[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }
        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = Math.round((total / 3.0) * 100) / 100.0;
            double percentage = Math.round((total / 300.0 * 100) * 100) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void displayScoreCard(int[][] marks, double[][] result) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                getGrade(result[i][2])
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = generatePCMMarks(students);
        double[][] result = calculateResults(marks);

        displayScoreCard(marks, result);
    }
}
