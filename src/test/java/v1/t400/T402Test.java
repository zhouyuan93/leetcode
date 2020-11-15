package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T402Test {
    T402 t;

    @BeforeEach
    void setUp() {
        t = new T402();
    }

    @Test
    void test_1() {
        String num = "1432219";
        int k = 3;
        String actual = t.removeKdigits(num, k);
        String expected = "1219";
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String num = "10200";
        int k = 1;
        String actual = t.removeKdigits(num, k);
        String expected = "200";
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String num = "";
        int k = 0;
        String actual = t.removeKdigits(num, k);
        String expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String num = "10";
        int k = 1;
        String actual = t.removeKdigits(num, k);
        String expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String num = "100";
        int k = 3;
        String actual = t.removeKdigits(num, k);
        String expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    void test_6() {
        String num = "112";
        int k = 1;
        String actual = t.removeKdigits(num, k);
        String expected = "11";
        assertEquals(expected, actual);
    }

    @Test
    void test_7() {
        String num = "110027";
        int k = 1;
        String actual = t.removeKdigits(num, k);
        String expected = "10027";
        assertEquals(expected, actual);
    }

    @Test
    void test_8() {
        String num = "1110010101011";
        int k = 5;
        String actual = t.removeKdigits(num, k);
        String expected = "1011";
        assertEquals(expected, actual);
    }
}