package com.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2630 {

    static int blue = 0;
    static int white = 0;
    static int trace = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[][] arr = new int[length][length];
//        System.out.println(length);
        int index = 0;
        String line;
        while ((line=br.readLine())!= null) {
            String[] temp = line.split(" ");
            for (int i=0; i<length; i++) {
                arr[index][i] = Integer.parseInt(temp[i]);
            }
            index++;

            if(index == length) break;
        }


        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "");
            }
            System.out.println();
        }

        test(arr, length, 0,0);
        System.out.println(white);
        System.out.println(blue);

    }

    private static void test(int[][] arr, int length, int startX, int startY) {
        // 모두 1이거나 모두 0인지
//        boolean flag = true;

        int count = 0;
        for (int i=startY; i<length + startY; i++) {
            for( int j=startX; j<length + startX; j++) {
                if (arr[i][j] == 1) {
                    count++;
//                  break;
                }
            }
//            if (flag == false) break;
        }

        if (count == length * 2) {
            trace ++;
            System.out.println("파란 색종이" + trace);
            blue ++;
            return;
        } else if (count == 0) {
            trace ++;
            System.out.println("하얀 색종이" + trace);
            white ++;
            return;
        }


        if (length >= 2) {
            // 사각형의 4등분
            test(arr, length/2, startX, startY);

            test(arr, length/2, length/2, startY);

            test(arr, length/2, startX, length/2);

            test(arr, length/2, length/2, length/2);
        }
    }
}
