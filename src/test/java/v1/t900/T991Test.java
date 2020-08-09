package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T991Test {

    T991 t;

    @BeforeEach
    void setUp() {
        t = new T991();
    }

    @Test
    void test_1() {
        int x = 2;
        int y = 3;
        int actual = t.brokenCalc(x, y);
        int expect = 2;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int x = 5;
        int y = 8;
        int actual = t.brokenCalc(x, y);
        int expect = 2;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int x = 3;
        int y = 10;
        int actual = t.brokenCalc(x, y);
        int expect = 3;
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        int x = 1024;
        int y = 1;
        int actual = t.brokenCalc(x, y);
        int expect = 1023;
        assertEquals(expect, actual);
    }

    @Test
    void test_5() {
        int x = 1;
        int y = 1;
        int actual = t.brokenCalc(x, y);
        int expect = 0;
        assertEquals(expect, actual);
    }
}