package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T459Test {

    T459 t;

    @BeforeEach
    void setUp() {
        t = new T459();
    }

    @Test
    void test_1() {
        String s = "abab";
        boolean actual = t.repeatedSubstringPattern(s);
        boolean expect = true;
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        String s = "aba";
        boolean actual = t.repeatedSubstringPattern(s);
        boolean expect = false;
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        String s = "abcabcabcabc";
        boolean actual = t.repeatedSubstringPattern(s);
        boolean expect = true;
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        String s = "abac";
        boolean actual = t.repeatedSubstringPattern(s);
        boolean expect = false;
        assertEquals(expect, actual);
    }

    @Test
    void test_5() {
        String s = "abacababacab";
        boolean actual = t.repeatedSubstringPattern(s);
        boolean expect = true;
        assertEquals(expect, actual);
    }
}