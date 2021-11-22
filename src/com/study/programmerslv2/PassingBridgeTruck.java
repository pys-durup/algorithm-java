package com.study.programmerslv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 프로그래머스 lv2 다리를 지나는 트럭
 */
public class PassingBridgeTruck {

    public static int now_weight = 0;
    public static int now_length = 0;
    public static int time = 0;


    public static void main(String[] args) {

        int[] truck_weights = {7, 4, 5, 6};
        System.out.println(solution(2, 10, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        // bridge_length = 동시에 다리위에 올라갈 수 있는 트럭 수
        // weight = 다리가 견딜 수 있는 무게
        // truck_weight = 트럭 무게 배열

        Queue<Integer> weightsQueue = new LinkedList<>();
        Queue<Truck> bridgeQueue = new LinkedList<>();
        Stack<Integer> resultStack = new Stack<>();

        for (int i : truck_weights) {
            weightsQueue.offer(i);
        }


        while (resultStack.size() < truck_weights.length) {

            int t = weightsQueue.peek();
            // 다리를 체크해서 트럭을 올릴수 있는지 판단
            if (now_weight + t <= weight && now_length + 1 <= bridge_length) {

                // 트럭을 올린다, 무게증가, 개수증가
                int temp = weightsQueue.poll();
                // bridgeQueue에는 트럭객체 (현재시간, 무게) 을 넣음
                bridgeQueue.offer(new Truck(time, temp));
                now_weight += temp;
                now_length += 1;
                System.out.println("시간 : " +time+ " 다리에 올라감 -> " + temp);
                System.out.println("now_weight = " + now_weight);
                System.out.println("now_length = " + now_length);
            }



            // 다리를 체크해서 나갈 트럭이 있는지 판단
            if (bridgeQueue.peek().getInsertTime() + bridge_length == time) {
                // 트럭이 나간다
                Truck temp = bridgeQueue.poll();
                resultStack.push(temp.getTruckWeight());
                now_weight -= temp.getTruckWeight();
                now_length -= 1;
            }

            // 시간의 흐름
            time += 1;
        }

        return time;
    }

    static class Truck {
        private int insertTime;
        private int truckWeight;

        public Truck(int insertTime, int truckWeight) {
            this.insertTime = insertTime;
            this.truckWeight = truckWeight;
        }

        public int getInsertTime() {
            return insertTime;
        }

        public int getTruckWeight() {
            return truckWeight;
        }
    }


}
