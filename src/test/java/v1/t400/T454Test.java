package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T454Test {
    T454 t;

    @BeforeEach
    void setUp() {
        t = new T454();
    }

    @Test
    void test_1() {
        int[] A = { 1, 2};
        int[] B = {-2,-1};
        int[] C = {-1, 2};
        int[] D = { 0, 2};
        int actual = t.fourSumCount(A, B, C, D);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] A = {-1,-1};
        int[] B = {-1,1} ;
        int[] C = {-1,1} ;
        int[] D = {1,-1} ;
        int actual = t.fourSumCount(A, B, C, D);
        int expected = 6;
        assertEquals(expected, actual);
    }
}