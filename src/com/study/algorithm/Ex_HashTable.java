package com.study.algorithm;

import java.util.LinkedList;

class HashTable {
    static class Node { // LinkedList 에 저장할 Node
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
    LinkedList<Node>[] data; // LinkedList 참조변수형 배열 선언

    public HashTable(int size) { // HashTable 객체 생성시 LinkedList 참조변수형 배열의 사이즈를 정해준다
        this.data = new LinkedList[size];
    }

    int getHashCode(String key) { // 해시코드 생성
        int hashcode = 0;
        for (char c : key.toCharArray()) {
            hashcode += c; // 각 자리수의 아스키 코드 값을 더한값
        }
        return hashcode;
    }

    int convertToIndex(int hashcode) { // 해시코드를 인덱스로 변환한다
        return hashcode % data.length; // 해시코드 % LinkedList 참조변수형 배열의 사이즈
    }

    Node searchKey(LinkedList<Node> list, String key) { // LinkedList에 해당 key값이 존재하는지?
        if (list == null) return null; // 없으면 null 반환
        for (Node node : list) {
            if (node.key.equals(key)) {
                return node; // 있으면 해당 노드객체 반환
            }
        }
        return null;
    }
    void put(String key, String value) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        System.out.println( key + ", hashcode(" + hashcode + "), index(" + index + ")");
        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<Node>();
            data[index] = list;
        }
        Node node = searchKey(list, key); // 중복체크후 중복시 해당 노드값을 중복아닐시 null값을 넣어준다
        if (node == null) {
            list.addLast(new Node(key, value)); // 존재하지 않으면 node 객체값 넣기
        } else {
            node.setValue(value); // 이미 존재하면 덮어쓰기
        }
    }

    String get(String key) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null? "Not found" : node.getValue();
    }

    int getSize(int index) {
        return data[index].size();
    }
}


public class Ex_HashTable {
    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("sung", "this is sung");
        h.put("park", "this is park");
        h.put("young", "this is young");
        h.put("suua", "this is su");
        h.put("sung", "this is sungsung");

        System.out.println(h.get("sung"));
        System.out.println(h.get("park"));
        System.out.println(h.get("young"));
        System.out.println(h.get("su"));
        System.out.println(h.get("lol"));


        System.out.println(h.getSize(1));

    }
}
