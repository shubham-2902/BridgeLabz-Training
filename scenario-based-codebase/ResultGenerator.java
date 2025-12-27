import java.util.Scanner;

public class ResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;

        // Input marks using for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        // Calculate average
        int average = sum / marks.length;

        // Assign grade using switch
        /** used fall through behaviour of switch instead of if(grades>90) print A */
        char grade;
        switch (average / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
            case 7:
                grade = 'B';
                break;
            case 6:
                grade = 'C';
                break;
            case 5:
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        // Display result
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
