package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T773Test {

    T773 t;

    @BeforeEach
    void setUp() {
        t = new T773();
    }

    @Test
    void test_1() {
        int[][] board = {
                {1, 2, 3}, {4, 0, 5}
        };
        int actual = t.slidingPuzzle(board);
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int[][] board = {
                {1, 2, 3}, {5, 4, 0}
        };
        int actual = t.slidingPuzzle(board);
        int expected = -1;
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        int[][] board = {
                {4,1,2}, {5,0,3}
        };
        int actual = t.slidingPuzzle(board);
        int expected = 5;
        assertEquals(expected, actual);
    }
}