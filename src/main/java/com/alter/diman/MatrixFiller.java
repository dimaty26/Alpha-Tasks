package com.alter.diman;

import java.util.Random;

public class MatrixFiller {

    private static Random random = new Random();

    public static void fillTheMatrix(Matrix matrix) {
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize(); j++) {
                matrix.getMatrix()[i][j] = random.nextInt(10);
            }
        }
    }
}
