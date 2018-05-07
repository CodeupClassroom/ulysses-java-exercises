/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12},
        };

        System.out.println(matrix[2][2]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[2][0]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.printf("%n");
        }

        for (int[] row : matrix) {
            for (int element: row) {
                System.out.printf("%d ", element);
            }
            System.out.printf("%n");
        }


    }
}
