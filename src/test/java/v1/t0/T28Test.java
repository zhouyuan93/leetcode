package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T28Test {

    T28 t;

    @BeforeEach
    void setUp() {
        t = new T28();
    }

    @Test
    void test_1() {
        String s = "hello";
        String needle = "ll";
        int actual = t.strStr(s, needle);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String s = "mississippi";
        String needle = "issip";
        int actual = t.strStr(s, needle);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String s = "mississippi";
        String needle = "pi";
        int actual = t.strStr(s, needle);
        int expected = 9;
        assertEquals(expected,actual);
    }
}