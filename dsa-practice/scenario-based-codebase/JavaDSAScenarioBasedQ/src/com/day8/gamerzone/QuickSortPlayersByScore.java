package com.day8.gamerzone;
import java.util.List;

public class QuickSortPlayersByScore {

    // Sort players by score DESC
    public void sort(List<Player> players) {
        if (players == null || players.size() <= 1) return;

        Player[] arr = players.toArray(new Player[0]);
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            players.set(i, arr[i]);
        }
    }

    private void quickSort(Player[] arr, int low, int high) {
        if (low >= high) return;

        int pIndex = partition(arr, low, high);
        quickSort(arr, low, pIndex - 1);
        quickSort(arr, pIndex + 1, high);
    }

    private int partition(Player[] arr, int low, int high) {
        int pivot = arr[high].getScore();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getScore() >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(Player[] arr, int i, int j) {
        Player tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
