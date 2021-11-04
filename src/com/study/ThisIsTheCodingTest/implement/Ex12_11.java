package com.study.ThisIsTheCodingTest.implement;

import java.util.Scanner;

/**
 * 구현 유형기출 12-11 뱀
 */
public class Ex12_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 보드 크기
        int n = sc.nextInt();
        int[][] map = new int[n][n];

        // K 사과 개수
        int k = sc.nextInt();

        // 사과 개수만큼의 사과 좌표 정보
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = 2;
        }
        // L 방향 정보 개수
        int l = sc.nextInt();

        for (int i = 0; i < l; i++) {
            String s = sc.nextLine();
            String[] split = s.split(" ");
        }

        // X와 X는 게임 시작시간으로부터 지난 시간  / 문자 C (왼쪽 L 오른쪽 D)


        // 벽, 공간, 사과, 몸 4가지를 표현해야 함.


        /**
         * 이후로 손을 못댐
         */

    }
}
