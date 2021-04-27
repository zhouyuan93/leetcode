package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T76Test {

    T76 t;

    @BeforeEach
    void setUp() {
        t = new T76();
    }

    @Test
    void test_1() {
        String ss = "ADOBECODEBANC";
        String ts = "ABC";
        String actual = t.minWindow(ss, ts);
        String expected = "BANC";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String ss = "a";
        String ts = "a";
        String actual = t.minWindow(ss, ts);
        String expected = "a";
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String ss = "a";
        String ts = "b";
        String actual = t.minWindow(ss, ts);
        String expected = "";
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String ss = "ab";
        String ts = "b";
        String actual = t.minWindow(ss, ts);
        String expected = "b";
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        String ss = "abc";
        String ts = "ab";
        String actual = t.minWindow(ss, ts);
        String expected = "ab";
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        String ss = "bba";
        String ts = "ba";
        String actual = t.minWindow(ss, ts);
        String expected = "ba";
        assertEquals(expected,actual);
    }
}