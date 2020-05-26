package com.alter.diman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    private Matrix testMatrix1 = new Matrix(4);
    private Matrix testMatrix2 = new Matrix(3);
    private Matrix testMatrix3 = new Matrix(5);

    {
        testMatrix1.setMatrix( new int[][] { {1, 2, 3, 4},
                                            {1, 2, 3, 4},
                                            {1, 2, 3, 4},
                                            {1, 2, 3, 4}
        });

        testMatrix2.setMatrix( new int[][]{ {1, 2, 3},
                                            {1, 2, 0},
                                            {1, 0, 0}
        });

        testMatrix3.setMatrix( new int[][] {{1, 2, 3, 4, 5},
                                            {1, 2, 3, 4, -5},
                                            {1, 2, 3, 4, -5},
                                            {1, -2, -3, -4, -5},
                                            {0, 0, 0, 0, 0}
        });
    }

    @Test
    public void TestMatrix() {
        Assertions.assertEquals(Calculator.sumUnderMainDiagonal(testMatrix1), 20);
        Assertions.assertEquals(Calculator.sumUnderMainDiagonal(testMatrix2), 0);
        Assertions.assertEquals(Calculator.sumUnderMainDiagonal(testMatrix3), -18);
    }
}
