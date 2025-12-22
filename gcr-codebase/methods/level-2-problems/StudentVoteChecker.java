import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0)
            return false;
        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // created object of the class 
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            // calling the methods in if block
            if (checker.canStudentVote(ages[i]))
                System.out.println("Student can vote");
            else
                System.out.println("Student cannot vote");
        }

        sc.close();
    }
}
