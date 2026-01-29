package com.reflection.generateJSON;
import java.lang.reflect.Field;

public class JsonConverter {

    public static String toJson(Object obj) throws Exception {

        Class<?> cls = obj.getClass();   // Get class info
        Field[] fields = cls.getDeclaredFields(); // Get all fields

        StringBuilder json = new StringBuilder("{");

        for (int i = 0; i < fields.length; i++) {

            Field field = fields[i];
            field.setAccessible(true);  // allow private access

            String fieldName = field.getName();      // get variable name
            Object value = field.get(obj);           // get variable value

            json.append("\"")
                .append(fieldName)
                .append("\":\"")
                .append(value)
                .append("\"");

            if (i < fields.length - 1) {
                json.append(",");
            }
        }

        json.append("}");
        return json.toString();
    }
}