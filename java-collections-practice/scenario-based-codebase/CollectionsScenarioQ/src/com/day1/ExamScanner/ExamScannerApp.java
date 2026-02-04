package com.day1.ExamScanner;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExamScannerApp {
    public static void main(String[] args) {

        List<String> answerKey = Arrays.asList("A","B","C","D","A","B","C");

        ExamEvaluator<String> evaluator = new ExamEvaluator<>(answerKey);

        Map<String, Integer> scores = evaluator.evaluate("Resources/answers.csv");


        evaluator.rankStudents(scores);
    }
}
