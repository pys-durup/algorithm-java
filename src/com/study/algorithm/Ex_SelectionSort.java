package com.study.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex_SelectionSort {

    public static void main(String[] args) {

        caseOne();

    }

    private static void caseOne() {
        Integer[] arrays = {14, 2, 5, 7, 9, 20, 11, 1, 8, 1, 1};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arrays));
        // System.out.println(list.toString());

        int size = list.size();
        ArrayList<Integer> resultArray = new ArrayList();
        for (int i = 0; i < size; i++) {
            resultArray.add(list.get(minNumber(list)));
            list.remove(minNumber(list));
        }

        System.out.println(resultArray);
    }

    // 가장 작은 원소의 인덱스값 반환
    private static int minNumber(ArrayList<Integer> list) {
        int minNum = list.get(0);
        int minIndex = 0;
        for (int i = 1; i < list.size() ; i++) {
            if (minNum > list.get(i)) {
                minNum = list.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }
}
