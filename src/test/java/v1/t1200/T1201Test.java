package v1.t1200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1201Test {

    T1201 t = new T1201();

    @Test
    void test_1() {
        int n = 3;
        int a = 2;
        int b = 3;
        int c = 5;
        int actual = t.nthUglyNumber(n, a, b, c);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int n = 4;
        int a = 2;
        int b = 3;
        int c = 4;
        int actual = t.nthUglyNumber(n, a, b, c);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int n = 5;
        int a = 2;
        int b = 11;
        int c = 13;
        int actual = t.nthUglyNumber(n, a, b, c);
        int expected = 10;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int n = 1000000000;
        int a = 2;
        int b = 217983653;
        int c = 336916467;
        int actual = t.nthUglyNumber(n, a, b, c);
        int expected = 1999999984;
        assertEquals(expected,actual);
    }
}