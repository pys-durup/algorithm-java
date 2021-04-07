package com.study.algorithm;

public class Ex_Recursion {
    public static void main(String[] args) {

        m1(5);
        System.out.println(fact(5));

    }

    private static int fact(int i) {
        if ( i == 1 ) {
            return i;
        } else {
            return i * fact(i-1);
        }
    }

    private static void m1(int i) {
        System.out.println(i);

        if (i == 0) {
            return;
        } else {
            i--;
            m1(i);
        }
    }
}
