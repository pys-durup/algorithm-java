package com.study.programmerslv1;

import javax.naming.CannotProceedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 프로그래머스 lv1 같은 숫자는 싫어
 */
public class HateSameNumber {
    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] solution = solution(arr);
        for (int i : solution) {
            System.out.println(i);
        }

    }

    static int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<>();

        int chk;

        for(int i=0; i<arr.length-1; i++){
            chk = arr[i];

            if (chk != arr[i+1]){
                temp.add(chk);
            }
        }

        temp.add(arr[arr.length - 1]);
        answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }

        return answer;
    }
}
