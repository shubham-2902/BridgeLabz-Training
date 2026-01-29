package com.reflection.accessandmodifystaticfields;
import java.lang.reflect.Field;

public class StaticFieldModifier {
    public static void main(String[] args) throws Exception {

        Class<?> cls = Configuration.class;

        Field field = cls.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_APIapi414_KEY");

        String value = (String) field.get(null);
        System.out.println("Updated API KEY: " + value);
    }
}