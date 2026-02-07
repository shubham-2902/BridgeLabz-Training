package com.multithreading.monitoringsystem;
public class ThreadStateSystem {
    public static void main(String[] args) {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(t1, t2);

        System.out.println("Before start: " + t1.getName() + " → " + t1.getState());

        t1.start();
        t2.start();
        monitor.start();
    }
}
