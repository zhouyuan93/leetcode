package v1.t1200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1297Test {

    T1297 t;

    @BeforeEach
    void setUp() {
        t = new T1297();
    }

    @Test
    void test_1() {
        String s = "aababcaab";
        int maxLetters = 2;
        int minSize = 3;
        int maxSize = 4;
        int actual = t.maxFreq(s, maxLetters, minSize, maxSize);
        int expect = 2;
        assertEquals(expect,actual);
    }
    @Test
    void test_2() {
        String s = "aaaa";
        int maxLetters = 1;
        int minSize = 3;
        int maxSize = 3;
        int actual = t.maxFreq(s, maxLetters, minSize, maxSize);
        int expect = 2;
        assertEquals(expect,actual);
    }
    @Test
    void test_3() {
        String s = "aabcabcab";
        int maxLetters = 2;
        int minSize = 2;
        int maxSize = 3;
        int actual = t.maxFreq(s, maxLetters, minSize, maxSize);
        int expect = 3;
        assertEquals(expect,actual);
    }
    @Test
    void test_4() {
        String s = "abcde";
        int maxLetters = 2;
        int minSize = 3;
        int maxSize = 3;
        int actual = t.maxFreq(s, maxLetters, minSize, maxSize);
        int expect = 0;
        assertEquals(expect,actual);
    }
}