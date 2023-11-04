package com.bootcamp.quis.day1;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println(reverse(12343546));

    }

    public static int reverse(int number) {
        List<Integer> digits = extractDigit(number);
        int numberReverse = 0;
        int banyakDigit = digits.size();
        for (int i = 0; i < banyakDigit; i++) {
            numberReverse += digits.get(i) * (int) Math.pow(10, banyakDigit - i - 1);
        }
        return numberReverse;
    }

    public static List<Integer> extractDigit(int number) {
        List<Integer> result = new ArrayList<>();
        while (number > 0) {
            int sisa = number % 10;
            number /= 10;
            result.add(sisa);
        }
        return result;
    }
}
