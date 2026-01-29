package com.annotations;
import java.lang.annotation.*;

import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Manohar")
    public void completeTask() {
        System.out.println("Task completed");
    }
}

public class CustomAnnotationExample {
    public static void main(String[] args) throws Exception {

        TaskManager tm = new TaskManager();
        Method m = tm.getClass().getMethod("completeTask");

        TaskInfo info = m.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority());
        System.out.println("Assigned To: " + info.assignedTo());
    }
}