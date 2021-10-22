package com.study.ThisIsTheCodingTest.Greedy;

import java.util.Scanner;

/**
 * Greedy 유형기출 11-2 곱하기 혹은 더하기
 */
public class Ex11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] chars = s.toCharArray();
        int result = chars[0] - 48; // 결과값

        for (int i = 1; i < chars.length; i++) {
            int num = chars[i] - 48;

            if (result <= 1 || num <= 1) {
                result += num;
            } else {
                result *= num;
            }
        }

        System.out.println(result);
    }

    static void gitAnswer() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 첫 번째 문자를 숫자로 변경한 값을 대입
        long result = str.charAt(0) - '0';

        for (int i = 1; i < str.length(); i++) {
            // 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기 수행
            int num = str.charAt(i) - '0';
            if (num <= 1 || result <= 1) {
                result += num;
            }
            else {
                result *= num;
            }
        }

        System.out.println(result);
    }
}
