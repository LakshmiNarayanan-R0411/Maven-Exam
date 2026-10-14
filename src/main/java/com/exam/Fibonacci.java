package com.exam;

public class Fibonacci {
    public int[] series(int n) {
        int[] result = new int[n];
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            result[i] = a;
            int next = a + b;
            a = b;
            b = next;
        }
        return result;
    }
}
