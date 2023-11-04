package com.bootcamp.quis.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(frequentElement(Arrays.asList(
                1, 1, 1, 2, 2, 2, 3, 3, 3)));

    }

    public static Map<Integer, Integer> frequentElement(List<Integer> list) {
        Collections.sort(list);
        Map<Integer, Integer> result = new HashMap<>();
        int element = list.get(0);
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == element) {
                count++;
            } else {
                result.put(element, count);
                element = list.get(i);
                count = 1;
            }
        }
        result.put(element, count);
        return result;
    }
}
