package com.study.ThisIsTheCodingTest.implement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 구현 유형기출 12-8 문자열 재정렬
 */
public class Ex12_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int cnt = 0;
        String text = "";
        ArrayList<String> alist = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            // 숫자인 경우 cnt 변수에 더해준다
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') cnt += s.charAt(i) - '0';
            // 문자인 경우 alist에 담아둔다
            else alist.add(s.charAt(i) + "");
        }
        // 문자열 오름차순 정렬
        Collections.sort(alist);
        for (String s1 : alist) {
            System.out.print(s1);
        }

        /**
         * 숫자가 없는 경우를 고려하지 않음
         */

        //System.out.println(text + cnt);
        if (cnt != 0) System.out.println(cnt);

    }

    static void gitAnswer() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int value = 0;
        ArrayList<Character> result = new ArrayList<>();

        // 문자를 하나씩 확인하며
        for (int i = 0; i < str.length(); i++) {
            // 알파벳인 경우 결과 리스트에 삽입
            if (Character.isLetter(str.charAt(i))) {
                result.add(str.charAt(i));
            }
            // 숫자는 따로 더하기
            else {
                value += str.charAt(i) - '0';
            }
        }

        // 알파벳을 오름차순으로 정렬
        Collections.sort(result);

        // 알파벳을 차례대로 출력
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }

        // 숫자가 하나라도 존재하는 경우 가장 뒤에 출력
        if (value != 0) System.out.println(value);
        System.out.println();
    }
}
