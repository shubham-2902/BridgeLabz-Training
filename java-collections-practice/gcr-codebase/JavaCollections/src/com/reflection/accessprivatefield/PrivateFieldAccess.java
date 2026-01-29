package com.reflection.accessprivatefield;
import java.lang.reflect.*;

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Class<?> cls = p.getClass();

        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);

        field.set(p, 35);

        int value = (int) field.get(p);
        System.out.println("Updated Age: " + value);
    }
}