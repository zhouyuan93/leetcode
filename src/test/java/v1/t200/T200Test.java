package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T200Test {
    T200 t;

    @BeforeEach
    void setUp() {
        t = new T200();
    }

    @Test
    void test_1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int actual = t.numIslands(grid);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        char[][] grid = {
                {'1', '1', '0', '1', '0'},
                {'0', '1', '0', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'0', '1', '1', '1', '0'}
        };
        int actual = t.numIslands(grid);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        char[][] grid = {
                {'1', '1', '0', '1', '0'},
                {'0', '0', '0', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'0', '1', '1', '1', '0'}
        };
        int actual = t.numIslands(grid);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        char[][] grid = {
                {'1', '0', '1', '1', '0', '0', '1', '0', '1', '1', '1', '1', '0', '1', '0', '1', '1', '1', '1', '0'},
                {'0', '1', '0', '0', '1', '0', '1', '0', '1', '1', '1', '1', '1', '1', '0', '1', '1', '0', '1', '1'},
                {'1', '0', '0', '1', '0', '1', '0', '1', '0', '1', '1', '0', '1', '1', '1', '0', '0', '1', '1', '0'},
                {'0', '1', '1', '0', '0', '1', '1', '0', '1', '1', '1', '1', '0', '0', '1', '0', '0', '0', '1', '1'},
                {'1', '1', '0', '1', '0', '0', '1', '0', '0', '0', '1', '0', '1', '0', '1', '1', '1', '0', '1', '1'},
                {'0', '0', '0', '0', '1', '0', '1', '1', '0', '0', '1', '0', '0', '1', '0', '1', '1', '1', '1', '0'},
                {'1', '0', '1', '1', '1', '1', '0', '1', '1', '0', '1', '1', '0', '1', '1', '1', '0', '0', '1', '0'},
                {'0', '1', '1', '0', '0', '0', '1', '0', '0', '1', '0', '1', '1', '1', '0', '0', '1', '1', '0', '1'},
                {'0', '0', '0', '0', '1', '1', '0', '1', '0', '0', '1', '1', '0', '1', '0', '0', '1', '0', '1', '0'},
                {'0', '0', '1', '1', '1', '0', '1', '0', '1', '0', '1', '1', '1', '0', '1', '1', '1', '1', '1', '0'},
                {'1', '0', '1', '0', '1', '1', '1', '0', '1', '1', '1', '0', '1', '0', '1', '0', '1', '0', '1', '1'},
                {'0', '0', '1', '1', '1', '1', '0', '1', '1', '1', '0', '1', '0', '0', '0', '1', '1', '1', '0', '1'},
                {'1', '1', '1', '0', '0', '0', '0', '0', '1', '1', '0', '1', '1', '1', '0', '1', '1', '1', '1', '0'},
                {'0', '0', '1', '1', '1', '0', '0', '1', '0', '0', '1', '1', '1', '1', '1', '1', '0', '1', '1', '0'},
                {'0', '0', '0', '1', '1', '0', '0', '0', '0', '1', '1', '0', '1', '0', '0', '1', '1', '1', '1', '1'},
                {'0', '1', '1', '1', '0', '1', '0', '0', '1', '1', '1', '1', '1', '0', '1', '1', '1', '0', '0', '1'},
                {'0', '0', '0', '0', '1', '1', '1', '1', '0', '0', '0', '0', '1', '0', '0', '0', '0', '1', '1', '0'},
                {'1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '0', '1', '1', '0', '1', '1', '1', '1', '1', '1'},
                {'0', '1', '0', '0', '1', '0', '0', '1', '1', '1', '1', '1', '1', '0', '1', '0', '1', '1', '1', '1'},
                {'0', '0', '1', '1', '1', '1', '1', '0', '0', '0', '1', '1', '1', '1', '1', '1', '0', '1', '1', '0'}
        };
        int actual = t.numIslands(grid);
        int expected = 23;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        char[][] grid = {
                {'1', '1', '0', '1', '1'},
                {'0', '1', '0', '1', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '1', '0', '1', '0'},
                {'1', '1', '0', '1', '1'}
        };
        int actual = t.numIslands(grid);
        int expected = 4;
        assertEquals(expected, actual);
    }
}