package com.company;

import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2D(matrix);
        flipVerticalAxis(matrix);
    }

    public static void print2D(int[][] matrix) {
        System.out.println();
        int[][] var1 = matrix;
        int var2 = matrix.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            int[] row = var1[var3];
            System.out.println(Arrays.toString(row));
        }

    }

    public static void flipVerticalAxis(int[][] matrix) {
        int rows = matrix.length - 1;
        int columns = matrix[0].length - 1;
        int temp;

        for (int i = 0; i <= rows; ++i) {
            System.out.println('i');
            for (int j = 0; j <= columns/2; ++j) {
                System.out.println('j');
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns - j];
                matrix[i][columns - j] = temp;
            }
        }
        print2D(matrix);
        int[][] result = new int[][]{{3, 2, 1}, {6, 5, 4}, {9, 8, 7}};
        print2D(result);
    }
}
