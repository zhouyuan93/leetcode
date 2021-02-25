package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T867Test {

    T867 t;

    @BeforeEach
    void setUp() {
        t = new T867();
    }

    @Test
    void test_1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] actual = t.transpose(matrix);
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i],actual[i]);
        }
    }

    @Test
    void test_2() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] actual = t.transpose(matrix);
        int[][] expected = {{1, 4}, {2, 5}, {3, 6}};
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i],actual[i]);
        }
    }
}