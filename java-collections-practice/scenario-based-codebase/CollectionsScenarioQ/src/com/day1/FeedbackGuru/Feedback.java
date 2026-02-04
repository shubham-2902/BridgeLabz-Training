package com.day1.FeedbackGuru;

public class Feedback<T> {
    private T type; // Product / Service
    private String message;

    public Feedback(T type, String message) {
        this.type = type;
        this.message = message;
    }

    public T getType() { return type; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}
