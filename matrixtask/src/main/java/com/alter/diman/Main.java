package com.alter.diman;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(5);
        MatrixFiller.fillTheMatrix(matrix);
        ConsoleHelper.printMatrix(matrix);
        System.out.println(Calculator.sumUnderMainDiagonal(matrix));
    }
}
