package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1486Test {

    T1486 t;

    @BeforeEach
    void setUp() {
        t = new T1486();
    }

    @Test
    void test_1() {
        int n = 5;
        int start = 0;
        int actual = t.xorOperation(n, start);
        int expected = 8;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        int n = 4;
        int start = 3;
        int actual = t.xorOperation(n, start);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        int n = 1;
        int start = 7;
        int actual = t.xorOperation(n, start);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        int n = 10;
        int start = 5;
        int actual = t.xorOperation(n, start);
        int expected = 2;
        assertEquals(expected, actual);
    }
}