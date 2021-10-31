package com.study.ThisIsTheCodingTest.implement;

import java.awt.*;
import java.util.Scanner;

/**
 * 구현 예제 4-3 왕실의 나이트
 */
public class Ex4_3 {
    public static void main(String[] args) {
        // a1
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int x = s.charAt(0) - 96;
        int y = s.charAt(1) - 48;
        int count = 0;

        // 좌우 체크 x-2 y-1 / x-2 y+1 / x+2 y-1 / x-2 y+1 /
        // 상하 체크 x-1 y+2 / x+1 y+2 / x-1 y-2 / x+1 y-2 /
        int[] xCheck = {-2, -2, 2, 2, -1, 1, -1, 1};
        int[] yCheck = {-1, 1, -1, 1, 2, 2, -2, -2};

        for (int i = 0; i < xCheck.length; i++) {
            if (x + xCheck[i] > 0 && y + yCheck[i] > 0 && x + xCheck[i] <=8 && y + yCheck[i]<=8) count++;
        }

        System.out.println(count);

    }
    static void gitAnswer() {
        Scanner sc = new Scanner(System.in);

        // 현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
