package com.bootcamp.quis.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem7 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 11, 13, 17));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(mergeList(list1, list2));

    }

    public static List<Integer> mergeList(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        Collections.sort(result);
        return result;
    }
}
