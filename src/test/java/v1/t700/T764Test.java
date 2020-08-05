package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T764Test {

    T764 t;

    @BeforeEach
    void setUp() {
        t = new T764();
    }

    @Test
    void test_1() {
        int[][] mines = {{4, 2}};
        int actual = t.orderOfLargestPlusSign(5, mines);
        int expect = 2;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int[][] mines = {};
        int actual = t.orderOfLargestPlusSign(2, mines);
        int expect = 1;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int[][] mines = {{0, 0}};
        int actual = t.orderOfLargestPlusSign(1, mines);
        int expect = 0;
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        int[][] mines = {{0, 1}, {0, 2}, {1, 0}, {1, 1}, {1, 2}, {2, 0}, {2, 1}, {2, 2}};
        int actual = t.orderOfLargestPlusSign(3, mines);
        int expect = 1;
        assertEquals(expect, actual);
    }

    @Test
    void test_5() {
        int[][] mines = {{0, 0}, {0, 1}, {1, 1}, {2, 0}, {2, 1}, {2, 2}};
        int actual = t.orderOfLargestPlusSign(3, mines);
        int expect = 1;
        assertEquals(expect, actual);
    }

    @Test
    void test_6() {
        int[][] mines = {{0, 1}};
        int actual = t.orderOfLargestPlusSign(3, mines);
        int expect = 1;
        assertEquals(expect, actual);
    }

    @Test
    void test_7() {
        int[][] mines = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 0}, {1, 1}, {1, 2}, {1, 3}, {1, 4}, {2, 0}, {2, 1}, {2, 3},
                {2, 4}, {3, 1}, {3, 2}, {3, 3}, {3, 4}, {4, 0}, {4, 1}, {4, 2}, {4, 3}, {4, 4}};
        int actual = t.orderOfLargestPlusSign(5, mines);
        int expect = 1;
        assertEquals(expect, actual);
    }

    @Test
    void test_8() {
        int[][] mines = {{3, 0},{3,3}};
        int actual = t.orderOfLargestPlusSign(5, mines);
        int expect = 3;
        assertEquals(expect, actual);
    }
}