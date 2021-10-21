package com.study.ThisIsTheCodingTest.Greedy;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 * Greedy 예제 3-3 숫자 카드 게임
 */
public class Ex3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 행
        int m = sc.nextInt(); // 열

        // 숫자 입력받아둘 2차원 배열 생성
        int[][] numberArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numberArray[i][j] = sc.nextInt();
            }
        }
        // 각 행의 최솟값을 담아둘 배열
        int[] minNumberArray = new int[n];

        // 각 행의 최솟값을 계산에서 배열에 담는다
        for (int i = 0; i < n; i++) {
            OptionalInt min = Arrays.stream(numberArray[i]).min();
            minNumberArray[i] = min.getAsInt();
        }

        // 최솟값 배열에서 가장 큰 수
        System.out.println(Arrays.stream(minNumberArray).max().getAsInt());

    }

    static void gitAnswer() {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        // 한 줄씩 입력 받아 확인하기
        for (int i = 0; i < n; i++) {
            // 현재 줄에서 '가장 작은 수' 찾기
            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            // '가장 작은 수'들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }

        System.out.println(result); // 최종 답안 출력
    }
}
