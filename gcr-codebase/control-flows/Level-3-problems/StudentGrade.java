import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int physics, chemistry, maths;
        double average;
        char grade;
        String remarks;

        System.out.print("Enter Physics marks: ");
        physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        maths = input.nextInt();

        average = (physics + chemistry + maths) / 3.0;

        if (average >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching standards";
        } else if (average >= 50) {
            grade = 'D';
            remarks = "Level 1, well below standards";
        } else if (average >= 40) {
            grade = 'E';
            remarks = "Level 1, too below standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
