package ru.vsu.cs;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "res/matrix.txt";

        System.out.println("Matrix created from file:");
        int[][] matrixFromFile = MatrixUtils.createMatrixFromFile(path);
        MatrixUtils.printMatrix(matrixFromFile);

        System.out.println();

        int[][] changedMatrixFromFile = Solution.changeColumnsValues(matrixFromFile);
        MatrixUtils.printMatrix(changedMatrixFromFile);

        System.out.println();

        System.out.println("Matrix created with Random:");
        int[][] randomMatrix = MatrixUtils.createMatrixWithRandom(5);
        MatrixUtils.printMatrix(randomMatrix);
        System.out.println();

        int[][] changedRandomMatrix = Solution.changeColumnsValues(randomMatrix);
        MatrixUtils.printMatrix(changedRandomMatrix);
    }
}
