package com.study.ThisIsTheCodingTest.Greedy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Greedy 유형기출 11-5 볼링공 고르기
 */
public class Ex11_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) count++;
            }
        }

        System.out.println(count);
        gitAnswer();
    }

    static void gitAnswer() {
        int n, m;
        // 1부터 10까지의 무게를 담을 수 있는 배열
        int[] arr = new int[11];

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x] += 1;
        }

        int result = 0;

        // 1부터 m까지의 각 무게에 대하여 처리
        for (int i = 1; i <= m; i++) {
            n -= arr[i]; // 무게가 i인 볼링공의 개수(A가 선택할 수 있는 개수) 제외
            result += arr[i] * n; // B가 선택하는 경우의 수와 곱해주기
        }

        System.out.println(result);
    }
}
