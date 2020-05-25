package com.alter.diman;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@Data
@AllArgsConstructor
public class Matrix {

    private int size;
    private int[][] matrix;
    private Random random = new Random();

    public Matrix(int n) {
        this.size = n;
        this.matrix = new int[n][n];
    }
}
