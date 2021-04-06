package com.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] intArray = new int[length];
        for(int i=0; i<length; i++) {
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        int maxNum = -1000000;
        int minNum = 1000000;

        for (int i : intArray) {
            if (maxNum <= i) {
                maxNum = i;
            }
            if (minNum >= i) {
                minNum = i;
            }
        }

        System.out.println(minNum + " " + maxNum);
    }
}
