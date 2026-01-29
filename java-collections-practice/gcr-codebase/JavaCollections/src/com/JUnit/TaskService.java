package com.JUnit;
public class TaskService {

    public String longRunningTask() throws InterruptedException {
        Thread.sleep(3000); // 3 seconds
        return "Task Completed";
    }
}