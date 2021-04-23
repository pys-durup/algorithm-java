package com.study.programmerslv1;

public class StrangeChar {
    public static void main(String[] args) {

        String temp = "try hello world";
        System.out.println(solution(temp));
    }

    static String solution(String s) {

        char[] temp = s.toCharArray();
        boolean flag = true;

        for (int i=0; i<temp.length; i++) {
            if (temp[i] == ' ') {
                flag = true;
                continue;
            }

            if (flag == true && temp[i] > 'Z') {
                temp[i] = (char)(temp[i] - 32);
            } else if (flag == false && temp[i] <= 'Z') {
                temp[i] = (char)(temp[i] + 32);
            }

            flag = !flag;
        }

        return String.valueOf(temp);
    }
}
