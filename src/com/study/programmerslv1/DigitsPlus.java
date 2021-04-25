package com.study.programmerslv1;

public class DigitsPlus {
    public static void main(String[] args) {

        System.out.println(solution(987));
    }

    static int solution(int n) {
        int answer = 0;
        String temp = n + "";
        for (int i=0; i<temp.length(); i++) {
            answer += temp.charAt(i) - '0';
        }

        return answer;
    }
}
