package v1.t400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T467Test {

    T467 t = new T467();

    @Test
    void test_1() {
        String p = "zab";
        int actual = t.findSubstringInWraproundString(p);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String p = "cac";
        int actual = t.findSubstringInWraproundString(p);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String p = "abcabcd";
        int actual = t.findSubstringInWraproundString(p);
        int expected = 10;
        assertEquals(expected,actual);
    }
}