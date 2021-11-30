package com.study.programmerslv2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 프로그래머스 lv2 전화번호 목록
 * 코딩테스트 연습 > 해시
 */
public class Phonebook {
    public static void main(String[] args) {
        String[] temp = {"12","123","1235","567","88"};
        System.out.println(solution(temp));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                }
                return 1;
            }
        });

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
                    answer = false;
                    break;
                };
            }
            if (!answer) break;
        }
        return answer;
    }
}
