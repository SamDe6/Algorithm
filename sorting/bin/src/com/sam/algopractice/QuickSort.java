package com.sam.algopractice;

import java.util.List;
import java.util.Random;

public class QuickSort {
    public void quickSort(List<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }

    private void quickSort(List<Integer> list, int low, int high) {
        if (low < high + 1) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private void swap(List<Integer> list, int indexLeft, int indexRight) {
        int temp = list.get(indexLeft);
        list.set(indexLeft, list.get(indexRight));
        list.set(indexRight, temp);
    }

    // moves all n<pivot to left of pivot and n>pivot to the right, then returns new pivot
    private int partition(List<Integer> list, int low, int high) {
        swap(list, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (list.get(i) < list.get(low)) {
                swap(list, i, border++);
            }
        }
        int newPivot = border - 1;
        swap(list, low, newPivot);
        return newPivot;
    }

    private int getPivot(int low, int high) {
        Random random = new Random();
        return random.nextInt((high - low) + 1) + low;
    }
}
