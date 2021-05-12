package com.study.programmerslv1;

public class Year2016 {
    public static void main(String[] args) {

        System.out.println(solution(5, 24));

    }

    static String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int total = 0;
        String answer = "";

        for(int i=0; i<a-1; i++){
            total += month[i];
        }

        answer = day[(total+b)%7];
        return answer;
    }
}
