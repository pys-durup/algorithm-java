package com.study.programmerslv1;

import java.util.Map;
import java.util.TreeMap;

public class FailureRate {
    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] solution = solution(5, stages);
        for (int i : solution) {
            System.out.print(i + " ");
        }

    }

    static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int userCount = stages.length; // 유저 수
        Map<Integer, Float> percentMap = new TreeMap<>();

        for (int i = 1; i <= N; i++) { // 실패율 계산
            int failCount = 0;
            int tryUser = 0;
            for (int j = 0; j < userCount; j++) {
                if (stages[j] >= i) {
                    tryUser++;
                }
                if (stages[j] == i) {
                    failCount++;
                }
            }

            answer[i-1] = i;
            percentMap.put(i, (float) failCount / tryUser);
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {

                if (percentMap.get(answer[i]) < percentMap.get(answer[j])) { // 실패율 비교
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }

                if (percentMap.get(answer[i]).equals(percentMap.get(answer[j]))) { // 실패율이 같을때
                    if ( answer[i] > answer[j] ) { // 스테이지 번호 비교
                        int temp = answer[j];
                        answer[j] = answer[i];
                        answer[i] = temp;
                    }
                }
            }
        }
        return answer;
    }
}
