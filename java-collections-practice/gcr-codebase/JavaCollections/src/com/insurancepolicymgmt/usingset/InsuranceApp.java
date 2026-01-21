package com.insurancepolicymgmt.usingset;
import java.time.LocalDate;
import java.util.*;

public class InsuranceApp {

    public static Policy readPolicy(Scanner sc) {

        System.out.print("Enter Policy Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Policyholder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        String expiryStr = sc.nextLine();
        LocalDate expiryDate = LocalDate.parse(expiryStr);

        System.out.print("Enter Coverage Type (Health/Auto/Home): ");
        String coverage = sc.nextLine();

        System.out.print("Enter Premium Amount: ");
        double premium = Double.parseDouble(sc.nextLine());

        return new Policy(number, name, expiryDate, coverage, premium);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PolicyManager manager = new PolicyManager();

        while (true) {
            System.out.println("\n================ INSURANCE POLICY MENU ================");
            System.out.println("1. Add Policy");
            System.out.println("2. Display All Unique Policies (HashSet)");
            System.out.println("3. Display Policies in Insertion Order (LinkedHashSet)");
            System.out.println("4. Display Policies Sorted by Expiry Date (TreeSet)");
            System.out.println("5. Display Policies Expiring Within Next 30 Days");
            System.out.println("6. Display Policies by Coverage Type");
            System.out.println("7. Display Duplicate Policy Numbers");
            System.out.println("8. Remove Policy by Policy Number");
            System.out.println("9. Search Policy by Policy Number");
            System.out.println("10. Performance Comparison (HashSet vs LinkedHashSet vs TreeSet)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

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
                    System.out.println("Policy added (if duplicate policy number, it won't be added in unique sets).");
                    break;
                }
                case 2:
                    manager.displayAllUniquePolicies();
                    break;

                case 3:
                    manager.displayPoliciesInsertionOrder();
                    break;

                case 4:
                    manager.displayPoliciesSortedByExpiry();
                    break;

                case 5:
                    manager.displayPoliciesExpiringSoon(30);
                    break;

                case 6: {
                    System.out.print("Enter coverage type to search: ");
                    String type = sc.nextLine();
                    manager.displayPoliciesByCoverageType(type);
                    break;
                }

                case 7:
                    manager.displayDuplicatePolicyNumbers();
                    break;

                case 8: {
                    System.out.print("Enter policy number to remove: ");
                    String num = sc.nextLine();
                    boolean removed = manager.removePolicy(num);
                    System.out.println(removed ? "Policy removed successfully." : "Policy not found.");
                    break;
                }

                case 9: {
                    System.out.print("Enter policy number to search: ");
                    String num = sc.nextLine();
                    boolean found = manager.containsPolicy(num);
                    System.out.println(found ? "Policy exists." : "Policy not found.");
                    break;
                }

                case 10: {
                    // Create random list for performance test
                    System.out.print("Enter number of policies to generate for testing: ");
                    int n = Integer.parseInt(sc.nextLine());

                    List<Policy> testPolicies = new ArrayList<>();
                    LocalDate base = LocalDate.now();

                    for (int i = 1; i <= n; i++) {
                        String pn = "P" + i;
                        String holder = "Holder" + i;
                        LocalDate expiry = base.plusDays(i % 365);
                        String coverage = (i % 3 == 0) ? "Health" : (i % 3 == 1 ? "Auto" : "Home");
                        double premium = 1000 + (i % 500);

                        testPolicies.add(new Policy(pn, holder, expiry, coverage, premium));
                    }

                    // choose one policy number for search and remove
                    String searchPolicy = "P" + (n / 2);
                    String removePolicy = "P" + (n / 3);

                    manager.comparePerformance(testPolicies, searchPolicy, removePolicy);
                    break;
                }

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
