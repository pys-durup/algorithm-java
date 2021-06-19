package com.study.programmerslv1;

/**
 * 프로그래머스 lv1 모의고사
 */
public class MockTest {
    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 4, 5};
        solution(answers);

    }

    static int[] solution(int[] answers) {
        int[] answer = {};

        int length = answers.length;
        int count = 0;
//        int[] array1 = new int[length];
//        int[] array2 = new int[length];
//        int[] array3 = new int[length];

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 1, 2, 3, 2, 4, 2, 5};

        for (int i = 0; i < length; i++) {
            if ( answers[i] == array1[(length - 1) % (array1.length - 1) + i] ){
                System.out.println("answers[i] = " + answers[i]);
                count++;
            }
        }
        System.out.println(count);
        count = 0;

        for (int i = 0; i < length; i++) {
            if ( answers[i] == array2[(length - 1) % (array2.length - 1) + i] ){
                System.out.println("answers[i] = " + answers[i]);
                count++;
            }
        }

        System.out.println(count);






        /**
         * [ 1, 2, 3 ,4, 5 ] -> number
         * [ 0, 1, 2, 3, 4 ] -> index
         *  answers[0] = array11[i%number.
         */


        return answer;
    }
}
