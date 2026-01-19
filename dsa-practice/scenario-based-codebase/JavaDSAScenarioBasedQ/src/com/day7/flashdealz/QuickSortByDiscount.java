package com.day7.flashdealz;
public class QuickSortByDiscount {

    // Sort products by discount DESC (highest discount first)
    public void sort(Product[] products) {
        if (products == null || products.length <= 1) return;
        quickSort(products, 0, products.length - 1);
    }

    private void quickSort(Product[] arr, int low, int high) {
        if (low >= high) return;

        int pIndex = partition(arr, low, high);
        quickSort(arr, low, pIndex - 1);
        quickSort(arr, pIndex + 1, high);
    }

    private int partition(Product[] arr, int low, int high) {
        double pivot = arr[high].getDiscountPercent();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getDiscountPercent() >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(Product[] arr, int i, int j) {
        Product temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
