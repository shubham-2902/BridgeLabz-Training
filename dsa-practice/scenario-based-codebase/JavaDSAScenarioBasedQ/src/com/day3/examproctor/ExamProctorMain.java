package com.day3.examproctor;
import java.util.Scanner;

public class ExamProctorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamSession exam = new ExamSession();

        while (true) {
            System.out.println("\n------ ExamProctor ------");
            System.out.println("1. Show All Questions");
            System.out.println("2. Visit a Question");
            System.out.println("3. Answer Current Question");
            System.out.println("4. Go Back (Navigation Stack)");
            System.out.println("5. Show Navigation History");
            System.out.println("6. Show Answers");
            System.out.println("7. Submit Exam (Auto Score)");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    exam.showQuestions();
                    break;

                case 2:
                    System.out.print("Enter Question ID to visit: ");
                    int qId = sc.nextInt();
                    sc.nextLine();
                    exam.visitQuestion(qId);
                    break;

                case 3:
                    System.out.print("Enter answer: ");
                    String answer = sc.nextLine();
                    exam.answerCurrentQuestion(answer);
                    break;

                case 4:
                    exam.goBack();
                    break;

                case 5:
                    exam.showNavigationHistory();
                    break;

                case 6:
                    exam.showAnswers();
                    break;

                case 7:
                    exam.submitExam();
                    break;

                case 8:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
