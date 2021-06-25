package com.study.programmerslv1;

/**
 * 프로그래머스 lv1 제일 작은 수 제거하기
 */
public class DelSmallestNum {
    public static void main(String[] args) {

        int[] arrays = {4, 1, 1, 1, 3, 2 ,1};
        int[] temp = solution(arrays);
        for (int i : temp) {
            System.out.println(i);
        }

    }

    static int[] solution(int[] arr) {
        int[] answer = {-1};
        int length = arr.length;

        if (length == 1) {
            return answer;
        }

        int minNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (minNumber >= arr[i]) {
                minNumber = arr[i];
            }
        }

        answer = new int[arr.length - 1];

        int inxex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minNumber) {
                continue;
            } else {
                answer[inxex++] = arr[i];
            }

        }

        return answer;
    }

    static int[] solution2(int[] arr) {

        int min = arr[0];
        int[] answer = new int[arr.length - 1];

        if (arr.length <= 1) {
            int[] answer2 = { -1 };
            return answer2;
        }

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min == arr[j]) {
                continue;
            } else {
                answer[index++] = arr[j];
            }

        }

        return answer;
    }
}
