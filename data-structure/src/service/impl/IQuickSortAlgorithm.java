package service.impl;

import service.SortAlgorithm;

public class IQuickSortAlgorithm implements SortAlgorithm {
    public void sort(int[] input) {
        quickSort(input,0,input.length-1);
    }

    public void quickSort(int [] input, int low,int high){
        if (low < high) {
            int pivot = partition(input, low, high);
            quickSort(input, low, pivot - 1);
            quickSort(input, pivot + 1, high);
        }
    }
    private int partition(int[] input, int low, int high) {
        int pivot = input[high];
        int i = low - 1;
        for (int j = low; j <= high; j++) {
            if (input[j] <= pivot) {
                swap(input, ++i, j);
            }
        }
        return i;
    }
    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
