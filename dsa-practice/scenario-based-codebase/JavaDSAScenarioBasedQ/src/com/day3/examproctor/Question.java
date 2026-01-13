package com.day3.examproctor;
public class Question {
    private int id;
    private String questionText;
    private String correctAnswer;

    public Question(int id, String questionText, String correctAnswer) {
        this.id = id;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
