package com.study.ThisIsTheCodingTest.Sorting;

/**
 * 정렬 선택정렬 예제
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            // 가장 작은 수를 맨 앞으로
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void gitAnswer() {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < n; i++) {
            int min_index = i; // 가장 작은 원소의 인덱스
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            // 스와프
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
