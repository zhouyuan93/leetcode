package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T97Test {

    T97 t;

    @BeforeEach
    void setUp() {
        t = new T97();
    }

    @Test
    void test_1() {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        boolean actual = t.isInterleave(s1, s2, s3);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        boolean actual = t.isInterleave(s1, s2, s3);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s1 = "aaa";
        String s2 = "bbbbb";
        String s3 = "abababbb";
        boolean actual = t.isInterleave(s1, s2, s3);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}