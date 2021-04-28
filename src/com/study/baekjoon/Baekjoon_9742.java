package com.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_9742 {
    static int count;
    static String answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine())!= null) {
            String[] temp = line.split(" ");

            char[] arr = temp[0].toCharArray();
            int position = Integer.parseInt(temp[1]); // 몇번째?
            count = 0;
            answer = "";
            char[] output = new char[arr.length];

            boolean[] visited = new boolean[arr.length];

            perm(arr, output, visited, 0,  position);

            if (answer.equals("")) {
                System.out.println(temp[0] + " " + temp[1] + " = " + "No permutation");
            } else {
                System.out.println(temp[0] + " " + temp[1] + " = " + answer);
            }
        }


    }

    private static void perm(char[] arr, char[] output, boolean[] visited, int depth, int position) {

        if (depth == arr.length) {
            count += 1;
            if (position == count) {
                answer = String.valueOf(output);
                return;
            }
            return;
        }

        for (int i=0; i<arr.length; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth+1, position);
                visited[i] = false;
            }
        }
    }
}