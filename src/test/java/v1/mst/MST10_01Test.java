package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MST10_01Test {

    MST10_01 t;

    @BeforeEach
    void setUp() {
        t = new MST10_01();
    }

    @Test
    void test_1() {
        int[] a = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] b = {2, 5, 6};
        int n = 3;
        t.merge(a, m, b, n);
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals(expected, a);
    }

    @Test
    void test_2() {
        int[] a = {0};
        int m = 0;
        int[] b = {1};
        int n = 1;
        t.merge(a, m, b, n);
        int[] expected = {1};
        assertArrayEquals(expected, a);
    }
}