package com.day4.edumentor;
public class Learner extends User implements ICertifiable {

    private String courseType; // Short / FullTime

    public Learner(int userId, String name, String email, String courseType) {
        super(userId, name, email);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate(double percentage) {
        if (percentage >= 50) {
            if (courseType.equalsIgnoreCase("Short")) {
                System.out.println(" Short Course Certificate Generated for " + name);
            } else {
                System.out.println("Full-Time Course Certificate Generated for " + name);
            }
        } else {
            System.out.println(" Certificate not generated (Insufficient score)");
        }
    }
}
