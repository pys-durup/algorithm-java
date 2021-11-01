package com.study.ThisIsTheCodingTest.implement;

import java.util.Scanner;

/**
 * 구현 유형기출 12-7 럭키 스트레이트
 */
public class Ex12_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int leftCount = 0;
        int rightCount = 0;

        String leftString = s.substring(0, s.length() / 2);
        String rightString = s.substring(s.length() / 2);

        for (int i = 0; i < leftString.length(); i++) {
            leftCount += leftString.charAt(i) - '0';
        }

        for (int i = 0; i < rightString.length(); i++) {
            rightCount += rightString.charAt(i) - '0';
        }

        String result = rightCount == leftCount ? "LUCKY" : "READY";
        System.out.println(result);
    }

    static void gitAnswer() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int summary = 0;

        // 왼쪽 부분의 자릿수 합 더하기
        for (int i = 0; i < str.length() / 2; i++) {
            summary += str.charAt(i) - '0';
        }

        // 오른쪽 부분의 자릿수 합 빼기
        for (int i = str.length() / 2; i < str.length(); i++) {
            summary += str.charAt(i) - '0';
        }

        // 왼쪽 부분과 오른쪽 부분의 자릿수 합이 동일한지 검사
        if (summary == 0) System.out.println("LUCKY");
        else System.out.println("READY");

    }
}

