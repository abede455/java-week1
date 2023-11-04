package com.bootcamp.quis.day5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem2 {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> b = new HashSet<>(Arrays.asList(2, 4, 6, 7));
        System.out.println(diffSetAB(a, b));
        System.out.println(diffSetBA(a, b));
        System.out.println(intersecAB(a, b));
        System.out.println(union(a, b));

    }

    public static Set<Integer> diffSetAB(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }

    public static Set<Integer> diffSetBA(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(b);
        result.removeAll(a);
        return result;
    }

    public static Set<Integer> intersecAB(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(b);
        result.retainAll(a);
        return result;
    }

    public static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

}
