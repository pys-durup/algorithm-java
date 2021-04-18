package com.study.programmerslv1;

import java.util.Arrays;

// 행렬의 덧셈
public class MatrixAdd {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2}, {2,3}};
        int[][] arr2 = {{3,4}, {5,6}};

        int[][] solution = solution(arr1, arr2);

        for (int[] ints : solution) {
            Arrays.stream(ints).forEach(n-> System.out.print(n + ""));
            System.out.println();
        }


    }

    static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2.length];

        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
