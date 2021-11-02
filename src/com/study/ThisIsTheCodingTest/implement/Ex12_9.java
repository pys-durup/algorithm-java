package com.study.ThisIsTheCodingTest.implement;

/**
 * 구현 유형기출 12-9 문자열 압축
 */
public class Ex12_9 {
    public static void main(String[] args) {
        String s = "aabbaccc";
        solution(s);
    }

    static int solution(String s) {
        int answer = 99999; // 결과값

        int length = s.length();

        // 1자리 부터 length/2 자리까지 비교
        for (int i = 1; i <= length / 2; i++) {
            int tempAnswer = 0;
            for (int j = 0; j < length - i; j++) {
                if (s.substring(j, j+i).equals(s.substring(j+i,j+i)) ) {
                    System.out.println("ture");
                }

                j+=i;

            }
        }
        return answer;
    }

    /**
     * 40~50분 시도했는데 실패함.
     */
}
