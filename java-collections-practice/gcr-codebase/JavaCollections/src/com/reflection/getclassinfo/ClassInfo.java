package com.reflection.getclassinfo;
import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("java.lang.Object");

        System.out.println("Class Name: " + cls.getName());

        System.out.println("\n--- Constructors ---");
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }

        System.out.println("\n--- Fields ---");
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("\n--- Methods ---");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}