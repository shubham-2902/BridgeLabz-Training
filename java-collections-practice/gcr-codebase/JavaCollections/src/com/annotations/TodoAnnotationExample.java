package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

// Step 2: Apply Annotation
class ProjectModule {

    @Todo(task = "Implement login API", assignedTo = "Shubham", priority = "HIGH")
    public void loginFeature() {}

    @Todo(task = "Fix payment bug", assignedTo = "Rahul")
    public void paymentFix() {}

    @Todo(task = "Optimize database queries", assignedTo = "Anita", priority = "LOW")
    public void databaseOptimization() {}
}

// Step 3: Retrieve Using Reflection
public class TodoAnnotationExample {
    public static void main(String[] args) {

        Method[] methods = ProjectModule.class.getDeclaredMethods();

        System.out.println(" Pending Tasks:");
        System.out.println("<--------------------->");

        for (Method m : methods) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo todo = m.getAnnotation(Todo.class);
                System.out.println("Method: " + m.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("<--------------------->");
            }
        }
    }
}