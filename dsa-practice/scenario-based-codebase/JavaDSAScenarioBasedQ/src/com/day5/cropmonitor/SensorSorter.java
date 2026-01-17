package com.day5.cropmonitor;
import java.util.Random;

public class SensorSorter {

    private final Random random = new Random();

    public void quickSortByTimestamp(SensorRecord[] data, int low, int high) {
        if (low < high) {
            int pivotIndex = randomizedPartition(data, low, high);
            quickSortByTimestamp(data, low, pivotIndex - 1);
            quickSortByTimestamp(data, pivotIndex + 1, high);
        }
    }

    private int randomizedPartition(SensorRecord[] data, int low, int high) {
        int pivotIdx = low + random.nextInt(high - low + 1);
        swap(data, pivotIdx, high);
        return partition(data, low, high);
    }

    private int partition(SensorRecord[] data, int low, int high) {
        var pivot = data[high].getTimestamp();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (!data[j].getTimestamp().isAfter(pivot)) { // <= pivot
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, high);
        return i + 1;
    }

    private void swap(SensorRecord[] data, int i, int j) {
        SensorRecord temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void display(SensorRecord[] data) {
        for (SensorRecord r : data) {
            System.out.println(r);
        }
    }
}
