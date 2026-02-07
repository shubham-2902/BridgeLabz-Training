package com.multithreading.printjobscheduler;
class PrintJob implements Runnable {

    private String jobName;
    private int pages;
    private int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {
        String level;

        if (priority >= 8) level = "High Priority";
        else if (priority >= 5) level = "Medium Priority";
        else level = "Low Priority";

        for (int i = 1; i <= pages; i++) {
            System.out.println("[" + level + "] Printing " + jobName +
                    " - Page " + i + " of " + pages);

            try {
                Thread.sleep(100); // 100ms per page
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(jobName + " completed by " + Thread.currentThread().getName());
    }
}
