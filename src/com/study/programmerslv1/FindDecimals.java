package com.study.programmerslv1;

import java.util.Arrays;

/**
 * 프로그래머스 lv1 소수 찾기
 */
public class FindDecimals {
    public static void main(String[] args) {
        int n = 100;

        System.out.println(solution2(n));
    }

    // 시간초과 및 효율성 테스트 실패
    static int solution(int n) {
        int answer = 0;
        int count = 0;

        for(int i=2; i<=n; i++) {
            count = 0;
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count == 3) break;
            }
            if (count == 2) {
                answer ++;
            }
        }

        return answer;
    }

    // 에라토스테네스의 체
    static int solution2(int n) {
        int answer = 0;

        int[] filter = new int[n + 1];
        Arrays.fill(filter, 1);
        // 0, 1은 소수가 아님
        filter[0] = 0;
        filter[1] = 0;

        for (int i = 2; i < Math.sqrt(n) + 1; i++){
            if (filter[i] == 1){
                for (int j = i * 2; j <= n; j+=i){
                    System.out.println("j = " + j);
                    filter[j] = 0;
                }
            }
        }

        for (int check: filter){
            if (check == 1){
                answer++;
            }
        }

        return answer;
    }
}
