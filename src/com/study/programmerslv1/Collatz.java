package com.study.programmerslv1;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = solution(scan.nextInt());
        System.out.println(n);
    }

    private static int solution(int num) {
        int count = 0;
        while (true) {
            if (count > 500) return -1;
            if (num == 1) return count;

            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            count++;

        }
    }
}
