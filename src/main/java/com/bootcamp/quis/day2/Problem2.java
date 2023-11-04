package com.bootcamp.quis.day2;

import java.util.HashSet;
import java.util.Set;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println(capitalize("codeid bootcamp"));
        System.out.println(capitalize("black pink venom"));

    }

    public static String capitalize(String string) {
        StringBuilder stb = new StringBuilder();
        char[] arrayChar = string.toLowerCase().trim().toCharArray();
        stb.append(Character.toUpperCase(arrayChar[0]));
        for (int i = 1; i < arrayChar.length; i++) {
            if (arrayChar[i - 1] == ' ') {
                stb.append((Character.toUpperCase(arrayChar[i])));
            } else {
                stb.append(arrayChar[i]);
            }
        }
        return stb.toString();
    }
}
