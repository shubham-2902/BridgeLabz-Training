package com.day7.fitnesstracker;
import java.util.List;

public class BubbleSortLeaderboard {

    // Sort users by steps DESC
    public void sort(List<UserSteps> users) {
        int n = users.size();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (users.get(j).getSteps() < users.get(j + 1).getSteps()) {
                    UserSteps temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) break; // already sorted
        }
    }
}
