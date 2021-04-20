package com.study.programmerslv1;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(solution(scan.nextInt()));
        System.out.println(solution1(scan.nextInt()));
    }

    static boolean solution(int x) {
        int sum = 0;
        String str = String.valueOf(x);

        for (int i=0; i<str.length(); i++) {
            int c = str.charAt(i) - '0';
            sum += c;
        }

        if (x % sum == 0) {
            return true;
        }
        return false;
    }

    static boolean solution1(int x) {
        String[] temp = String.valueOf(x).split("");

        int sum = 0;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }

        if( x % sum == 0) {
            return true;
        }
        return false;
    }
}
