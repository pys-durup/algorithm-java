package com.study.ThisIsTheCodingTest.DFSBFS;

public class Ex_adjacency_matrix {

    public static final int INF = 999999999;

    // 2차원 리스트를 이용해 인접 행렬 표현
    public static int[][] graph = {
            {0, 7, 5},
            {7, 0, INF},
            {5, INF, 0}
    };
    // 연결이 되지 않은 노드끼리는 무한의 비용
    // 연결이 된 노드끼리는 비용을 적는다
    // ex) 0과1은 7의 비용, 2와 0은 5의 비용

    public static void main(String[] args) {
        // 그래프 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
