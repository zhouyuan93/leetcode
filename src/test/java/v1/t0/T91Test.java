package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T91Test {

    T91 t;

    @BeforeEach
    void setUp() {
        t = new T91();
    }

    @Test
    void test_1() {
        String s = "12";
        int actual = t.numDecodings(s);
        int expected = 2;
        assertEquals(expected,actual);
    }
    @Test
    void test_2() {
        String s = "226";
        int actual = t.numDecodings(s);
        int expected = 3;
        assertEquals(expected,actual);
    }
    @Test
    void test_3() {
        String s = "0";
        int actual = t.numDecodings(s);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String s = "06";
        int actual = t.numDecodings(s);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        String s = "1201234";
        int actual = t.numDecodings(s);
        int expected = 3;
        assertEquals(expected,actual);
    }
}