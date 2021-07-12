package com.study.programmerslv1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 lv1 나누어 떨어지는 숫자배열
 */
public class ArrayOfDividedNumbers {
    public static void main(String[] args) {

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int[] solution = solution(arr, divisor);
        for (int i : solution) {
            System.out.println(i);
        }


    }

    static int[] solution(int[] arr, int divisor) {
        int[] answer = new int[1];
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(arr);

        for (int i : arr) {
            if (i % divisor == 0) {
                temp.add(i);
            }
        }

        if (temp.size() == 0) {
            answer[0] = -1;
        } else {
            answer = new int[temp.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = temp.get(i);
            }
        }

        return answer;
    }


}
