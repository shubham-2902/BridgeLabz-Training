package com.votingsystem;
import java.util.*;

public class VotingSystem {

    // Candidate -> Votes (fast update)
    private HashMap<String, Integer> voteCountMap = new HashMap<>();

    // Maintains order of votes (who got voted first / vote order)
    private LinkedHashMap<String, Integer> voteOrderMap = new LinkedHashMap<>();

    // Cast vote
    public void castVote(String candidate) {
        // update HashMap votes
        voteCountMap.put(candidate, voteCountMap.getOrDefault(candidate, 0) + 1);

        // for LinkedHashMap maintaining vote order:
        // if candidate appears first time, insert it
        if (!voteOrderMap.containsKey(candidate)) {
            voteOrderMap.put(candidate, 1);
        } else {
            voteOrderMap.put(candidate, voteOrderMap.get(candidate) + 1);
        }
    }

    // Display votes in insertion order (LinkedHashMap)
    public void displayVoteOrder() {
        System.out.println("\n--- Vote Order (LinkedHashMap) ---");
        if (voteOrderMap.isEmpty()) {
            System.out.println("No votes cast.");
            return;
        }
        for (Map.Entry<String, Integer> e : voteOrderMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    // Display results in sorted order (TreeMap by candidate name)
    public void displaySortedResults() {
        System.out.println("\n--- Sorted Results (TreeMap: Candidate Name) ---");

        if (voteCountMap.isEmpty()) {
            System.out.println("No votes cast.");
            return;
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteCountMap);
        for (Map.Entry<String, Integer> e : sortedMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    // Display actual vote count (HashMap)
    public void displayRawCount() {
        System.out.println("\n--- Vote Count (HashMap) ---");
        if (voteCountMap.isEmpty()) {
            System.out.println("No votes cast.");
            return;
        }
        System.out.println(voteCountMap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VotingSystem vs = new VotingSystem();

        while (true) {
            System.out.println("\n================= VOTING SYSTEM MENU =================");
            System.out.println("1. Cast Vote");
            System.out.println("2. Display Vote Count (HashMap)");
            System.out.println("3. Display Votes in Order (LinkedHashMap)");
            System.out.println("4. Display Sorted Results (TreeMap)");
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
                    System.out.print("Enter candidate name: ");
                    String candidate = sc.nextLine().trim();
                    if (candidate.isEmpty()) {
                        System.out.println("Candidate name cannot be empty.");
                        break;
                    }
                    vs.castVote(candidate);
                    System.out.println("Vote cast for: " + candidate);
                    break;

                case 2:
                    vs.displayRawCount();
                    break;

                case 3:
                    vs.displayVoteOrder();
                    break;

                case 4:
                    vs.displaySortedResults();
                    break;

                case 0:
                    System.out.println("Exiting Voting System...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
