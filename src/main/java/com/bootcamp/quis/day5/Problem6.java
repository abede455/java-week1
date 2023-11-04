package com.bootcamp.quis.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println(addition(Arrays.asList(9, 1, 9), Arrays.asList(4, 5, 6)));
        System.out.println(addition(Arrays.asList(9, 2, 7), Arrays.asList(1, 3, 5)));

    }

    public static List<Integer> addition(List<Integer> list1, List<Integer> list2) {
        int num1 = ListToInteger(list1);
        int num2 = ListToInteger(list2);
        int result = num1 + num2;
        return intToList(result);
    }

    public static List<Integer> intToList(int num) {
        List<Integer> result = new ArrayList<>();
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            num /= 10;
            result.add(digit);
        }
        Collections.reverse(result);
        return result;
    }

    public static int ListToInteger(List<Integer> list) {
        int result = 0;
        for (Integer num : list) {
            result = result * 10 + num;
        }
        return result;
    }

}
