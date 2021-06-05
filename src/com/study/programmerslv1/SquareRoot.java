package com.study.programmerslv1;

/**
 * 1. Math 클래스 사용
 * 2. 단순 for문 사용
 */
public class SquareRoot {
    public static void main(String[] args) {

        System.out.println(solution2(121));
        System.out.println(solution2(122));


    }

    static long solution(long n) {
        long answer = -1;
        double sqrt = Math.sqrt(n);
        int intSqrt = (int)sqrt;

        return intSqrt == sqrt ? (long)Math.pow(intSqrt + 1, 2) : answer;
    }

    static long solution2(long n) {
        long answer = -1;
        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break;
            }
        }

        return answer;
    }
}
