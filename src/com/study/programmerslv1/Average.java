package com.study.programmerslv1;

import java.util.Arrays;
import java.util.OptionalDouble;

// lv1 프로그래머스 평균값 구하기
public class Average {
    public static void main(String[] args) {

        m1();
        m2();


    }

    private static void m2() {
        int[] arr = {1, 2, 3, 4};
        double average = 0L;
        for (int i : arr) {
            average += i;
        }

        System.out.println(average / arr.length);
    }

    private static void m1() {
        int[] arr = {1, 2, 3, 4};
        double average = Arrays.stream(arr).average().orElse(0);
        System.out.println(average);
    }
}
