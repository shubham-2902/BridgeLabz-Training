import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int students;

        System.out.print("Enter number of students: ");
        students = input.nextInt();

        int[][] marks = new int[students][3];   // [][0]-Physics, [][1]-Chemistry, [][2]-Maths
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {

            System.out.println("Enter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks, enter again");
                i--;
            }
        }

        for (int i = 0; i < students; i++) {

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("\nPhysics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < students; i++) {
            System.out.println(
                    marks[i][0] + "       " +
                    marks[i][1] + "        " +
                    marks[i][2] + "     " +
                    percentage[i] + "      " +
                    grade[i]
            );
        }

        input.close();
    }
}
