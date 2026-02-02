package com.jsondata.objecttojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;

class User {
    public String name;
    public int age;
    User(String n, int a){ name=n; age=a; }
}

public class ListToJSON {
    public static void main(String[] args) {
        try {
            List<User> users = Arrays.asList(
                new User("Rahul", 25),
                new User("Anita", 28)
            );

            new ObjectMapper().writeValue(new File("users.json"), users);
            System.out.println("users.json created!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
