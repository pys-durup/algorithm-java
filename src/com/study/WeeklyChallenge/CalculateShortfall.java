package com.study.WeeklyChallenge;

/**
 * 위클리 챌린지 - 부족한 금액 계산하기
 */
public class CalculateShortfall {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    static long solution(int price, int money, int count) {
        long answer;
        long need = 0;

        for (int i = 1; i <= count; i++) {
            need += price * i;
        }

        if (money - need < 0) {
            answer = need - money;
        } else {
            answer = 0;
        }

        return answer;
    }
}
