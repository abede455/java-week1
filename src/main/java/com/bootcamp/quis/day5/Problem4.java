package com.bootcamp.quis.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(removeDuplicate(Arrays.asList(1, 1, 2, 3, 4, 1, 2, 3)));
        System.out.println(removeDuplicate(Arrays.asList(7, 5, 3, 5, 1)));
        System.out.println(removeDuplicate(Arrays.asList(1, 1, 1, 1)));

    }

    public static List<Integer> removeDuplicate(List<Integer> list) {
        Set<Integer> setResult = new HashSet<>(list);

        return new ArrayList<Integer>(setResult);

    }

}
