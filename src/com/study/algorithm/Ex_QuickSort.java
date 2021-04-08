package com.study.algorithm;

import java.util.ArrayList;

public class Ex_QuickSort {
    public static void main(String[] args) {

        int[] arr = {6, 2, 4, 5, 18, 9, 10, 23, 26};

        quickSort(arr, 0, arr.length-1);

        for (int data : arr) {
            System.out.print(data + ",");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if (start < part2 - 1) {
            quickSort(arr, start, part2-1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end)/2];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return start;
    }
}
