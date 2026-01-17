package com.day4.exmacell;
public class ExamRanker {

    // Merge two pre-sorted arrays (by score desc)
    // Stable: if scores equal, pick left first
    public Student[] mergeTwoCenters(Student[] A, Student[] B) {
        Student[] merged = new Student[A.length + B.length];

        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (compare(A[i], B[j]) <= 0) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }

        while (i < A.length) merged[k++] = A[i++];
        while (j < B.length) merged[k++] = B[j++];

        return merged;
    }

    // Comparator: score DESC (higher score first)
    // For stable rank list:
    // - if score equal, roll number ASC as tie-breaker
    private int compare(Student s1, Student s2) {
        if (s1.getScore() > s2.getScore()) return -1;
        if (s1.getScore() < s2.getScore()) return 1;

        // Tie-breaker: rollNo ASC
        return s1.getRollNo().compareToIgnoreCase(s2.getRollNo());
    }

    // Optional: merge sort if input array is NOT sorted
    public void mergeSort(Student[] students, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(students, left, mid);
            mergeSort(students, mid + 1, right);
            merge(students, left, mid, right);
        }
    }

    private void merge(Student[] students, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++) L[i] = students[left + i];
        for (int j = 0; j < n2; j++) R[j] = students[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            // Stable
            if (compare(L[i], R[j]) <= 0) {
                students[k++] = L[i++];
            } else {
                students[k++] = R[j++];
            }
        }

        while (i < n1) students[k++] = L[i++];
        while (j < n2) students[k++] = R[j++];
    }

    public void printRankList(Student[] all, int topN) {
        int limit = Math.min(topN, all.length);
        for (int i = 0; i < limit; i++) {
            System.out.println("Rank " + (i + 1) + ": " + all[i]);
        }
    }
}
