package com.study.programmerslv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 프로그래머스 lv1 모의고사
 */
public class MockTest {
    public static void main(String[] args) {

        int[] answers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] solution = solution(answers);
        for (int i : solution) {
            System.out.print(i);
        }
        System.out.println();
        int[] solution2 = solution2(answers);
        for (int i : solution2) {
            System.out.print(i);
        }

    }

    static int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();

        int length = answers.length;
        System.out.println("length = " + length);
        int[] count = new int[3];

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] array3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < length; i++) {
            if ( answers[i] == array1[i % array1.length] ){
                count[0]++;
            }
            if ( answers[i] == array2[i % array2.length] ){
                count[1]++;
            }
            if ( answers[i] == array3[i % array3.length] ){
                count[2]++;
            }
        }


        // 가장 큰 수 구하기
        int max = count[0];
        for (int i=1; i<count.length; i++) {
            if (count[0] <= count[i]) {
                max = count[i];
            }
        }

        System.out.println("max = " + max);

        // 정답 배열 크기 계산
        int size = 0;
        for (int i=0; i<count.length; i++) {
            if (count[i] == max) {
                size++;
            }
        }
        System.out.println("size = " + size);


        // 정답 배열 값 넣기
        int answerIndex = 0;
        answer = new int[size];
        for (int i=0; i<count.length; i++) {
            if (count[i] == max) {
                answer[answerIndex] = i + 1;
                answerIndex ++;
            }
        }

        return answer;
    }

    static int[] solution2(int[] answers) {
        int[] point = {0,0,0}; // 점수표
        int[] pointCopy = {}; // 점수표 정렬
        int max = 0; // 점수 최대값
        List<Integer> list = new ArrayList(); // 정답자 넣기

        int[][] spzPatterns = {
                {1, 2, 3, 4, 5},        // 수포자들의  패턴
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 채점하기
        for (int i = 0; i < answers.length; i++) {
            if (spzPatterns[0][i%5] == answers[i]) {
                point[0]++;
            }

            if (spzPatterns[1][i%8] == answers[i]) {
                point[1]++;
            }

            if (spzPatterns[2][i%10] == answers[i]) {
                point[2]++;
            }
        }

        // 점수표 정렬해서 가장 큰 값 찾기
        pointCopy = point.clone();
        Arrays.sort(pointCopy);
        max = pointCopy[2];

        for (int i = 0; i < point.length; i++) {
            if (point[i] == max) {
                list.add(i+1);
            }
        }

        // 가장 큰 값을 가진 학생 번호 구하기
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
