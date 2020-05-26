package com.alter.diman;

public class Calculator {

    public static int sumUnderMainDiagonal(Matrix matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                if (i + j > matrix.getSize() - 1) sum += matrix.getMatrix()[i][j];
            }
        }

        return sum;
    }
}
