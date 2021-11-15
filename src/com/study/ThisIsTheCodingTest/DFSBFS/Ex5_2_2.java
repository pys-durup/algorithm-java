package com.study.ThisIsTheCodingTest.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * DFS&BFS 예제 5-2 미로 탈출 [2번째]
 */
public class Ex5_2_2 {

    public static int n,m;
    public static int[][] graph;
    public static Queue<Node> queue = new LinkedList<>();
    public static boolean[][] visited;

    static class Node {
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    private static void bfs(Node node) {

        // 해당 노드로 부터 4방향 좌표
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0 ,-1, 0};

        // 시작 좌표 queue에 삽입
        queue.offer(node);

        // 시작 좌표 방문 처리
        visited[node.getX()][node.getY()] = false;

        // queue가 텅 빌때까지 수행
        while (!queue.isEmpty()) {

            // queue에서 하나의 노드를 꺼낸다
            Node temp = queue.poll();

            // 현재 X,Y 좌표
            int nowX = temp.getX();
            int nowY = temp.getY();

            // 목적지에 도달했을때 while문 탈출
            if (nowX == n-1 && nowY == m-1) break;

            // 4방향 체크
            for (int i = 0; i < 4; i++) {

                // 이동 후 좌표
                int moveX = nowX + dx[i];
                int moveY = nowY + dy[i];

                // 정상 적이지 않은 좌표로 이동시
                if (moveX < 0 || moveX >= n || moveY < 0 || moveY >= m) continue;

                // 방문하지 않았던 좌표면
                if (visited[moveX][moveY]) {
                    // queue에 넣고
                    queue.offer(new Node(moveX, moveY));
                    // 이동거리 1 증가
                    graph[moveX][moveY] = graph[nowX][nowY] + 1;
                    // 방문처리
                    visited[moveX][moveY] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        visited = new boolean[n][m];
        graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
                if (graph[i][j] == 1) {
                    visited[i][j] = true;
                } else {
                    visited[i][j] = false;
                }
            }
        }

        bfs(new Node(0,0));

        System.out.println(graph[n-1][m-1]);
    }



}
