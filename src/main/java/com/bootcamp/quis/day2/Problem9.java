package com.bootcamp.quis.day2;

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        int[] array = new int[] { 12, 15, 1, 5, 20 };
        System.out.println(Arrays.toString(rotateArray(array, 3)));

    }

    public static int[] rotateArray(int[] array, int number) {
        for (int i = 0; i < number; i++) {
            int temp = array[0];
            int lengthArray = array.length;
            for (int j = 1; j < lengthArray; j++) {
                array[j - 1] = array[j];
            }
            array[lengthArray - 1] = temp;
        }
        return array;
    }

}
