package com.study.programmerslv1;

/**
 * 프로그래머스 lv1 모의고사
 */
public class MockTest {
    public static void main(String[] args) {

        int[] answers = {1, 3, 2, 4, 2};
        int[] solution = solution(answers);
        for (int i : solution) {
            System.out.print(i);
        }

    }

    static int[] solution(int[] answers) {
        int[] answer = {};

        int length = answers.length;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int[] count = new int[3];

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] array3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < length; i++) {
            if ( answers[i] == array1[i % array2.length]){
                System.out.println("answers[i] = " + answers[i]);
                count1++;
            }
        }

        for (int i = 0; i < length; i++) {
            if ( answers[i] == array2[i % array2.length] ){
                System.out.println("answers[i] = " + answers[i]);
                count2++;
            }
        }


        for (int i = 0; i < length; i++) {
            if ( answers[i] == array3[i % array3.length] ){
                System.out.println("answers[i] = " + answers[i]);
                count3++;
            }
        }

        count[0] = count1;
        count[1] = count2;
        count[2] = count3;

        int max = count[0];
        for (int i=1; i<count.length; i++) {
            if (count[0] <= count[i]) {
                max = count[i];
            }
        }

        System.out.println("max = " + max);

        for (int i=0; i<count.length; i++) {
            if (count[i] >= max) {
                answer[i] = i+1;
            }
        }

        return answer;
    }
}
