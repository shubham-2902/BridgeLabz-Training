package com.day7.eduresults;
import java.util.List;

public class MergeSortRankList {

    // Sort students by score DESC; stable when scores are same
    public void sort(List<Student> students) {
        if (students == null || students.size() <= 1) return;

        Student[] arr = students.toArray(new Student[0]);
        mergeSort(arr, 0, arr.length - 1);

        // Copy back to list
        for (int i = 0; i < arr.length; i++) {
            students.set(i, arr[i]);
        }
    }

    private void mergeSort(Student[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private void merge(Student[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Stable merge: if score equal, pick LEFT first
        while (i < n1 && j < n2) {
            if (L[i].getScore() > R[j].getScore()) {
                arr[k++] = L[i++];
            } else if (L[i].getScore() < R[j].getScore()) {
                arr[k++] = R[j++];
            } else {
                arr[k++] = L[i++]; // stability maintained for equal scores
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
