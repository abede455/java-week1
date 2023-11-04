package com.bootcamp.quis.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

        System.out.println(sameElement(list1, list2));

    }

    public static List<Integer> sameElement(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet(list1);
        set1.retainAll(list2);

        return new ArrayList<Integer>(set1);
    }

}
