package com.study.programmerslv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 프로그래머스 lv1 문자열 내 마음대로 정렬하기
 */
public class SortStrings {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        solution(strings, 1);
    }

    static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                if (c1 == c2) { // n번째 문자가 같을 경우에 스트링을 사전순으로
                    return s1.compareTo(s2);
                } else {
                    return c1 - c2;
                }
            }
        });

        return strings;
    }

    static String[] solution2(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            // 비교할 문자를 단어 앞에 추가해서 사전순 비교
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}
