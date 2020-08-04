package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t0.T69;

import static org.junit.jupiter.api.Assertions.*;

class T69Test {

    private T69 t;

    @BeforeEach
    void setUp() {
        t = new T69();
    }

    @Test
    void test6() {
        int x = 46340 * 46340 - 1;
        int actual = t.mySqrt(x);
        int expect = 46340 - 1;
        assertEquals(expect, actual);
    }

    @Test
    void test5() {
        int x = 401;
        int actual = t.mySqrt(x);
        int expect = 20;
        assertEquals(expect, actual);
    }

    @Test
    void test4() {
        int x = 19;
        int actual = t.mySqrt(x);
        int expect = 4;
        assertEquals(expect, actual);
    }

    @Test
    void test3() {
        int x = 9;
        int actual = t.mySqrt(x);
        int expect = 3;
        assertEquals(expect, actual);
    }

    @Test
    void test2() {
        int x = 4;
        int actual = t.mySqrt(x);
        int expect = 2;
        assertEquals(expect, actual);
    }

    @Test
    void test1() {
        int x = 0;
        int actual = t.mySqrt(x);
        int expect = 0;
        assertEquals(expect, actual);
    }
}