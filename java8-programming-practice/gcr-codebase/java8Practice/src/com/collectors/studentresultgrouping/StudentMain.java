package com.collectors.studentresultgrouping;
import java.util.*;
import java.util.stream.*;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Amit", "A"),
            new Student("Riya", "B"),
            new Student("Karan", "A"),
            new Student("Neha", "C")
        );

        Map<String, List<String>> result =
            students.stream()
                    .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, Collectors.toList())
                    ));

        result.forEach((grade, names) ->
            System.out.println("Grade " + grade + " : " + names));
    }
}
