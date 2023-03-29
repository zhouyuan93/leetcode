package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1092Test {

    T1092 t;

    @BeforeEach
    void setUp() {
        t = new T1092();
    }

    @Test
    void test_1() {
        String str1 = "a";
        String str2 = "bb";
        String actual = t.shortestCommonSupersequence(str1, str2);
        String expected = "bba";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String str1 = "abab";
        String str2 = "babc";
        String actual = t.shortestCommonSupersequence(str1, str2);
        String expected = "ababc";
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String str1 = "abab";
        String str2 = "caba";
        String actual = t.shortestCommonSupersequence(str1, str2);
        String expected = "cabab";
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String str1 = "abab";
        String str2 = "tababct";
        String actual = t.shortestCommonSupersequence(str1, str2);
        String expected = "tababct";
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        String str1 = "abab";
        String str2 = "tababct";
        String actual = t.shortestCommonSupersequence(str1, str2);
        String expected = "tababct";
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        String str1 = "bbbaaaba";
        String str2 = "bbababbb";
        String actual = t.shortestCommonSupersequence(str1, str2);
        String expected = "bbabaaababb";
        System.out.println(actual);
        System.out.println(expected);
        assertEquals(expected.length(),actual.length());
    }
}