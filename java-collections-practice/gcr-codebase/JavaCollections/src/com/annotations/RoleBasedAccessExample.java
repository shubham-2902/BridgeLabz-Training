package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

// Step 2: Simulated User Context
class UserContext {
    static String currentRole = "USER"; // Change to ADMIN to allow access
}

// Step 3: Service Class
class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }

    public void viewDashboard() {
        System.out.println("Dashboard opened.");
    }
}

// Step 4: Access Controller
class AccessController {

    public static void invoke(Object obj, String methodName) throws Exception {

        Method m = obj.getClass().getMethod(methodName);

        if (m.isAnnotationPresent(RoleAllowed.class)) {
            String requiredRole = m.getAnnotation(RoleAllowed.class).value();

            if (!UserContext.currentRole.equals(requiredRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }
        m.invoke(obj);
    }
}

// Step 5: Main
public class RoleBasedAccessExample {
    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        AccessController.invoke(service, "deleteUser");   // Denied
        AccessController.invoke(service, "viewDashboard"); // Allowed

        UserContext.currentRole = "ADMIN";
        AccessController.invoke(service, "deleteUser");   // Allowed
    }
}