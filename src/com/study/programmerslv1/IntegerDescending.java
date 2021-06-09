package com.study.programmerslv1;

import java.util.Arrays;

/**
 * 프로그래머스 lv1 정수 내림차순으로 배치하기
 */
public class IntegerDescending {
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }

    static long solution(long n) {
        String answer = "";

        String s = String.valueOf(n);
        //String s2 = Long.toString(n);
        //System.out.println("s2 = " + s2);
        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);

        for (char c : charArray) {
            answer = c + answer;
        }

        return Long.parseLong(answer);
    }

    static Long solution2(long n){
        String str = Long.toString(n);
        char[] c = str.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder(new String(c,0,c.length));
        return Long.parseLong(((sb.reverse()).toString()));
    }


}
