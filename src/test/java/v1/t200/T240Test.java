package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T240Test {

    T240 t;

    @BeforeEach
    void setUp() {
        t = new T240();
    }

    @Test
    void test_1() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 20;
        boolean actual = t.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 18;
        boolean actual = t.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 13;
        boolean actual = t.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        boolean actual = t.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        int[][] matrix = {
                {1, 4, 7, 11, 15}

        };
        int target = 4;
        boolean actual = t.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        int[][] matrix = {
                {1, 4, 7, 11, 15}

        };
        int target = 5;
        boolean actual = t.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_7() {
        int[][] matrix = {
                {1}
        };
        int target = 1;
        boolean actual = t.searchMatrix(matrix, target);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_8() {
        int[][] matrix = {
                {1}
        };
        int target = 4;
        boolean actual = t.searchMatrix(matrix, target);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}