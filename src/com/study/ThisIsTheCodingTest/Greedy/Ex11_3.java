package com.study.ThisIsTheCodingTest.Greedy;

import java.util.Scanner;

/**
 * Greedy 유형기출 11-3 문자열 뒤집기
 */
public class Ex11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int zeroCount = 0; // 0으로된 블럭개수
        int oneCount = 0; // 1로된 블럭 개수
        int blockType = s.charAt(0) - 48;

        for (int i = 0; i < s.length(); i++) {
            if (blockType != s.charAt(i) - 48) { // 1 -> 0 , 0 -> 1 로 바뀌는 시점
                if (blockType == 1) {
                    oneCount++;
                } else {
                    zeroCount++;
                }
                blockType = s.charAt(i) - 48;
            }
        }

        if (zeroCount < oneCount) {
            System.out.println(zeroCount);
        } else {
            System.out.println(oneCount);
        }
    }

    static void gitAnswer() {
        String str;
        int count0 = 0; // 전부 0으로 바꾸는 경우
        int count1 = 0; // 전부 1로 바꾸는 경우

        Scanner sc = new Scanner(System.in);
        str = sc.next();

        // 첫 번째 원소에 대해서 처리
        if (str.charAt(0) == '1') {
            count0 += 1;
        }
        else {
            count1 += 1;
        }

        // 두 번째 원소부터 모든 원소를 확인하며
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                // 다음 수에서 1로 바뀌는 경우
                if (str.charAt(i + 1) == '1') count0 += 1;
                    // 다음 수에서 0으로 바뀌는 경우
                else count1 += 1;
            }
        }

        System.out.println(Math.min(count0, count1));
    }
}
