package com.study.ThisIsTheCodingTest.implement;

import java.util.Scanner;

/**
 * 구현 예제 4-4 게임 개발
 */
public class Ex4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 맵 가로크기
        int y = sc.nextInt(); // 맵 세로크기

        int px = sc.nextInt(); // 현재 x 좌표
        int py = sc.nextInt(); // 현재 y 좌표
        int nowD = sc.nextInt(); // 바라보는 방향
        int count = 1; // 이동횟수

        // 북 동 남 서
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        int[][] map = new int [x][y];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                map[i][j] = sc.nextInt();
//                System.out.print(map[i][j] + " ");
            }
//            System.out.println();
        }

        for (int i = 0; i < (x - 1) * (y - 1); i++) {
            int beforeCount = count;
            for (int j = 0; j < 4; j++) {
                // nowD == 0 이면 -> 3으로
                nowD--;
                if (nowD == -1) nowD = 3;

                int nextX = px + dx[nowD];
                int nextY = py + dy[nowD];

                if (map[nextX][nextY] == 1) continue;

                if (map[nextX][nextY] == 0) {
                    map[nextX][nextY] = 1;
                    px = nextX;
                    py = nextY;
                    count++;
                    System.out.println("px = " + px + " py = " + py + " count = " + count);
                    break;
                }
            }

            if(beforeCount == count) break;
        }

        System.out.println(count);

    }
}
/**
 * 뒤로 돌아가서 다시 탐색하는 경우를 생각하지 못함 -> 방문한 곳을 따로 관리해야 함
 *
 */
