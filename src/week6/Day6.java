package week6;

import java.util.Arrays;

public class Day6 {

    public static int[][] matrixTranspose(int[][] matrix) {

        int newRow = matrix[0].length;
        int newCol = matrix.length;

        int[][] transposeMatrix = new int[newRow][newCol];

        for (int i = 0; i < newRow; i++) {
            for (int j = 0; j < newCol; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        return transposeMatrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new int[][]{{1, 2, 3}, {4, 5, 6}}));
        System.out.println(Arrays.deepToString(new int[][]{{1, 4}, {2, 5}, {3, 6}}));
        System.out.println(Arrays.deepToString(matrixTranspose(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }
}
