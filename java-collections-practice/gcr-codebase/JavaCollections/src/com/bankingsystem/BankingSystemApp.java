package com.bankingsystem;
import java.util.*;

public class BankingSystemApp {

    // AccountNumber -> Balance
    private HashMap<String, Double> accounts = new HashMap<>();

    // Queue for withdrawal requests
    private Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    public void createAccount(String accNo, double initialBalance) {
        if (accounts.containsKey(accNo)) {
            System.out.println("Account already exists!");
            return;
        }
        accounts.put(accNo, initialBalance);
        System.out.println("Account created: " + accNo);
    }

    public void deposit(String accNo, double amount) {
        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found!");
            return;
        }
        accounts.put(accNo, accounts.get(accNo) + amount);
        System.out.println("Deposited ₹" + amount + " into " + accNo);
    }

    // Add withdrawal request to queue
    public void requestWithdrawal(String accNo, double amount) {
        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found!");
            return;
        }
        withdrawalQueue.add(new WithdrawalRequest(accNo, amount));
        System.out.println("Withdrawal request queued.");
    }

    // Process queue one by one
    public void processWithdrawals() {
        System.out.println("\n--- Processing Withdrawal Queue ---");

        if (withdrawalQueue.isEmpty()) {
            System.out.println("No pending withdrawal requests.");
            return;
        }

        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.remove();

            String acc = req.getAccountNumber();
            double amt = req.getAmount();
            double bal = accounts.get(acc);

            if (amt <= 0) {
                System.out.println(req + " -> Rejected (invalid amount)");
                continue;
            }

            if (bal >= amt) {
                accounts.put(acc, bal - amt);
                System.out.println(req + " -> Approved ✅ New Balance: ₹" + accounts.get(acc));
            } else {
                System.out.println(req + " -> Rejected ❌ (insufficient balance: ₹" + bal + ")");
            }
        }
    }

    // TreeMap sorting by balance (balance -> list of accounts)
    public void displayAccountsSortedByBalance() {
        System.out.println("\n--- Accounts Sorted By Balance (TreeMap) ---");

        TreeMap<Double, List<String>> sorted = new TreeMap<>();
        for (Map.Entry<String, Double> e : accounts.entrySet()) {
            double bal = e.getValue();
            sorted.putIfAbsent(bal, new ArrayList<>());
            sorted.get(bal).add(e.getKey());
        }

        for (Map.Entry<Double, List<String>> e : sorted.entrySet()) {
            System.out.println("₹" + e.getKey() + " -> " + e.getValue());
        }
    }

    public void displayAllAccounts() {
        System.out.println("\n--- Accounts (HashMap) ---");
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }
        for (Map.Entry<String, Double> e : accounts.entrySet()) {
            System.out.println("AccNo: " + e.getKey() + ", Balance: ₹" + e.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankingSystemApp bank = new BankingSystemApp();

        while (true) {
            System.out.println("\n================= BANKING SYSTEM MENU =================");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Request Withdrawal (Queue)");
            System.out.println("4. Process Withdrawals");
            System.out.println("5. Display All Accounts (HashMap)");
            System.out.println("6. Display Accounts Sorted by Balance (TreeMap)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int ch;
            try {
                ch = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            switch (ch) {
                case 1:
                    System.out.print("Enter account number: ");
                    String acc = sc.nextLine().trim();

                    System.out.print("Enter initial balance: ");
                    double init;
                    try { init = Double.parseDouble(sc.nextLine()); }
                    catch (Exception ex) { System.out.println("Invalid amount."); break; }

                    bank.createAccount(acc, init);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String a1 = sc.nextLine().trim();

                    System.out.print("Enter deposit amount: ");
                    double dep;
                    try { dep = Double.parseDouble(sc.nextLine()); }
                    catch (Exception ex) { System.out.println("Invalid amount."); break; }

                    bank.deposit(a1, dep);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String a2 = sc.nextLine().trim();

                    System.out.print("Enter withdrawal amount: ");
                    double w;
                    try { w = Double.parseDouble(sc.nextLine()); }
                    catch (Exception ex) { System.out.println("Invalid amount."); break; }

                    bank.requestWithdrawal(a2, w);
                    break;

                case 4:
                    bank.processWithdrawals();
                    break;

                case 5:
                    bank.displayAllAccounts();
                    break;

                case 6:
                    bank.displayAccountsSortedByBalance();
                    break;

                case 0:
                    System.out.println("Exiting Banking System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
