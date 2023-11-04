package com.bootcamp.quis.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println(plusOne(new int[] { 1, 2, 3 }));
        System.out.println(plusOne(new int[] { 4, 3, 2, 1 }));
        System.out.println(plusOne(new int[] { 9 }));
        System.out.println(plusOne(new int[] { 1, 2, 3, 9 }));
    }

    public static List<Integer> plusOne(int[] array) {
        int number = 0;
        int sisa = 0;
        for (int i : array) {
            number = (number * 10) + i;
        }
        number += 1;
        List<Integer> result = new ArrayList<>();
        while (number > 0) {
            sisa = number % 10;
            number /= 10;
            result.add(sisa);
        }
        Collections.reverse(result);
        return result;
    }
}
