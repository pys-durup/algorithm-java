package com.study.programmerslv2;

import java.util.*;

/**
 * 프로그래머스 lv2 가장 큰 수
 */
public class LargestNumber {
    public static void main(String[] args) {
        int[] number = {3, 30, 34, 5, 9};
        System.out.println(solution(number));
    }

    // Comparator 사용
    static String solution(int[] numbers) {
        String answer = "";

        String[] strArray = new String[numbers.length];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }

        //내림차순 정렬 - (o2+o1).compareTo(o1+o2);
        Arrays.sort(strArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (strArray[0].equals("0")) return "0";

        for (String s : strArray) {
            answer += s;
        }

        return answer;
    }

    //Collections
    static String solution2(int[] numbers) {
        String answer = "";

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, (a, b) -> {
            String as = String.valueOf(a);
            String bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });

        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        if(answer.charAt(0) == '0') {
            return "0";
        }else {
            return answer;
        }
    }

}
