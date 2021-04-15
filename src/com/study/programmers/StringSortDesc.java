package com.study.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringSortDesc {
    // 프로그래머스 문자열 내림차순으로 배치하기
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(solution(str));

    }

    static String solution(String s) {
        String anwser = "";
        char[] arr = new char[s.length()];

        for (int i=0; i<arr.length; i++) {
            arr[i] = s.charAt(i);
        }

        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (char c : arr) {
            anwser += c;
        }

        return anwser;
    }
}
