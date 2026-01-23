package com.day10.hospitalqueuemgmt;
import java.util.*;

public class HospitalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PatientAVLTree queue = new PatientAVLTree();

        // We use HashMap so discharge works correctly using patient name.
        // patientName -> checkInTime
        HashMap<String, Integer> patientTimeMap = new HashMap<>();

        while (true) {

            System.out.println("\n====== HOSPITAL QUEUE MENU ======");
            System.out.println("1. Patient Registration");
            System.out.println("2. Discharge Patient (Delete)");
            System.out.println("3. Display Patients by Arrival Time");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1: {
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();

                    if (patientTimeMap.containsKey(name)) {
                        System.out.println("Patient already registered!");
                        break;
                    }

                    System.out.print("Enter check-in time (HHMM e.g. 0930 or 1445): ");
                    int time = sc.nextInt();

                    // validate time
                    int hours = time / 100;
                    int minutes = time % 100;

                    if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
                        System.out.println("Invalid time. Try again!");
                        break;
                    }

                    // register
                    queue.registerPatient(time, name);
                    patientTimeMap.put(name, time);

                    System.out.println("Patient registered at " + PatientAVLTree.formatTime(time));
                    break;
                }

                case 2: {
                    System.out.print("Enter patient name to discharge: ");
                    String name = sc.nextLine();

                    if (!patientTimeMap.containsKey(name)) {
                        System.out.println("Patient not found!");
                        break;
                    }

                    int time = patientTimeMap.get(name);

                    queue.dischargePatient(time, name);
                    patientTimeMap.remove(name);

                    System.out.println("Patient discharged successfully.");
                    break;
                }

                case 3:
                    queue.displayByArrivalTime();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
