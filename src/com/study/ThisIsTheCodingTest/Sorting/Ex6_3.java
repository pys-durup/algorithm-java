package com.study.ThisIsTheCodingTest.Sorting;

import java.util.*;

/**
 * 정렬 예제 6-3 두 배열의 원소 교체
 */
public class Ex6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 배열의 크기
        int k = sc.nextInt(); // 바꿔치기 연산
        int sum = 0;

        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            listA.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            listB.add(sc.nextInt());        }

        // 오름차순 정렬
        Collections.sort(listA);

        // 오름차순 정렬 후 -> 내림차순 정렬로 바꿈
        Collections.sort(listB);
        Collections.reverse(listB);

        // ListA에 k개수 만큼 큰수를 바꿔치기
        for (int i = 0; i < k; i++) {
            listA.remove(i);
            listA.add(i, listB.get(i));
        }

        for (Integer i : listA) {
            sum += i;
        }

        System.out.println(sum);
    }
}
