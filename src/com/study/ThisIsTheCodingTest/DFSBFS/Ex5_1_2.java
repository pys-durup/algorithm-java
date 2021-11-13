package com.study.ThisIsTheCodingTest.DFSBFS;

import java.util.Scanner;

/**
 * DFS&BFS 예제 5-1 음료수 얼려 먹기 2번째
 */
public class Ex5_1_2 {

    public static int n,m;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y) {

        if (x <= -1 || y <= -1 || x >= n || y >= m) return false;

        // 현재 노드를 방문하지 않았다면
        if (graph[x][y] == 0) {
            // 노드 방문 처리
            graph[x][y] = 1;
            // 상하좌우 위치 모두 재귀 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }

        return false;
    }

    public static void showGraph() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 제거용

        // 입력 받은 값으로 맵 그리기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) {
                    result += 1;
                }
            }
        }

        showGraph();
        System.out.println(result);

    }
}
