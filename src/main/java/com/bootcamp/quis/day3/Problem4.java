package com.bootcamp.quis.day3;

public class Problem4 {
    public static void main(String[] args) {
        Problem3.printMatrix(createMatrix(7));

    }

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int lastNum = 2;
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    if (count % 4 == 0) {
                        matrix[0][j] = 3;
                    } else {
                        matrix[0][j] = lastNum;
                        lastNum += 3;
                    }
                    count++;
                }
            }

            if (i == 1) {
                for (int j = 1; j < n; j++) {
                    if (count % 4 == 0) {
                        matrix[j][n - 1] = 3;
                    } else {
                        matrix[j][n - 1] = lastNum;
                        lastNum += 3;
                    }
                    count++;
                }
            }

            if (i == 2) {
                for (int j = (n - 1) - 1; j >= 0; j--) {
                    if (count % 4 == 0) {
                        matrix[n - 1][j] = 3;
                    } else {
                        matrix[n - 1][j] = lastNum;
                        lastNum += 3;
                    }
                    count++;
                }
            }

            if (i == 3) {
                for (int j = (n - 1) - 1; j > 0; j--) {
                    if (count % 4 == 0) {
                        matrix[j][0] = 3;
                    } else {
                        matrix[j][0] = lastNum;
                        lastNum += 3;
                    }
                    count++;
                }
            }
        }
        return matrix;
    }

}
