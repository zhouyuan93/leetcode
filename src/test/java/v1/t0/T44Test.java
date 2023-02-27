package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T44Test {

    T44 t;

    @BeforeEach
    void setUp() {
        t = new T44();
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
        String p = "*";
        boolean actual = t.isMatch(s, p);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String s = "aa";
        String p = "c*";
        boolean actual = t.isMatch(s, p);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String s = "abcde";
        String p = "ab*c?e";
        boolean actual = t.isMatch(s, p);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        String s = "adceb";
        String p = "**a*b";
        boolean actual = t.isMatch(s, p);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        String s = "bbbababbabbbbabbbbaabaaabbbbabbbababbbbababaabbbab";
        String p = "a******b*";
        boolean actual = t.isMatch(s, p);
        boolean expected = false;
        assertEquals(expected,actual);
    }
}