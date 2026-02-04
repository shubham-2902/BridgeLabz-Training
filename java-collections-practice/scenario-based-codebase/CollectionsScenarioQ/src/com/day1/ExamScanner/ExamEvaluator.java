package com.day1.ExamScanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Pattern;

public class ExamEvaluator<T> {

    private static final Pattern LINE_PATTERN =
            Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

    private List<T> answerKey;

    public ExamEvaluator(List<T> answerKey) {
        this.answerKey = answerKey;
    }

    public Map<String, Integer> evaluate(String filePath) {
        Map<String, Integer> scores = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {

                if (!LINE_PATTERN.matcher(line).matches()) {
                    System.out.println("Invalid format skipped: " + line);
                    continue;
                }

                String[] parts = line.split(",");
                String name = parts[0];

                List<T> answers = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    answers.add((T) parts[i]);
                }

                AnswerSheet<T> sheet = new AnswerSheet<>(name, answers);
                scores.put(name, calculateScore(sheet));
            }

        } catch (Exception e) {
            System.out.println("Error reading file");
        }

        return scores;
    }

    private int calculateScore(AnswerSheet<T> sheet) {
        int score = 0;
        for (int i = 0; i < answerKey.size(); i++) {
            if (sheet.getAnswers().get(i).equals(answerKey.get(i)))
                score++;
        }
        return score;
    }

    public void rankStudents(Map<String, Integer> scores) {
        PriorityQueue<Map.Entry<String, Integer>> pq =
                new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        pq.addAll(scores.entrySet());

        System.out.println("\n🏆 Ranking:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
