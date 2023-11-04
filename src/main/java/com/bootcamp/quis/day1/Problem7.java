package com.bootcamp.quis.day1;

import java.util.List;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(111212));

    }

    public static boolean isPalindrome(int number) {
        List<Integer> arrayOfDigit = Problem6.extractDigit(number);
        int banyakDigit = arrayOfDigit.size();
        for (int i = 0; i <= banyakDigit / 2; i++) {
            if (arrayOfDigit.get(i) != arrayOfDigit.get(banyakDigit - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
