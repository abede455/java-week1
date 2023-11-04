package com.bootcamp.quis.day2;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("bananas"));
        System.out.println(removeDuplicate("lalalamama"));
        System.out.println(removeDuplicate("romairama"));

    }

    static String removeDuplicate(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> setChar = new HashSet<>();
        char[] charArray = string.toCharArray();
        for (char item : charArray) {
            if (!setChar.contains(item)) {
                setChar.add(item);
                stringBuilder.append(item);
            }
        }
        return stringBuilder.toString();
    }

}
