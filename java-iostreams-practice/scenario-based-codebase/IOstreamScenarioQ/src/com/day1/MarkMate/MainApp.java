package com.day1.MarkMate;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        String inputFile = "marks.csv";
        String outputFile = "report.json";

        List<Student> students = CSVReader.readCSV(inputFile);
        JSONWriter.writeJSON(students, outputFile);
    }
}
