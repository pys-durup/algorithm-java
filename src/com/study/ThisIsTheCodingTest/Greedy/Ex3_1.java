package com.study.ThisIsTheCodingTest.Greedy;

/**
 * Greedy 예제 3-1 거스름돈
 */
public class Ex3_1 {
    public static void main(String[] args) {

        // 500원 100원 50원 10원
        int[] arr = new int[]{500, 100, 50, 10};

        // 거스름돈
        int change = 1260;
        int n = 0;

        for ( int coin : arr) {

            n += (change / coin);
            change %= coin;
        }

        System.out.println(n);
        gitAnswer();

    }

    static void gitAnswer() {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for (int i = 0; i < 4; i++) {
            int coin = coinTypes[i];
            cnt += n / coin;
            n %= coin;
        }

        System.out.println(cnt);

    }
}

