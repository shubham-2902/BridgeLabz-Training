package com.day1.EventTracker;

public class MainApp {

    public static void main(String[] args) {

        // Call methods normally
        UserService service = new UserService();
        service.login();
        service.uploadFile();
        service.deleteFile();
        service.viewDashboard();

        // Scan class for audit logs
        EventTracker.scanAndLog(UserService.class);
    }
}
