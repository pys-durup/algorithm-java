package com.study.programmerslv2;

/**
 * 프로그래머스 lv2 조이스틱
 * greedy 문제
 */
public class Joystick {
    public static void main(String[] args) {
        System.out.println(solution("JEROEN"));
        System.out.println(solution2("ABAAAAAAAAABB"));
    }

    static int solution(String name) {
        int answer = 0;
        int[] countArray = new int[name.length()];

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            int gap = (c - 'A');

            if (gap == 0) {
                countArray[i] = gap;
            } else if (gap >= 13) {
                // 역순
                countArray[i] = 26 - gap;
            } else {
                // 순서대로
                countArray[i] = gap;
            }
        }

        for (int i : countArray) {
            answer += i;
        }

        int rightA = 0;
        int leftA = 0;
        for (int i = 1; i < countArray.length; i++) {
            if (countArray[i] == 0) rightA++;
            if (countArray[i] != 0) break;
        }

        for (int i = countArray.length - 1; i > 0; i--) {
            if (countArray[i] == 0) leftA++;
            if (countArray[i] != 0) break;
        }

        if (rightA > leftA) {
            answer += (countArray.length -1) - rightA;
        } else {
            answer += (countArray.length -1) - leftA;
        }

        return answer;
    }

    static int solution2(String name) {
        int answer = 0;
        int len = name.length();
        int min_move = len - 1; // 기본적인 최소 이동값은 name 길이 - 1

        for (int i = 0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z'-name.charAt(i) + 1);

            int next = i+1; // 다음 이동할 위치

            // 다음 이동할 위치가 A면
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }

            min_move = Math.min(min_move, i+len-next + i);
        }

        answer += min_move;

        return answer;
    }
}
