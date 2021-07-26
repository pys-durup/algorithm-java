package com.study.programmerslv2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 프로그래머스 lv2 기능개발
 * Queue 사용
 */
public class FunctionDevelopment {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        solution(progresses, speeds);
    }

    static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        boolean[] state = new boolean[progresses.length];
        Queue<Integer> countQueue = new LinkedList<>();

        int index = 0;
        int count = 0;
        while(count < progresses.length) {

            // 작업진행
            for (int i = 0; i < progresses.length; i++) {
                if (state[i] == false) {
                    progresses[i] += speeds[i];

                    if (progresses[i] + speeds[i] >= 100) {
                        state[i] = true;
                        count++;
                    }
                }
            }

            int dayCount = 0;
            for (int j = index; j < state.length; j++) {
                if (state[j] == true) {
                    dayCount++;
                } else {
                    index = j;
                    break;
                }
            }
            if(dayCount != 0) countQueue.add(dayCount);
        }

        answer = new int[countQueue.size()];
        int temp = 0;
        for (Integer integer : countQueue) {
            System.out.println("integer = " + integer);
            answer[temp] = integer;
            temp++;
        }

        return answer;
    }




}
