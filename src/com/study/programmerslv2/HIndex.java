package com.study.programmerslv2;

import java.util.Arrays;

/**
 * 프로그래머스 lv2 H-Index
 */
public class HIndex {
    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations));

    }

    public static int solution(int[] citations) {
        int answer = 0;
        // 논문 인용 개수 배열 오름차순으로 정렬
        Arrays.sort(citations);

        // 논문 인용 개수가 적은 논문부터 비교
        for (int i = 0; i < citations.length; i++) {
            // 논문의 총 개수에서 i만큼 줄어든 값
            int h = citations.length - i;

            // 오름차순 정렬된 인용된 논문 개수 >= h
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}

