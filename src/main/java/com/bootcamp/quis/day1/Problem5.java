package com.bootcamp.quis.day1;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(perfectNumber(100000));
    }

    public static List<Integer> perfectNumber(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (isPerfectNumber(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> listDivisor(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int num : listDivisor(n)) {
            sum += num;
        }
        return sum == n;
    }
}
