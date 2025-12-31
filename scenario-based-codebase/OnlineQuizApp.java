import java.util.Scanner;

public class OnlineQuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Questions array
        String[] questions = {
            "1. Which keyword is used to create an object in Java?",
            "2. Which loop is guaranteed to execute at least once?",
            "3. What is the size of int in Java?",
            "4. Which operator is used for logical AND?",
            "5. Which method is the entry point of a Java program?"
        };

        // Options array
        String[][] options = {
            {"A. class", "B. new", "C. object", "D. create"},
            {"A. for", "B. while", "C. do-while", "D. foreach"},
            {"A. 2 bytes", "B. 4 bytes", "C. 8 bytes", "D. Depends on system"},
            {"A. &", "B. &&", "C. |", "D. ||"},
            {"A. start()", "B. run()", "C. main()", "D. init()"}
        };

        // Correct answers
        char[] answers = {'B', 'C', 'B', 'B', 'C'};

        int score = 0;

        System.out.println("Welcome to the Online Quiz Application");
        System.out.println("------------------------------------------------");

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            // Answer checking using switch
            switch (userAnswer) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } else {
                        System.out.println("Wrong Answer!");
                        System.out.println("Correct Answer is: " + answers[i]);
                    }
                    break;

                default:
                    System.out.println("Invalid Option! No marks awarded.");
            }

            System.out.println("------------------------------------------------");
        }

        // Final result
        System.out.println("Quiz Completed!");
        System.out.println("Your Final Score: " + score + " / " + questions.length);

        sc.close();
    }
}
