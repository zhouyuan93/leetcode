package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T10Test {

    T10 t ;

    @BeforeEach
    void setUp() {
        t = new T10();
    }

    @Test
    void test_1() {
        String s = "aa";
        String p = "a";
        boolean actual = t.isMatch(s, p);
        boolean expected = false;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        String s = "aa";
        String p = "a*";
        boolean actual = t.isMatch(s, p);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String s = "ab";
        String p = ".*";
        boolean actual = t.isMatch(s, p);
        boolean expected = true;
        assertEquals(expected,actual);
    }


    @Test
    void test_4() {
        String s = "abcdefg";
        String p = "ab*.*g";
        boolean actual = t.isMatch(s, p);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        String s = "aab";
        String p = "c*a*b*";
        boolean actual = t.isMatch(s, p);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        String s = "aaa";
        String p = "aaaa";
        boolean actual = t.isMatch(s, p);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_7() {
        String s = "a";
        String p = "..*";
        boolean actual = t.isMatch(s, p);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}