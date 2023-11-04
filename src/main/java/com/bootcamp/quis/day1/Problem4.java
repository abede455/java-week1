package com.bootcamp.quis.day1;

public class Problem4 {
    public static void main(String[] args) {
        deretBoxWithStrip(9);

    }

    public static void deretBoxWithStrip(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == j % 2) {
                    System.out.print("- ");
                } else {
                    System.out.print(j + " ");
                }

            }
            System.out.println();
        }
    }

}
