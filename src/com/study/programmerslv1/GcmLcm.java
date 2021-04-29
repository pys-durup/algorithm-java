package com.study.programmerslv1;

/**
 * the greatest common measure
 * the least common multiple
 */
public class GcmLcm {
    public static void main(String[] args) {

        int[] solution = solution(1, 10);

        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n, int m) {
        int gdc;
        int rcm;

        if (n < m) {
            gdc = gcd(m, n);
        } else {
            gdc = gcd(n, m);
        }

        rcm = rcm(n, m, gdc);
        int[] answer = {gdc, rcm};
        return answer;
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p%q);
    }

    public static int rcm(int p, int q, int gdc) {
        return gdc * (p/gdc) * (q/gdc);
    }

}
