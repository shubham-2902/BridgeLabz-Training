package com.day1.HealthCheckPro;
import java.lang.reflect.Method;

public class HealthCheckPro {

    public static void main(String[] args) {
        Class<?> clazz = LabTestController.class;

        for (Method method : clazz.getDeclaredMethods()) {

            boolean isPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean requiresAuth = method.isAnnotationPresent(RequiresAuth.class);

            if (!isPublicAPI && !requiresAuth) {
                System.out.println(" Missing API metadata: " + method.getName());
            }

            if (requiresAuth) {
                RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
                System.out.println( method.getName() + " requires role: " + auth.role());
            }
        }
    }
}
