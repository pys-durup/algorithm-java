package com.study.ThisIsTheCodingTest.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class Ex_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // 삽입(5) - 삽입(4) - 삽입(3) - 삽입(2) - 삭제() - 삽입(1) - 삽입(2) - 삭제()
        q.offer(5);
        q.offer(4);
        q.offer(3);
        q.offer(2);
        q.poll();
        q.offer(1);
        q.offer(2);
        q.poll();

        // 먼저 들어온 원소부터 추출
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
