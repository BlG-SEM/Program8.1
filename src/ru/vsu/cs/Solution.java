package ru.vsu.cs;

public class Solution {

    public static int[][] changeColumnsValues(int[][] matrix) {
        int indexOfColumnWithMinSum = findIndexOfColumn(matrix, true);
        int indexOfColumnWithMaxSum = findIndexOfColumn(matrix, false);

        System.out.println("The index of the first column with the minimum sum of elements = " + indexOfColumnWithMinSum);
        System.out.println("The index of the last column with the maximum sum of elements = " + indexOfColumnWithMaxSum);

        int[][] result = matrix.clone();

        for (int i = 0; i < matrix.length; i++) {
            int temp = result[i][indexOfColumnWithMaxSum];
            result[i][indexOfColumnWithMaxSum] = result[i][indexOfColumnWithMinSum];
            result[i][indexOfColumnWithMinSum] = temp;
        }

        return result;
    }

    private static int findIndexOfColumn(int[][] matrix, boolean isMin) {
        int sum = findColumnSum(matrix, 0);
        int colIndex = 0;

        for (int i = 1; i < matrix[0].length; i++) {

            int currentColSum = findColumnSum(matrix, i);

            if ((isMin && currentColSum < sum) || (!isMin && currentColSum >= sum)) {
                sum = currentColSum;
                colIndex = i;
            }
        }

        return colIndex;
    }

    private static int findColumnSum(int[][] matrix, int colIndex) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == colIndex) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
