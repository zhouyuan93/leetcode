package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T766Test {

    T766 t ;

    @BeforeEach
    void setUp() {
        t = new T766();
    }

    @Test
    void test_1() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        boolean actual = t.isToeplitzMatrix(matrix);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[][] matrix = {
                {1,2},
                {2,2}
        };
        boolean actual = t.isToeplitzMatrix(matrix);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[][] matrix = {
                {1},
                {3},
                {2}
        };
        boolean actual = t.isToeplitzMatrix(matrix);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}