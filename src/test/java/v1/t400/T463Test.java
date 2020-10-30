package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T463Test {
    T463 t;

    @BeforeEach
    void setUp() {
        t = new T463();
    }

    @Test
    void test_1() {
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        int expected = t.islandPerimeter(grid);
        int actual = 16;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] grid = {{1}};
        int expected = t.islandPerimeter(grid);
        int actual = 4;
        assertEquals(expected, actual);
    }
}