package com.day1.EventTracker;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.io.*;

public class EventTracker {

    public static void scanAndLog(Class<?> clazz) {

        Method[] methods = clazz.getDeclaredMethods();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("audit-log.json", true))) {

            for (Method method : methods) {

                if (method.isAnnotationPresent(AuditTrail.class)) {

                    AuditTrail audit = method.getAnnotation(AuditTrail.class);

                    String jsonLog = createJsonLog(method.getName(), audit.action());

                    bw.write(jsonLog);
                    bw.newLine();

                    System.out.println("Logged: " + audit.action());
                }
            }

        } catch (IOException e) {
            System.out.println("Logging error: " + e.getMessage());
        }
    }

    private static String createJsonLog(String methodName, String action) {
    	System.out.println("Creating log for: " + methodName);
        return "{ \"method\": \"" + methodName +
               "\", \"action\": \"" + action +
               "\", \"timestamp\": \"" + LocalDateTime.now() + "\" }";
               
    }
}
