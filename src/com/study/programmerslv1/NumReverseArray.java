package com.study.programmerslv1;

import java.util.Arrays;

public class NumReverseArray {
    public static void main(String[] args) {

        int n = 12345;
//        Arrays.stream(solution(n)).forEach(num -> System.out.println(num));
        Arrays.stream(solution2(n)).forEach(num -> System.out.println(num));
        Arrays.stream(solution3(n)).forEach(num -> System.out.println(num));


    }

    static int[] solution(long n) {
        String temp = String.valueOf(n);
        int[] answer = new int[temp.length()];
        int index = temp.length() - 1;

        for (int i=0; i<temp.length(); i++) {
            answer[i] = temp.charAt(index) - '0';
            index--;
            //System.out.println(answer[i]);
        }

        return answer;
    }

    static int[] solution2(long n) {
        String a = "" + n;
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;

    }

    static int[] solution3(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for (int i=0; i<ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }
        return answer;
    }
}
