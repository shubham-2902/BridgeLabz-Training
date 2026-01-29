
package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Field;

// Step 1: Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

// Step 2: Model Class (RENAMED to avoid conflict)
class JsonUser {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public JsonUser(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

// Step 3: JSON Converter
class JsonConverter {

    public static String toJson(Object obj) throws Exception {

        StringBuilder json = new StringBuilder("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field f : fields) {
            if (f.isAnnotationPresent(JsonField.class)) {
                f.setAccessible(true);
                JsonField jf = f.getAnnotation(JsonField.class);

                json.append("\"")
                    .append(jf.name())
                    .append("\":\"")
                    .append(f.get(obj))
                    .append("\",");
            }
        }

        // Remove last comma
        if (json.charAt(json.length() - 1) == ',') {
            json.deleteCharAt(json.length() - 1);
        }

        json.append("}");
        return json.toString();
    }
}

// Step 4: Main Class
public class JsonFieldSerializationExample {
    public static void main(String[] args) throws Exception {

        JsonUser u = new JsonUser("Shubham", 22);

        String json = JsonConverter.toJson(u);
        System.out.println(json);
    }
}