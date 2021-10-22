package com.study.ThisIsTheCodingTest.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Greedy 유형 기출문제 - 모험가 길드
 */
public class Ex11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxfear = 0;
        int peopleCount = 0;
        int groupCount = 0;

        for (int i = 0; i < n; i++) {
            int fear = sc.nextInt();

            // 공포도가 1인 경우 그룹 결성
            if (fear == 1) {
                groupCount++;
                continue;
            }

            // 공포도를 체크하면서 현재 인원의 공포도가 현재 기록된 공포도보다 크면 최대 공포도에 기록
            if (maxfear < fear) {
                maxfear = fear;
            }
            // 인원 1 증가
            peopleCount++;

            // 체크한 최대 공포도와 인원수가 일치하면 그룹 결성
            if (maxfear == peopleCount) {
                groupCount++;
                peopleCount = 0;
                maxfear = 0;
            }
        }

        System.out.println(groupCount);

    }

    static void gitAnswer() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        Collections.sort(arrayList);

        int result = 0; // 총 그룹의 수
        int count = 0; // 현재 그룹에 포함된 모험가의 수

        for (int i = 0; i < n; i++) { // 공포도가 낮은 인원부터 하나씩 확인한다
            count += 1; // 현재 그룹에 해당 모험가를 포함
            if (count >= arrayList.get(i)) { // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
                result += 1; // 총 그룹의 수 증가시키기
                count = 0; // 현재 그룹에 포함된 모험가의 수 초기화
            }
        }

        System.out.println(result);
    }
}
