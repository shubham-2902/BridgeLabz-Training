package com.insurancepolicymgmt.usingmap;
import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyApp {

    private static Policy readPolicy(Scanner sc) {
        System.out.print("Enter Policy Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Policyholder Name: ");
        String holder = sc.nextLine();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        LocalDate expiry = LocalDate.parse(sc.nextLine());

        System.out.print("Enter Coverage Type (Health/Auto/Home): ");
        String coverage = sc.nextLine();

        System.out.print("Enter Premium Amount: ");
        double premium = Double.parseDouble(sc.nextLine());

        return new Policy(number, holder, expiry, coverage, premium);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolicyManagerMap manager = new PolicyManagerMap();

        while (true) {
            System.out.println("\n================ INSURANCE POLICY SYSTEM (MAP) ================");
            System.out.println("1. Add Policy");
            System.out.println("2. Retrieve Policy by Number");
            System.out.println("3. List Policies Expiring Within Next 30 Days");
            System.out.println("4. List Policies by Policyholder Name");
            System.out.println("5. Remove Expired Policies");
            System.out.println("6. Display Policies using HashMap");
            System.out.println("7. Display Policies using LinkedHashMap");
            System.out.println("8. Display Policies using TreeMap (Sorted by Expiry)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                continue;
            }

            switch (choice) {
                case 1: {
                    Policy p = readPolicy(sc);
                    manager.addPolicy(p);
                    System.out.println("Policy added/updated successfully.");
                    break;
                }

                case 2: {
                    System.out.print("Enter Policy Number: ");
                    String number = sc.nextLine();

                    Policy p = manager.getPolicyByNumber(number);
                    if (p == null) {
                        System.out.println("Policy not found.");
                    } else {
                        System.out.println("Policy Found: " + p);
                    }
                    break;
                }

                case 3: {
                    List<Policy> list = manager.getPoliciesExpiringWithinDays(30);
                    System.out.println("\n--- Policies Expiring Within Next 30 Days ---");
                    if (list.isEmpty()) {
                        System.out.println("No policies expiring within 30 days.");
                    } else {
                        for (Policy p : list) System.out.println(p);
                    }
                    break;
                }

                case 4: {
                    System.out.print("Enter Policyholder Name: ");
                    String holder = sc.nextLine();

                    List<Policy> list = manager.getPoliciesByPolicyHolder(holder);
                    System.out.println("\n--- Policies for Policyholder: " + holder + " ---");
                    if (list.isEmpty()) {
                        System.out.println("No policies found for this policyholder.");
                    } else {
                        for (Policy p : list) System.out.println(p);
                    }
                    break;
                }

                case 5: {
                    int removed = manager.removeExpiredPolicies();
                    System.out.println("Expired policies removed: " + removed);
                    break;
                }

                case 6:
                    manager.displayAllHashMap();
                    break;

                case 7:
                    manager.displayAllLinkedHashMap();
                    break;

                case 8:
                    manager.displayAllTreeMap();
                    break;

                case 0:
                    System.out.println("Exiting... Thank you.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
