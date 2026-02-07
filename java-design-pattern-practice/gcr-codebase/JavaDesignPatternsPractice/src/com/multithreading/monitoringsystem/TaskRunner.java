package com.multithreading.monitoringsystem;
class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            // Simulate computation
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " is working...");
            }

            // Sleep → TIMED_WAITING
            Thread.sleep(2000);

            // More computation
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " finishing work...");
            }

        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
    }
}
