package com.reflection.methodexecutiontime;
import java.lang.reflect.Method;

public class MethodTimer {

    public static void executeWithTiming(Object obj, String methodName) throws Exception {

        Class<?> cls = obj.getClass();

        Method method = cls.getMethod(methodName);

        long start = System.nanoTime();

        method.invoke(obj);

        long end = System.nanoTime();

        long duration = end - start;

        System.out.println("Execution time of " + methodName + "(): " + duration + " ns");
    }
}