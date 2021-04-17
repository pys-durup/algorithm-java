package com.study.programmerslv1;

public class PhoneNumberMasking {
    public static void main(String[] args) {

        final String phone_number = "01033334444";
        Solution s = new Solution();

        System.out.println(s.solution(phone_number));
        System.out.println(s.solution2(phone_number));
        System.out.println(s.solution3(phone_number));


    }
}

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        answer = phone_number.substring(length - 4, length);
        int maskingLength = length - answer.length();

        for (int i=0; i<maskingLength; i++) {
            answer = "*" + answer;
        }

        return answer;
    }

    public String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for (int i = 0 ; i < ch.length - 4; i++){
             ch[i] = '*';
        }


        return String.valueOf(ch);
    }

    // 정규표현식
    public String solution3(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}