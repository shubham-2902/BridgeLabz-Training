package com.day6.icecreamrush;
public class BubbleSortBySales {

    // Sort flavors in descending order by weekly sales
    public void sort(Flavor[] flavors) {
        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // optimization: stop early if already sorted

            for (int j = 0; j < n - 1 - i; j++) {
                if (flavors[j].getWeeklySales() < flavors[j + 1].getWeeklySales()) {
                    // adjacent swap
                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break; // already sorted, no need to continue
            }
        }
    }
}
