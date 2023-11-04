package com.bootcamp.quis.day3;

public class Problem1 {
    public static void main(String[] args) {
        printMatrix(createMatrix(7));

    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != 0 || (row == 0 && col == 0)) {
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
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == 0 || row == matrix.length - 1) {
                    matrix[row][col] = col + row;
                }

                if (col == 0 || col == matrix[col].length - 1) {
                    matrix[row][col] = col + row;
                }
            }
        }
        return matrix;
    }
}
