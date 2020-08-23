package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T201Test {

    T201 t;

    @BeforeEach
    void setUp() {
        t = new T201();
    }

    @Test
    void test_1() {
        int m = 5;
        int n = 7;
        int actual = t.rangeBitwiseAnd(m, n);
        int expect = 4;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int m = 0;
        int n = 1;
        int actual = t.rangeBitwiseAnd(m, n);
        int expect = 0;
        assertEquals(expect, actual);
    }
}