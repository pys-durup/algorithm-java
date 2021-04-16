package com.study.programmerslv1;

import java.util.Arrays;
import java.util.List;

// 김서방 찾기
public class FindKim {
    public static void main(String[] args) {

        String[] arr = {"Jane", "Kim"};

        m1(arr);
        m2(arr);

    }

    private static void m2(String[] arr) {
        int i = Arrays.asList(arr).indexOf("Kim");
        System.out.println("김서방은 " + i + "에 있다");
    }

    private static void m1(String[] arr) {
        List<String> list = Arrays.asList(arr);

        for (int i=0; i<list.size(); i++) {
            if (list.get(i).equals("Kim")) {
                //return String.format("김서방은 %s에 있다", i+1);
                System.out.printf("김서방은 %s에 있다", i);
                break;
            }
        }
    }
}
