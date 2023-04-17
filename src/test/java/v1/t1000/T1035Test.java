package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1035Test {

    T1035 t;

    @BeforeEach
    void setUp() {
        t = new T1035();
    }

    @Test
    void test_1() {
        int[] A = {1, 4, 2};
        int[] B = {1, 2, 4};
        int actual = t.maxUncrossedLines(A, B);
        int expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int[] A = {2, 5, 1, 2, 5};
        int[] B = {10, 5, 2, 1, 5, 2};
        int actual = t.maxUncrossedLines(A, B);
        int expected = 3;
        assertEquals(expected, actual);
    }


    @Test
    void test_3() {
        int[] A = {1, 3, 7, 1, 7, 5};
        int[] B = {1, 9, 2, 5, 1};
        int actual = t.maxUncrossedLines(A, B);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int[] A = {1, 3, 7, 1, 7, 5};
        int[] B = {};
        int actual = t.maxUncrossedLines(A, B);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void test_21() {
        int[] A = {1, 4, 2};
        int[] B = {1, 2, 4};
        int actual = t.maxUncrossedLines(A, B);
        int expected = 2;
        assertEquals(expected, actual);
    }


    @Test
    void test_22() {
        int[] A = {2, 5, 1, 2, 5};
        int[] B = {10, 5, 2, 1, 5, 2};
        int actual = t.maxUncrossedLines(A, B);
        int expected = 3;
        assertEquals(expected, actual);
    }


    @Test
    void test_23() {
        int[] A = {1, 3, 7, 1, 7, 5};
        int[] B = {1, 9, 2, 5, 1};
        int actual = t.maxUncrossedLines(A, B);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_24() {
        int[] A = {1, 3, 7, 1, 7, 5};
        int[] B = {};
        int actual = t.maxUncrossedLines(A, B);
        int expected = 0;
        assertEquals(expected, actual);
    }
}