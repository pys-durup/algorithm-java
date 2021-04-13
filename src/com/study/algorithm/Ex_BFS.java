package com.study.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex_BFS {
    static int [][] graph;
    static boolean[] visit;
    static int nodeCount, edgeCount, start, end;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nodeCount = Integer.parseInt(br.readLine()); // 정점의 개수
        edgeCount = Integer.parseInt(br.readLine()); // 간선의 개수
        graph = new int[nodeCount + 1][nodeCount + 1];
        visit = new boolean[edgeCount + 1];

        // 그래프 정보 입력
        for (int i=1; i<edgeCount + 1 ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            graph[start][end] = 1;
            graph[end][start] = 1;
        }

        bfs(1);

    }

    static void bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visit[i] = true;

        while(!q.isEmpty()) {
            int temp = q.poll();
            System.out.print(temp);

            for(int j=i; j<=nodeCount; j++) {
                if(graph[temp][j] == 1 && visit[j] == false) {
                    q.offer(j);
                    visit[j] = true;
                }
            }
        }

    }
}
