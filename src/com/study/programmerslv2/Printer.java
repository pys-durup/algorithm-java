package com.study.programmerslv2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 프로그래머스 lv2 프린터
 */
public class Printer {
    public static void main(String[] args) {

        int[] temp = {3, 3, 4, 2};
//        int[] temp = {1, 1, 9, 1, 1, 1};
        System.out.println(solution(temp, 3));

    }
    // [1, 1, 1, 1, 1, 1] , 3 -> 4 return [2, 3, 3, 2, 9, 3, 3] , 3 -> 6 return 추천드립니다.

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        // 인쇄 대기목록의 가장 앞에 있는 문서(J를)를 대기목록에서 꺼냅니다
        // 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한개라도 존재하면 J를 대기목록의 마지막에 넣습니다
        // 그렇지 않으면 J를 인쇄합니다

        // 인쇄를 요청한 문서가 몇번째로 인쇄 되는지?
        // location 인쇄를 요청한 문서가 현재 대기목록의 어디에 위치하는지
        Queue<Integer> queue = new LinkedList<>();
        int index = location;

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
        }

        while (queue.size() >= 1) {

            // 맨앞 문서
            Integer temp = queue.peek();

            Integer[] tempArray = {};
            Integer[] integers = queue.toArray(tempArray);

            Arrays.sort(integers);
            queue.poll();

            if (temp >= integers[integers.length-1]) {
                answer += 1;

                if (index == 0) {
                    System.out.println("POLL! answer = " + answer);
                    break;
                }
            } else {
                queue.offer(temp);
            }

            // index 값 조정
            index -= 1;
            if (index < 0) {
                index = queue.size() - 1;
            }
            System.out.println("index = " + index);


        }
        return answer;
    }
}
