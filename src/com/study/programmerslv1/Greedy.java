package com.study.programmerslv1;

/**
 * 프로그래머스 lv1 체육복
 */
public class Greedy {
    public static void main(String[] args) {

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        System.out.println(solution(n, lost, reserve));

    }

    static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] countArray = new int[n];

        for (int i = 0; i < countArray.length; i++) {
            countArray[i] = 1;
        }

        for (int i = 0; i < lost.length; i++) {
            countArray[lost[i]-1] = countArray[lost[i]-1] - 1;
        }


        for (int i = 0; i < reserve.length; i++) {
            countArray[reserve[i]-1] = countArray[reserve[i]-1] + 1;
        }


        for (int i = 0; i < countArray.length; i++) {

            if (countArray[i] == 0) {

                if (i == 0) {
                    countArray[i-1]--;
                    countArray[i]++;
                    continue;
                }

                if (i == countArray.length) {
                    countArray[i+1]--;
                    countArray[i]++;
                    continue;
                }

                if (countArray[i-1] == 2) {
                    countArray[i-1]--;
                    countArray[i]++;
                    continue;
                }

                if (countArray[i+1] == 2) {
                    countArray[i+1]--;
                    countArray[i]++;
                    continue;
                }
            }
        }

        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}
