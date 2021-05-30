package com.study.programmerslv1;

public class MiddleLetter {
    public static void main(String[] args) {

//        String temp = "abcde";
        String temp = "abcde";
        System.out.println(solution2(temp));

    }

    static String solution(String s) {
        String answer = "";
        int startIndex = s.length() / 2;
        // 글자수가 짝수면 2개
        if (s.length() % 2 == 0) {
            answer += s.charAt(startIndex - 1);
            answer += s.charAt(startIndex);
        } else { // 글자수가 홀수면 1개
            answer += s.charAt(startIndex);
        }

        return answer;
    }

    static String solution2(String word) {
        String answer = "";
        if (word.length() % 2 == 0) {
            answer = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        } else {
            answer = word.substring(word.length() / 2, word.length() / 2 + 1);
        }
        return answer;
    }

    static String solution3(String word) {
        return word.substring((word.length()-1) / 2, word.length()/2 + 1);
    }
}
