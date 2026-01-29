package com.reflection.generateJSON;
public class TestJson {
    public static void main(String[] args) throws Exception {

        Person p = new Person("Shyam", 22);

        String json = JsonConverter.toJson(p);

        System.out.println(json);
    }
}