package com.company;

import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2D(matrix);
        flipHorizontalAxis(matrix);
    }

    public static void print2D(int[][] matrix) {
        System.out.println();
        int[][] var1 = matrix;
        int var2 = matrix.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int[] row = var1[var3];
            System.out.println(Arrays.toString(row));
        }

    }

    public static void flipHorizontalAxis(int[][] matrix) {
        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;

        for(int i = 0; i <= rows / 2; ++i) {
            System.out.println('i');
            for(int j = 0; j <= columns; ++j) {
                System.out.println('j');
                int temp = matrix[i][j];
                matrix[i][j] = matrix[rows - i][j];
                matrix[rows - i][j] = temp;
            }
        }

        print2D(matrix);
        int[][] result = new int[][]{{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        print2D(result);
    }
}
