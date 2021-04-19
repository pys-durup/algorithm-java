package com.study.programmerslv1;

import java.util.Arrays;

public class NNumberSpacedByX {
    public static void main(String[] args) {

        int x = 2;
        int n = 5;

        long[] solution = solution(x, n);
        System.out.println("solution = " + solution);
        Arrays.stream(solution).asDoubleStream().forEach( num -> System.out.println(num));


    }

    static long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (long)x + (i * (long)x); // 숫자의 범위 주의! - int에 담지 못하는 수 발생
        }

        return answer;
    }
}



