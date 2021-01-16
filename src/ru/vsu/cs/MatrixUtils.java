package ru.vsu.cs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MatrixUtils {

    public static int[][] createMatrixWithRandom(int n) {
        Random rnd = new Random();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(2);
            }
        }
        return matrix;
    }

    public static int[][] createMatrixFromFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner cin = new Scanner(file);

        int rowCount = Integer.parseInt(cin.nextLine());
        int colCount = Integer.parseInt(cin.nextLine());

        int[][] matrix = new int[rowCount][colCount];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(cin.nextLine());
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

