package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T304Test {

    T304 t;

    @BeforeEach
    void setUp() {
        t = new T304();
    }

    @Test
    void test_1() {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        T304.NumMatrix numMatrix = new T304.NumMatrix(matrix);
        assertEquals(11, numMatrix.sumRegion(1, 1, 2, 2));
        assertEquals(8, numMatrix.sumRegion(2, 1, 4, 3));
        assertEquals(12, numMatrix.sumRegion(1, 2, 2, 4));
    }

    @Test
    void test_2() {
        int[][] matrix = {
                {}
        };
        T304.NumMatrix numMatrix = new T304.NumMatrix(matrix);
        assertEquals(0, numMatrix.sumRegion(1, 2, 2, 4));
    }
}