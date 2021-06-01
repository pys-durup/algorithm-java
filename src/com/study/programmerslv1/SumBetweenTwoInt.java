package com.study.programmerslv1;

public class SumBetweenTwoInt {
    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        System.out.println(solution(a, b));

    }

    static long solution(int a, int b) {
        long answer = 0;
        int maxNum = a;
        int minNum = b;

        if ( a < b ) {
            maxNum = b;
            minNum = a;
        }

        for (int i = minNum; i <= maxNum; i++) {
            answer += i;
        }

        return answer;
    }
}
