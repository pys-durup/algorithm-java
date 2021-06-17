package com.study.programmerslv1;

import java.util.Arrays;
import java.util.Collections;

public class RemoveSmallestNum {
    public static void main(String[] args) {

        int[] intArray = {4, 3, 2, 1};
        int[] solution = solution(intArray);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    static int[] solution(int[] arr) {

        if (arr.length - 1 == 0) {
            int[] answer = {-1};
            return answer;
        } else {
            Arrays.sort(arr);
            int[] answer = new int[arr.length - 1];
            for (int i=0; i<arr.length-1; i++) {
                answer[i] = arr[i+1];
            }
            return answer;
        }
    }
}


