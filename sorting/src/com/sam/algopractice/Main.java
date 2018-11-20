package com.sam.algopractice;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static QuickSort quickSort;

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(99, 10, 11, 78, 35, 84, 37, 67, 52, 4, 66, 91, 83, 7, 0, 74, 125, 61, 40);
        System.out.println(list);

        //Quick Sort
        quickSort = new QuickSort();
        quickSort.quickSort(list);
        System.out.println(list);

        //Radix Sort
    }
}
