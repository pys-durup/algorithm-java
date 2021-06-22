package com.study.programmerslv1;

import java.util.*;

/**
 * 프로그래머스 lv1 두개 뽑아서 더하기
 */
public class PickTwoAdd {
    public static void main(String[] args) {

        int[] array = {2,1,3,4,1};
        int[] solution = solution2(array);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    static int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> numberSet = new HashSet<>();

        for (int i=0; i<numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numberSet.add((numbers[i] + numbers[j]));
            }
        }

        ArrayList<Integer> list = new ArrayList<>(numberSet); // set -> ArrayList
        Collections.sort(list); // sort

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) { //ArrayList -> Array
            answer[i] = list.get(i);
        }

        return answer;
    }

    // TreeSet & iterator 사용
    static int[] solution2(int[] numbers) {
        Set<Integer> sumNumber = new TreeSet();

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                sumNumber.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumNumber.size()];
        int index = 0;
        Iterator itor = sumNumber.iterator();
        while(itor.hasNext()){
            answer[index] = (int)itor.next();
            index++;
        }

        return answer;
    }

    // stream 사용
    static int[] solution3(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
