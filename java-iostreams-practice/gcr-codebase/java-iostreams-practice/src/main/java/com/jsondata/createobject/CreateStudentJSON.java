package com.jsondata.createobject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.*;


class Student {
    public String name;
    public int age;
    public List<String> subjects;
}

public class CreateStudentJSON {
    public static void main(String[] args) {
        try {
            Student s = new Student();
            s.name = "Rahul";
            s.age = 20;
            s.subjects = Arrays.asList("Math", "Physics");

            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(new File("newStudent.json"), s);

            System.out.println("newStudent.json created successfully!");
        } catch (Exception e) {
            System.out.println("Failed to create student.json");
        }
    }
}
