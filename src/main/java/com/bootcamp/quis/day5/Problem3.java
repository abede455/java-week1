package com.bootcamp.quis.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(reverseList(list));

    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reverseList = new ArrayList<Integer>(list);
        Collections.reverse(reverseList);
        return reverseList;

    }
}
