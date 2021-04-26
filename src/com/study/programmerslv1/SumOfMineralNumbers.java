package com.study.programmerslv1;

public class SumOfMineralNumbers {
    public static void main(String[] args) {

        int num = 12;
        System.out.println(solution(12));
        System.out.println(solution2(12));
    }
    static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }

        return answer;
    }

    static int solution2(int num) {
        int answer = 0;
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0) answer += i;
        }
        return answer+num;
    }

}
