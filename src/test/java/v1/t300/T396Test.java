package v1.t300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t300.T396;

import static org.junit.jupiter.api.Assertions.*;

class T396Test {

    T396 t;

    @BeforeEach
    void setUp() {
        t = new T396();
    }

    @Test
    void test_1() {
        int[] A = {4, 3, 2, 6};
        int actual = t.maxRotateFunction(A);
        int expect = 26;
        assertEquals(expect, actual);
    }
}