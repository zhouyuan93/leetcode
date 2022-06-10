package v1.t700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T730Test {

    T730 t = new T730();

    @Test
    void test_1() {
        String s = "ab";
        int actual = t.countPalindromicSubsequences(s);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String s = "abb";
        int actual = t.countPalindromicSubsequences(s);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String s = "abba"; // a b bb aa aba abba
        int actual = t.countPalindromicSubsequences(s);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        String s = "acabbaca"; // a b bb aa aba abba
        int actual = t.countPalindromicSubsequences(s);
        int expected = 26;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        String s = "aaaa"; // a b bb aa aba abba
        int actual = t.countPalindromicSubsequences(s);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    void test_6() {
        String s = "aaa"; // a b bb aa aba abba
        int actual = t.countPalindromicSubsequences(s);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_7() {
        String s = "acabbacaacabbaca"; // a b bb aa aba abba
        int actual = t.countPalindromicSubsequences(s);
        int expected = 252;
        assertEquals(expected,actual);
    }

    @Test
    void test_999() {
        String s = "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"; // a b bb aa aba abba
        int actual = t.countPalindromicSubsequences(s);
        int expected = 104860361;
        assertEquals(expected,actual);
    }

    @Test
    void test_9999() {
        String s = "bcbacbabdcbcbdcbddcaaccdcbbcdbcabbcdddadaadddbdbbbdacbabaabdddcaccccdccdbabcddbdcccabccbbcdbcdbdaada"; // a b bb aa aba abba
        int actual = t.countPalindromicSubsequences(s);
        int expected = 117990582;
        assertEquals(expected,actual);
    }
}