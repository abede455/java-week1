package com.bootcamp.quis.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem7 {
    public static void main(String[] args) {
        int[] result = evenOddOrder(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        System.out.println(Arrays.toString(result));
    }

    public static int[] evenOddOrder(int[] arrayInt) {
        Arrays.sort(arrayInt);
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 == 0) {
                evenList.add(arrayInt[i]);
            } else {
                oddList.add(arrayInt[i]);
            }
        }
        int[] result = new int[arrayInt.length];
        for (int i = 0; i < result.length; i++) {
            if (i < evenList.size()) {
                result[i] = evenList.get(i);
            } else {
                result[i] = oddList.get(i - evenList.size());
            }
        }
        return result;
    }

}
