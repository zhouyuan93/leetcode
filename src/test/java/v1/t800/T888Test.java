package v1.t800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T888Test {

    T888 t;

    @BeforeEach
    void setUp() {
        t = new T888();
    }

    @Test
    void test_1() {
        int[] A = {1, 1};
        int[] B = {2, 2};
        int[] actual = t.fairCandySwap(A, B);
        int[] expected = {1, 2};
        assertArrayEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] A = {2};
        int[] B = {1, 3};
        int[] actual = t.fairCandySwap(A, B);
        int[] expected = {2, 3};
        assertArrayEquals(expected,actual);
    }
}