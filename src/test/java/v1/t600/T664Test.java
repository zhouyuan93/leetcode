package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T664Test {

    T664 t;

    @BeforeEach
    void setUp() {
        t = new T664();
    }

    @Test
    void test_1() {
        String s = "aabbb";
        int actual = t.strangePrinter(s);
        int expected = 2;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        String s = "abcabab";
        int actual = t.strangePrinter(s);
        int expected = 5;
        assertEquals(expected,actual);
    }


    @Test
    void test_3() {
        String s = "aaabbb";
        int actual = t.strangePrinter(s);
        int expected = 2;
        assertEquals(expected,actual);
    }
}