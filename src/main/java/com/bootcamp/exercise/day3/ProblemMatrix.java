package com.bootcamp.exercise.day3;

public class ProblemMatrix {
    public static void main(String[] args) {
        printMatrix(createMatrixDiagonalA(5));
        printMatrix(createMatrixDiagonalB(5));

    }

    static int[][] createMatrixDiagonalA(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j)
                    matrix[i][j] = i + 1;

                if (j > i)
                    matrix[i][j] = 10;

                if (j < i)
                    matrix[i][j] = 20;
            }
        }
        return matrix;
    }

    static int[][] createMatrixDiagonalB(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j)
                    matrix[i][j] = matrix.length - i;

                if (j > i)
                    matrix[i][j] = 20;

                if (j < i)
                    matrix[i][j] = 10;
            }
        }
        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
