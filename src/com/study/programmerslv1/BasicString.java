package com.study.programmerslv1;

/**
 * 프로그래머스 lv1 문자열 다루기 기본
 */
public class BasicString {
    public static void main(String[] args) {
        boolean result = solution3("1234");
        boolean result2 = solution3("a234");
        System.out.println("result = " + result);
        System.out.println("result = " + result2);
    }

    static boolean solution(String s) {
        boolean answer = true;
        char[] charArray = s.toCharArray();

        if (charArray.length != 4 && charArray.length != 6) {
            return false;
        }

        for (int i=0; i<charArray.length; i++) {
            if (!(charArray[i] >= '0' && charArray[i] <= '9')) {
                return false;
            }
        }
        return answer;
    }

    static boolean solution2(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }

    static boolean solution3(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
    }
}
