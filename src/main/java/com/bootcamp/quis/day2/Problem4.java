package com.bootcamp.quis.day2;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(isBraces("(())"));
        System.out.println(isBraces("()()"));
        System.out.println(isBraces("((()"));

    }

    public static boolean isBraces(String string) {
        char[] charArray = string.toCharArray();
        int count = 0;
        for (char c : charArray) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count == 0 ? true : false;
    }
}
