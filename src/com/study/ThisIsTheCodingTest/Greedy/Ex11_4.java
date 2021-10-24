package com.study.ThisIsTheCodingTest.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Greedy 유형기출 11-4 만들수 없는 금액
 */
public class Ex11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numArray = new int[n];
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numArray[i] = sc.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < n; i++) {
            numList.add(numArray[i]);
            temp = numArray[i];
            for (int j = i; j < n - 1; j++) {
                temp += numArray[j + 1];
                numList.add(temp);
            }
        }

        // 오름차순 정렬
        Collections.sort(numList);

        for (int i = 1; i <= numList.size(); i++) {
            int index = numList.indexOf(i);
            if (index == -1 ) {
                System.out.println(i);
                break;
            }
        }

        gitAnswer();
    }

    static void gitAnswer() {
        int n;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        Collections.sort(arrayList);

        int target = 1;
        for (int i = 0; i < n; i++) {
            // 만들 수 없는 금액을 찾았을 때 반복 종료
            if (target < arrayList.get(i)) break;
            target += arrayList.get(i);
        }

        System.out.println(target);
    }
}
