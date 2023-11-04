package com.bootcamp.quis.day3;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        char[][] jawabanSiswa = inputJawabanSiswa(7);
        periksaNilai(jawabanSiswa);

    }

    public static char[][] inputJawabanSiswa(int banyakSiswa) {
        Scanner scan = new Scanner(System.in);
        char[][] matrix = new char[banyakSiswa][10];
        for (int siswa = 0; siswa < banyakSiswa; siswa++) {
            System.out.print("Input 10 Jawaban dari Student-" + siswa + " tanpa spasi : ");
            String jawaban = String.format("%-10.10s", scan.next());

            char[] jawabanStudent = jawaban.toCharArray();
            matrix[siswa] = jawabanStudent;
        }
        return matrix;
    }

    public static void periksaNilai(char[][] jawabanSiswa) {
        char[] kunciJawaban = new char[] { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
        int[] jawabanBenar = new int[jawabanSiswa.length];
        for (int i = -1; i < jawabanSiswa.length + 1; i++) {
            for (int j = -1; j < jawabanSiswa[0].length + 1; j++) {
                if (j == -1) {
                    if (i == -1) {
                        System.out.printf("%15s", " ");
                    } else if (i < jawabanSiswa.length) {
                        System.out.printf("%15s", "Student-" + i);
                    } else {
                        System.out.printf("%15s", "Kunci Jawaban");
                    }
                } else if (j < jawabanSiswa[0].length) {
                    if (i == -1) {
                        System.out.printf("%3s", j);
                    } else if (i < jawabanSiswa.length) {
                        System.out.printf("%3c", jawabanSiswa[i][j]);
                        if (Character.toUpperCase(jawabanSiswa[i][j]) == kunciJawaban[j]) {
                            jawabanBenar[i] += 1;
                        }
                    } else {
                        System.out.printf("%3c", kunciJawaban[j]);
                    }
                } else {
                    if (i == -1) {
                        System.out.printf("%23s", "Banyak jawaban Benar");
                    } else if (i < jawabanSiswa.length) {
                        System.out.printf("%4s", jawabanBenar[i]);
                    }
                }
            }
            System.out.println("");
        }
    }

}
