package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T363Test {

    T363 t;

    @BeforeEach
    void setUp() {
        t = new T363();
    }

    @Test
    void test_1() {
        int[][] matrix = {{1, 0, 1}, {0, -2, 3}};
        int k = 2;
        int actual = t.maxSumSubmatrix(matrix, k);
        int expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int[][] matrix = {{2, 2, -1}};
        int k = 3;
        int actual = t.maxSumSubmatrix(matrix, k);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[][] matrix = {{2, 2, -1}};
        int k = 0;
        int actual = t.maxSumSubmatrix(matrix, k);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[][] matrix = {
                {5, -4, -3, 4},
                {-3, -4, 4, 5},
                {5, 1, 5, -4}
        };
        int k = 10;
        int actual = t.maxSumSubmatrix(matrix, k);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int[][] matrix = {
                {5, -4, -3, 4},
                {-3, -4, 4, 5},
                {5, 1, 5, -4}
        };
        int k = 3;
        int actual = t.maxSumSubmatrix(matrix, k);
        int expected = 2;
        assertEquals(expected, actual);
    }
}