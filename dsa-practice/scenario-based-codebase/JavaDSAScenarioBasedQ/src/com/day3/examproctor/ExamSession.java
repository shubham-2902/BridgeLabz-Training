package com.day3.examproctor;
import java.util.*;

public class ExamSession {

    private List<Question> questions;                // question bank
    private Stack<Integer> navigationStack;          // track visited question ids
    private HashMap<Integer, String> answersMap;     // questionId -> answer

    public ExamSession() {
        questions = new ArrayList<>();
        navigationStack = new Stack<>();
        answersMap = new HashMap<>();
        loadDefaultQuestions();
    }

    // Function: Load questions
    private void loadDefaultQuestions() {
        questions.add(new Question(1, "Java is platform independent? (yes/no)", "yes"));
        questions.add(new Question(2, "Which keyword is used to inherit a class?", "extends"));
        questions.add(new Question(3, "Stack works on which principle? (LIFO/FIFO)", "LIFO"));
        questions.add(new Question(4, "HashMap stores data in? (key/value)", "key/value"));
        questions.add(new Question(5, "JVM stands for? (full form)", "Java Virtual Machine"));
    }

    // Function: show all question IDs
    public void showQuestions() {
        System.out.println("\nAvailable Questions:");
        for (Question q : questions) {
            System.out.println("Q" + q.getId() + ": " + q.getQuestionText());
        }
    }

    // Function: open question (push in stack)
    public void visitQuestion(int qId) {
        Question q = getQuestionById(qId);
        if (q == null) {
            System.out.println("Invalid question ID.");
            return;
        }

        navigationStack.push(qId);
        System.out.println("\nVisited Question ID: " + qId);
        System.out.println("Question: " + q.getQuestionText());

        if (answersMap.containsKey(qId)) {
            System.out.println("Saved Answer: " + answersMap.get(qId));
        } else {
            System.out.println("Saved Answer: Not answered yet.");
        }
    }

    // Function: answer question
    public void answerCurrentQuestion(String answer) {
        if (navigationStack.isEmpty()) {
            System.out.println("No question visited yet.");
            return;
        }

        int currentQId = navigationStack.peek();
        answersMap.put(currentQId, answer);
        System.out.println("Answer saved for Question " + currentQId);
    }

    // Function: go back using stack (pop)
    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No history available.");
            return;
        }

        int lastVisited = navigationStack.pop();
        System.out.println("Back from Question: " + lastVisited);

        if (!navigationStack.isEmpty()) {
            int previous = navigationStack.peek();
            visitQuestion(previous); // revisit previous (push again)
            // to avoid duplicate push, we can handle by a different method, but kept simple
        } else {
            System.out.println("No previous question.");
        }
    }

    // Function: show navigation history
    public void showNavigationHistory() {
        if (navigationStack.isEmpty()) {
            System.out.println("No navigation yet.");
            return;
        }
        System.out.println("\nNavigation Stack (Last visited at top): " + navigationStack);
    }

    // Function: show submitted answers
    public void showAnswers() {
        if (answersMap.isEmpty()) {
            System.out.println("No answers submitted yet.");
            return;
        }

        System.out.println("\nAnswers:");
        for (Map.Entry<Integer, String> entry : answersMap.entrySet()) {
            System.out.println("Q" + entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Function: submit exam and calculate score
    public void submitExam() {
        int score = calculateScore();  // function used for scoring logic
        System.out.println("\nExam Submitted Successfully.");
        System.out.println("Final Score: " + score + " / " + questions.size());
    }

    // Scoring function (Evaluation logic)
    private int calculateScore() {
        int score = 0;

        for (Question q : questions) {
            int qId = q.getId();

            if (answersMap.containsKey(qId)) {
                String studentAns = answersMap.get(qId).trim();
                String correctAns = q.getCorrectAnswer().trim();

                if (studentAns.equalsIgnoreCase(correctAns)) {
                    score++;
                }
            }
        }

        return score;
    }

    // Helper function: get question object by id
    private Question getQuestionById(int qId) {
        for (Question q : questions) {
            if (q.getId() == qId) return q;
        }
        return null;
    }
}
