package com.reflection.dynamicallycreateobject;
public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("com.reflection.dynamicallycreateobject.Student");

        Object obj = cls.getDeclaredConstructor().newInstance();

        Student s = (Student) obj;
        s.display();
    }
}