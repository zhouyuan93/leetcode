package v1.t1700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1706Test {

    T1706 t;

    @BeforeEach
    void setUp() {
        t = new T1706();
    }

    @Test
    void test_1() {
        int[][] grid = {{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}};
        int[] actual = t.findBall(grid);
        int[] expected = {1, -1, -1, -1, -1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] grid = {{1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}, {1, 1, 1, 1, 1, 1}, {-1, -1, -1, -1, -1, -1}};
        int[] actual = t.findBall(grid);
        int[] expected = {0, 1, 2, 3, 4, -1};
        assertArrayEquals(expected, actual);
    }
}