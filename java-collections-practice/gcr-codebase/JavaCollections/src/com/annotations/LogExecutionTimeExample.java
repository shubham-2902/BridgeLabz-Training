package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

// Step 2: Class with methods
class PerformanceService {

    @LogExecutionTime
    public void slowTask() {
        for (int i = 0; i < 1_000_000; i++); // Delay loop
    }

    @LogExecutionTime
    public void fastTask() {
        System.out.println("Quick task");
    }

    public void normalTask() {
        System.out.println("Not logged");
    }
}

// Step 3: Utility to invoke methods with timing
class ExecutionLogger {

    public static void invokeWithLogging(Object obj, String methodName) throws Exception {

        Method method = obj.getClass().getMethod(methodName);

        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            method.invoke(obj);
            long end = System.nanoTime();

            System.out.println(methodName + " execution time: " + (end - start) + " ns");
        } else {
            method.invoke(obj);
        }
    }
}

// Step 4: Main
public class LogExecutionTimeExample {
    public static void main(String[] args) throws Exception {

        PerformanceService ps = new PerformanceService();

        ExecutionLogger.invokeWithLogging(ps, "slowTask");
        ExecutionLogger.invokeWithLogging(ps, "fastTask");
        ExecutionLogger.invokeWithLogging(ps, "normalTask");
    }
}