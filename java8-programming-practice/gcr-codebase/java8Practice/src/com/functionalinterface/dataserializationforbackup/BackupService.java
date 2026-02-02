package com.functionalinterface.dataserializationforbackup;
class BackupService {

    public static void processBackup(Object obj) {
        if (obj instanceof BackupEligible) {
            System.out.println("Backing up object data...");
        } else {
            System.out.println("Object not eligible for backup.");
        }
    }

    public static void main(String[] args) {
        CustomerData customer = new CustomerData();
        String normalString = "Test Data";

        processBackup(customer);
        processBackup(normalString);
    }
}
