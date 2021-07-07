package com.study.programmerslv1;

import java.util.ArrayList;
import java.util.Collections;

public class FailedPlayer {
    public static void main(String[] args) {

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(participant, completion));
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
}
