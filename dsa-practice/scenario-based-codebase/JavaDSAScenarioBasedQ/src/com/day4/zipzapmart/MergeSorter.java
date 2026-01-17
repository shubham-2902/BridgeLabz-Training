package com.day4.zipzapmart;
public class MergeSorter {

    public void mergeSort(Sale[] sales, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(sales, left, mid);
            mergeSort(sales, mid + 1, right);

            merge(sales, left, mid, right);
        }
    }

    private void merge(Sale[] sales, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Sale[] L = new Sale[n1];
        Sale[] R = new Sale[n2];

        for (int i = 0; i < n1; i++) L[i] = sales[left + i];
        for (int j = 0; j < n2; j++) R[j] = sales[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            // Stable: if equal, take from left
            if (compareSales(L[i], R[j]) <= 0) {
                sales[k++] = L[i++];
            } else {
                sales[k++] = R[j++];
            }
        }

        while (i < n1) sales[k++] = L[i++];
        while (j < n2) sales[k++] = R[j++];
    }

    // Sort key: DateTime ASC, then Amount ASC
    private int compareSales(Sale a, Sale b) {

        int dateCompare = a.getDateTime().compareTo(b.getDateTime());
        if (dateCompare != 0) return dateCompare;

        // If datetime equal, sort by amount
        if (a.getAmount() < b.getAmount()) return -1;
        if (a.getAmount() > b.getAmount()) return 1;

        return 0;
    }
}
