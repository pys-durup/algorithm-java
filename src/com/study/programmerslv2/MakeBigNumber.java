package com.study.programmerslv2;

import java.util.*;

/**
 * 프로그래머스 lv2 큰 수 만들기
 */
public class MakeBigNumber {

    public static void main(String[] args) {

        solution("1231234", 3);
        System.out.println(solution2("1231234", 3));
    }

    public static String solution(String number, int k) {
        String answer = "";

        char[] chars = number.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        Arrays.sort(chars);

        for (int i = 0; i < k; i++) {
            list.add(chars[i]);
        }

        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (number.charAt(i) == list.get(j)) {
                    index.add(i);
                    list.remove(j);
                    break;
                }
            }
        }

        for (int i = 0; i < number.length(); i++) {
            if (!index.contains(i)) {
                answer += number.charAt(i) + "";
            }
        }

        return answer;
    }

    public static String solution2(String number, int k) {
        StringBuilder answer = new StringBuilder();

        int idx = 0;
        int comp = 0;
        for(int i=0; i<number.length()-k; i++){
            comp = 0;
            for(int j=idx; j<=i+k; j++){
                if(comp < number.charAt(j)-'0'){
                    comp = number.charAt(j)-'0';
                    idx = j+1;
                }
            }
            answer.append(comp);
        }
        return answer.toString();
    }

}
