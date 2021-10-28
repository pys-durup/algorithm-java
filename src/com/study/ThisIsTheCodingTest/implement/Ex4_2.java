package com.study.ThisIsTheCodingTest.implement;

import java.util.Scanner;

/**
 * 구현 예제 4-2 시각
 */
public class Ex4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        // 00시 00분 00초 ~ n시 59분 59초
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    String time = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                    for (int l = 0; l < time.length(); l++) {
                        if (time.charAt(l) == '3') {
                            count++;
                            System.out.println(time);
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(count);

    }

    static void gitAnswer() {
        Scanner sc = new Scanner(System.in);

        // H를 입력 받기
        int h = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if (check(i, j, k)) cnt++;
                }
            }
        }
    }

    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }

}
