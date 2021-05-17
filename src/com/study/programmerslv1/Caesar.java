package com.study.programmerslv1;

public class Caesar {
    public static void main(String[] args) {

        System.out.println(solution("z", 1));

    }

    static String solution(String s, int n) {
        String answer = "";
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char)((int)charArray[i] + n);

                if(charArray[i] > 'Z') {
                    charArray[i] = (char)('A' + (charArray[i] - 'Z' - 1));
                }
            }
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char)((int)charArray[i] + n);

                if(charArray[i] > 'z') {
                    charArray[i] = (char)('a' + (charArray[i] - 'z' - 1));
                }
            }

        }

        for (char c : charArray) {
            answer += c;
        }
        return answer;

    }
}
