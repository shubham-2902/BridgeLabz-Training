package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

@Repeatable(BugReports.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReport {
    String description();
}

class Software {

    @BugReport(description = "Login button not working")
    @BugReport(description = "UI alignment issue")
    public void login() {
        System.out.println("Login method");
    }
}

public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {

        Software s = new Software();
        Method m = s.getClass().getMethod("login");

        BugReport[] reports = m.getAnnotationsByType(BugReport.class);

        for (BugReport b : reports) {
            System.out.println("Bug: " + b.description());
        }
    }
}