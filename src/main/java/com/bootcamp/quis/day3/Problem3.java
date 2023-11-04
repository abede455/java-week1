package com.bootcamp.quis.day3;

public class Problem3 {
    public static void main(String[] args) {
        printMatrix(createMatrix(7));

    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != 0) {
                    System.out.printf("%5s", matrix[row][col]);
                } else {
                    System.out.printf("%5s", " ");
                }
            }
            System.out.println();
        }

    }

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int power = 1;
        int lastNum = 2;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    if (count % 4 == 0) {
                        matrix[n - 1 - j][j] = (int) Math.pow(3, power);
                        power++;
                        count++;
                    } else {
                        matrix[n - 1 - j][j] = lastNum;
                        lastNum += 3;
                        count++;
                    }
                }
            }

            if (i == 1) {
                for (int j = 1; j < n; j++) {
                    if (count % 4 == 0) {
                        matrix[j][n - 1] = (int) Math.pow(3, power);
                        power++;
                        count++;
                    } else {
                        matrix[j][n - 1] = lastNum;
                        lastNum += 3;
                        count++;
                    }
                }
            }

            if (i == 2) {
                for (int j = (n - 1) - 1; j > 0; j--) {
                    if (count % 4 == 0) {
                        matrix[n - 1][j] = (int) Math.pow(3, power);
                        power++;
                        count++;
                    } else {
                        matrix[n - 1][j] = lastNum;
                        lastNum += 3;
                        count++;
                    }
                }
            }
        }
        return matrix;
    }

}
