package com.bootcamp.quis.day2;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int[] minArray = findMinRange(new int[] { 5, 3, 4, 2, 6, 7, 8, 9, 1, 10 }, 0, 7);
        System.out.println(Arrays.toString(minArray));

        int[] maxArray = findMaxRange(new int[] { 1, 22, 3, 4, 5, 10, 7, 8, 9, 49 }, 2, 7);
        System.out.println(Arrays.toString(maxArray));

    }

    public static int[] findMinRange(int[] array, int start, int end) {
        int[] result = new int[2];
        int min = array[start];
        int indeksMin = start;
        for (int i = start + 1; i < end; i++) {
            if (array[i] < min) {
                min = array[i];
                indeksMin = i;
            }
        }
        result[0] = min;
        result[1] = indeksMin;
        return result;
    }

    public static int[] findMaxRange(int[] array, int start, int end) {
        int[] result = new int[2];
        int max = array[start];
        int indeksMax = start;
        for (int i = start + 1; i < end; i++) {
            if (array[i] > max) {
                max = array[i];
                indeksMax = i;
            }
        }
        result[0] = max;
        result[1] = indeksMax;
        return result;
    }

}
