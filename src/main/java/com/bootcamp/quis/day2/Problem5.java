package com.bootcamp.quis.day2;

public class Problem5 {
    public static void main(String[] args) {

        int[] result = findMinMax(new int[] { 2, 3, 4, 5, 6, 7, 8, 1, 10 });
        for (int i : result) {
            System.out.println(i);

        }

    }

    public static int[] findMinMax(int[] array) {
        int[] result = new int[2];
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        result[0] = min;
        result[1] = max;
        return result;
    }
}
