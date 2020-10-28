package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T481Test {

    T481 t;

    @BeforeEach
    void setUp() {
        t = new T481();
    }

    @Test
    void test_1() {
        int n = 1;
        int actual = t.magicalString(n);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int n = 6;
        int actual = t.magicalString(n);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int n = 12;
        int actual = t.magicalString(n);
        int expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int n = 18;
        int actual = t.magicalString(n);
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int n = 19;
        int actual = t.magicalString(n);
        int expected = 9;
        assertEquals(expected,actual);
    }
}