package com.bootcamp.quis.day3;

public class Problem2 {
    public static void main(String[] args) {
        Problem1.printMatrix(createMatrix(5));
    }

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n + 1][n + 1];
        int lastCol = matrix[0].length - 1;
        int lastRow = matrix.length - 1;

        for (int row = 0; row < lastRow; row++) {
            for (int col = 0; col < lastCol; col++) {
                matrix[row][col] = col + row;
                matrix[row][lastCol] += matrix[row][col];
                matrix[lastRow][col] += matrix[row][col];
                if (row == col) {
                    matrix[lastRow][lastCol] += matrix[row][col];
                }
            }
        }
        return matrix;
    }

}
