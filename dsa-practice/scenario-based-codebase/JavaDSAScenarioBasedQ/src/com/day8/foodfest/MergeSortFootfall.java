package com.day8.foodfest;
import java.util.List;

public class MergeSortFootfall {

    // Sort by footfall DESC; stable for equal footfall
    public void sort(List<StallFootfall> list) {
        if (list == null || list.size() <= 1) return;

        StallFootfall[] arr = list.toArray(new StallFootfall[0]);
        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            list.set(i, arr[i]);
        }
    }

    private void mergeSort(StallFootfall[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(StallFootfall[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        StallFootfall[] L = new StallFootfall[n1];
        StallFootfall[] R = new StallFootfall[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable: equal footfall -> take from LEFT first
        while (i < n1 && j < n2) {
            if (L[i].getFootfall() > R[j].getFootfall()) {
                arr[k++] = L[i++];
            } else if (L[i].getFootfall() < R[j].getFootfall()) {
                arr[k++] = R[j++];
            } else {
                arr[k++] = L[i++]; // stability
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
