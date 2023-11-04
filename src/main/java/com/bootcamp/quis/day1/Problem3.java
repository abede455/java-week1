package com.bootcamp.quis.day1;

public class Problem3 {
    public static void main(String[] args) {
        deretBox(5);

    }

    public static void deretBox(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 1) {
                    System.out.print(i);
                } else {
                    System.out.print((n + 1) - i);
                }
            }
            System.out.println();
        }
    }
}
