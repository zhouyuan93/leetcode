package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1439Test {

    T1439 t;

    @BeforeEach
    void setUp() {
        t = new T1439();
    }

    @Test
    void test_1() {
        int[][] mat = {{1, 3, 11}, {2, 4, 6}};
        int k = 5;
        int actual = t.kthSmallest(mat, k);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[][] mat = {{1, 3, 11}, {2, 4, 6}};
        int k = 9;
        int actual = t.kthSmallest(mat, k);
        int expected = 17;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int[][] mat = {{1, 1, 10}, {2, 2, 9}};
        int k = 7;
        int actual = t.kthSmallest(mat, k);
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[][] mat = {{1, 10, 10}, {1, 4, 5}, {2, 3, 6}};
        int k = 7;
        int actual = t.kthSmallest(mat, k);
        int expected = 9;
        assertEquals(expected, actual);
    }


}