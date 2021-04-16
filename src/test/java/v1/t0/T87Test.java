package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T87Test {

    T87 t;

    @BeforeEach
    void setUp() {
        t = new T87();
    }

    @Test
    void test_1() {
        String s1 = "great";
        String s2 = "rgeat";
        boolean actual = t.isScramble(s1, s2);
        boolean expected = true;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        String s1 = "abcde";
        String s2 = "caebd";
        boolean actual = t.isScramble(s1, s2);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String s1 = "a";
        String s2 = "a";
        boolean actual = t.isScramble(s1, s2);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String s1 = "a";
        String s2 = "b";
        boolean actual = t.isScramble(s1, s2);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String s1 = "eebaacbcbcadaaedceaaacadccd";
        String s2 = "eadcaacabaddaceacbceaabeccd";
        boolean actual = t.isScramble(s1, s2);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}