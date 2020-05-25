package com.alter.diman;

public class ConsoleHelper {

    public static void printMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                System.out.print(matrix.getMatrix()[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
