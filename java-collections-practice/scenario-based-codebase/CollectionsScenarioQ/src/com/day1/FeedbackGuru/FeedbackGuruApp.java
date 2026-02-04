package com.day1.FeedbackGuru;

public class FeedbackGuruApp {
    public static void main(String[] args) {

        FeedbackAnalyzer<String> analyzer = new FeedbackAnalyzer<>();

        analyzer.analyzeFile("service_feedback.txt", "Service");
        analyzer.analyzeFile("product_feedback.txt", "Product");

        analyzer.printSummary();
    }
}
