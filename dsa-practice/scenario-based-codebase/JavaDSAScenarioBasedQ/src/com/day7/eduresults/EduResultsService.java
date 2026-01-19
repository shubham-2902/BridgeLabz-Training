package com.day7.eduresults;
import java.util.ArrayList;
import java.util.List;

public class EduResultsService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student data available.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void printRankList() {
        if (students.isEmpty()) {
            System.out.println("No student data available.");
            return;
        }

        System.out.println("Final State Rank List (Score DESC):");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ") " + students.get(i));
        }
    }
}
