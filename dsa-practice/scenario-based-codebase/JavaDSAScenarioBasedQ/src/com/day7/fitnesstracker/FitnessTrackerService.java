package com.day7.fitnesstracker;
import java.util.ArrayList;
import java.util.List;

public class FitnessTrackerService {

    private List<UserSteps> group = new ArrayList<>();

    public void addUser(UserSteps u) {
        group.add(u);
    }

    public List<UserSteps> getGroup() {
        return group;
    }

    public UserSteps findUser(String username) {
        for (UserSteps u : group) {
            if (u.getUsername().equalsIgnoreCase(username)) return u;
        }
        return null;
    }

    public void printGroup() {
        if (group.isEmpty()) {
            System.out.println("No users in group.");
            return;
        }

        for (UserSteps u : group) {
            System.out.println(u);
        }
    }

    public void printLeaderboard() {
        if (group.isEmpty()) {
            System.out.println("No users in group.");
            return;
        }

        System.out.println("Daily Leaderboard:");
        for (int i = 0; i < group.size(); i++) {
            System.out.println((i + 1) + ") " + group.get(i));
        }
    }
}
