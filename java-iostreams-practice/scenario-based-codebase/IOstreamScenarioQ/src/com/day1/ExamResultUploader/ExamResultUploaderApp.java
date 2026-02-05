package com.day1.ExamResultUploader;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploaderApp {

    public static void main(String[] args) {

        Map<String, List<Integer>> subjectMarks = new HashMap<>();
        String regex = "\\d+,\\w+,\\w+,\\d+";

        ExamType<String> exam = new ExamType<>("Final Exam");

        try (BufferedReader br = new BufferedReader(new FileReader("marks2.csv"))) {

            String line;

            while ((line = br.readLine()) != null) {

                if (!line.matches(regex))
                    throw new InvalidMarksFormatException("Invalid format: " + line);

                String[] data = line.split(",");
                String subject = data[2];
                int marks = Integer.parseInt(data[3]);

                subjectMarks
                    .computeIfAbsent(subject, k -> new ArrayList<>())
                    .add(marks);
            }

        } catch (InvalidMarksFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nExam Type: " + exam.getExamName());

        //  Find top scorer per subject
        subjectMarks.forEach((subject, marksList) -> {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Collections.reverseOrder());

            pq.addAll(marksList);

            System.out.println("Top score in " + subject + ": " + pq.peek());
        });
    }
}
