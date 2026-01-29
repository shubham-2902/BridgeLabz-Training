package com.reflection.customobjectmapper;
import java.util.*;

class User {
    private String name;
    private int age;

    public String toString() {
        return name + " " + age;
    }
}

public class TestMapper {
    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Ram");
        data.put("age",88 );

        User user = ObjectMapperUtil.toObject(User.class, data);
        System.out.println(user);
    }
}