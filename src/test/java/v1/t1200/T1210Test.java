package v1.t1200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1210Test {

    T1210 t = new T1210();


    @Test
    void test_1() {
        int[][] grid = {{0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1},
                {0, 0, 1, 0, 1, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 0, 0}};
        int actual = t.minimumMoves(grid);
        int expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] grid = {
                {0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 1, 1},
                {1, 1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 1},
                {1, 1, 1, 0, 0, 1},
                {1, 1, 1, 0, 0, 0}
        };
        int actual = t.minimumMoves(grid);
        int expected = 9;
        assertEquals(expected, actual);
    }
}