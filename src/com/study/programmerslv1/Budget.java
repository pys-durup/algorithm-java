package com.study.programmerslv1;

import java.util.Arrays;

/**
 * 프로그래머스 lv1 예산
 */
public class Budget {
    public static void main(String[] args) {

        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(solution(d, budget));
    }

    /**
     * d 부서별로 신청한 금액 배열
     * budget 예산
     * 최대 몇개의 부서에 지원할 수 있는지?
     */

    static int solution(int[] d, int budget) {
        int count = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget = budget - d[i];
            if (budget < 0) break;
            count++;
        }


        return count;
    }
}
