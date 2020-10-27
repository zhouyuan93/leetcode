package v1.jz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JZ48Test {

    JZ48 t;

    @BeforeEach
    void setUp() {
        t = new JZ48();
    }

    @Test
    void test_1() {
        String s = "abcabcbb";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    void test_2() {
        String s = "bbbbbb";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    void test_3() {
        String s = "";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void test_4() {
        String s = " ";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    void test_5() {
        String s = "au";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    void test_6() {
        String s = "cdd";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    void test_7() {
        String s = "aab";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    void test_8() {
        String s = "dvdw";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    void test_9() {
        String s = "ohomm";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    void test_10() {
        String s = "asjrgapa";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    void test_11() {
        String s = "alouzxilkaxkufsu";
        int actual = t.lengthOfLongestSubstring(s);
        int expected = 8;
        assertEquals(expected, actual);
    }
}