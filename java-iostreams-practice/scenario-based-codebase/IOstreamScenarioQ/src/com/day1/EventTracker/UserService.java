package com.day1.EventTracker;

public class UserService {

    @AuditTrail(action = "User Login")
    public void login() {
        System.out.println("User logged in");
    }

    @AuditTrail(action = "File Upload")
    public void uploadFile() {
        System.out.println("File uploaded");
    }

    @AuditTrail(action = "File Deleted")
    public void deleteFile() {
        System.out.println("File deleted");
    }

    public void viewDashboard() {  // No annotation → not logged
        System.out.println("Dashboard viewed");
    }
}
