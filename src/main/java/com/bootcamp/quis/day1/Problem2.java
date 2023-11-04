package com.bootcamp.quis.day1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input jumlahbaris piramid : ");
        int n = scan.nextInt();
        piramid(n);

    }

    public static void piramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= n - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
