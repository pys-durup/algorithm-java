package com.study.programmerslv1;

public class CountPAndY {
    public static void main(String[] args) {
        System.out.println(solution3("pPoooyY"));
        System.out.println(solution3("Pyy"));
    }

    static boolean solution(String s) {
        char[] array = s.toCharArray();
        boolean answer = true;
        int countP = 0;
        int countY = 0;

        for(int i=0; i<s.length(); i++) {
            if(array[i] == 'p' || array[i] == 'P') countP++;
            if(array[i] == 'y' || array[i] == 'Y') countY++;
        }

        if(countP != countY) answer = false;

        return answer;
    }

    static boolean solution2(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }

    static boolean solution3(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;

    }

}
