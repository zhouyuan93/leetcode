package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1544Test {

    T1544 t;

    @BeforeEach
    void setUp() {
        t = new T1544();
    }


    @Test
    void test_1() {
        String s = "leEeetcode";
        String actual = t.makeGood(s);
        String expected = "leetcode";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String s = "abBAcC";
        String actual = t.makeGood(s);
        String expected = "";
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String s = "s";
        String actual = t.makeGood(s);
        String expected = "s";
        assertEquals(expected,actual);
    }
}