package com.study.ThisIsTheCodingTest.implement;

/**
 * 구현 유형기출 12-10 자물쇠와 열쇠
 */
public class Ex12_10 {
    public static void main(String[] args) {
        int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = {{0, 0, 0}, {0, 0, 1}, {0, 1, 0}};

        solution(key, lock);
    }

    static boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;

        /**
         * 문제 풀이 하지 못했고 접근 방식만 생각 해봤음
         * 배열의 회전, 4방향으로 이동하면서 비교
         * 배열의 모양이 일치하면 통과하는 것으로 생각
         */


        showArrays(key);



        return answer;
    }

    static void showArrays(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
