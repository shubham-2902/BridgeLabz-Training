package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Field;

// Step 1: Define Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

// Step 2: User class with validation
class User {

    @MaxLength(8)
    private String username;

    public User(String username) throws Exception {
        this.username = username;
        validateFields();
    }

    private void validateFields() throws Exception {

        Field[] fields = this.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true);

                String value = (String) field.get(this);
                int max = field.getAnnotation(MaxLength.class).value();

                if (value != null && value.length() > max) {
                    throw new IllegalArgumentException(
                        field.getName() + " exceeds max length of " + max
                    );
                }
            }
        }
    }

    public String getUsername() {
        return username;
    }
}

// Step 3: Main
public class MaxLengthValidationExample {
    public static void main(String[] args) {

        try {
            User u1 = new User("Shubham");   // Valid
            System.out.println("User created: " + u1.getUsername());

            User u2 = new User("VeryLongUsername");  // Invalid
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}