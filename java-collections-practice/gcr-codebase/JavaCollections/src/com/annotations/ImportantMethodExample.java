package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";   // Optional parameter with default
}

// Step 2: Apply Annotation
class Service {

    @ImportantMethod
    public void processPayment() {
        System.out.println("Processing payment...");
    }

    @ImportantMethod(level = "CRITICAL")
    public void shutdownSystem() {
        System.out.println("System shutting down...");
    }

    public void normalTask() {
        System.out.println("Normal task");
    }
}

// Step 3: Read Using Reflection
public class ImportantMethodExample {
    public static void main(String[] args) {

        Method[] methods = Service.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + m.getName());
                System.out.println("Importance Level: " + im.level());
                System.out.println("---*---*---*---*---");
            }
        }
    }
}