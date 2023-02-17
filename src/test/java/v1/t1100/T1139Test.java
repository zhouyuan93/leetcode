package v1.t1100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1139Test {

    T1139 t;

    @BeforeEach
    void setUp() {
        t = new T1139();
    }

    @Test
    void test_1() {
        int[][] grids = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int actual = t.largest1BorderedSquare(grids);
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    void test_2() {
        int[][] grids = {
                {1, 1, 1, 0}
        };
        int actual = t.largest1BorderedSquare(grids);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    void test_3() {
        int[][] grids = {
                {0, 0,0, 1}
        };
        int actual = t.largest1BorderedSquare(grids);
        int expected = 1;
        assertEquals(actual, expected);
    }
}