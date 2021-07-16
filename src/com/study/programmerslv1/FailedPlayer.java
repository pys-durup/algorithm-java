package com.study.programmerslv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * 프로그래머스 lv1 완주하지 못한 선수
 */
public class FailedPlayer {
    public static void main(String[] args) {

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution2(participant, completion));
    }

    static String solution(String[] participant, String[] completion) {
        String answer = "";

        ArrayList<String> list = new ArrayList<>();
        for (String s : participant) {
            list.add(s);
        }
        for (int i = 0; i < completion.length; i++) {
            int count = 0;
            for (int j = 0; j < participant.length; j++) {
                if (count == 1) continue;
                if (completion[i].equals(participant[j])) {
                    list.remove(completion[i]);
                    count++;
                }
            }
        }
        for (String s : list) {
            answer += s;
        }
        return answer;
    }

    static String solution2(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> userCount = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            // 이미 존재하는 이름
            if (userCount.containsKey(participant[i])) {
                userCount.put(participant[i], userCount.get(participant[i]) + 1);
            } else {
                userCount.put(participant[i], 1);
            }
        }

        for (int i = 0; i < completion.length; i++) {
            userCount.put(completion[i], userCount.get(completion[i]) - 1);
        }

        Set<String> strings = userCount.keySet();
        for (String name : strings) {
            if (userCount.get(name) >= 1) {
                answer += name;
            }
        }

        return answer;
    }
}
