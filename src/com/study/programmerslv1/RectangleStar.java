package com.study.programmerslv1;

import java.util.Scanner;
import java.util.stream.IntStream;

// 직사각형 별찍기
public class RectangleStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        m1(a,b);
        m2(a,b);
    }

    private static void m2(int a, int b) {

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
    }

    private static void m1(int a, int b) {

        for(int i=0; i<b ; i++) {
            for(int j=0; j<a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
