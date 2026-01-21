package com.day9.medwarehouse;

import java.util.List;

public class MergeSortMedicinesByExpiry {

    // Sort by expiry ASC (earliest expiry first), stable for equal expiry
    public void sort(List<Medicine> medicines) {
        if (medicines == null || medicines.size() <= 1) return;

        Medicine[] arr = medicines.toArray(new Medicine[0]);
        mergeSort(arr, 0, arr.length - 1);

        // copy back
        for (int i = 0; i < arr.length; i++) {
            medicines.set(i, arr[i]);
        }
    }

    private void mergeSort(Medicine[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(Medicine[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            int leftExpiry = DateUtil.toSortableDate(L[i].getExpiryDate());
            int rightExpiry = DateUtil.toSortableDate(R[j].getExpiryDate());

            if (leftExpiry < rightExpiry) {
                arr[k++] = L[i++];
            } else if (leftExpiry > rightExpiry) {
                arr[k++] = R[j++];
            } else {
                // stability: if expiry equal, take from left first
                arr[k++] = L[i++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
