package com.study.ThisIsTheCodingTest.Sorting;

/**
 * 정렬 삽입정렬 예제
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 1; i < array.length; i++) {
            // 맨 앞자리는 고정 i는 1부터 비교 시작
            // 인덱스 i부터 1까지 감소하며 반복하는 문법
            for (int j = i; j > 0; j--) {
                // 한 칸씩 왼쪽으로 이동
                if (array[j] < array[j - 1]) {
                    // Swap
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                // 자기보다 작은 데이터를 만나면 그 위치에서 멈춤 -> 정렬 순서를 유지한다
                else break;
            }
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void test() {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    // swap
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                } else break;
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
