package com.reflection.methodexecutiontime;
public class Task {

    public void performTask() throws InterruptedException {
        Thread.sleep(500);   // simulate work
        System.out.println("Task completed");
    }
}