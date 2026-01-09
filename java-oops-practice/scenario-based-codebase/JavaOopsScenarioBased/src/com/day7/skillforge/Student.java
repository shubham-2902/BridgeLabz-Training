package com.day7.skillforge;
public class Student extends User implements ICertifiable {

    private int completedModules;
    private int totalModules;

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int completed, int total) {
        completedModules = completed;
        totalModules = total;
    }

    // Progress calculation using operators
    public int getProgressPercentage() {
        return (completedModules * 100) / totalModules;
    }

    // Polymorphic certificate generation
    @Override
    public void generateCertificate() {
        if (getProgressPercentage() >= 80) {
            System.out.println(" Certificate Generated for " + name);
        } else {
            System.out.println("Course not completed yet.");
        }
    }
}
