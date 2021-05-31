package v1.t500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T567Test {
    T567 t;

    @BeforeEach
    void setUp() {
        t = new T567();
    }


    @Test
    void test_1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean actual = t.checkInclusion(s1, s2);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    void test_2() {
        String s1 = "ba";
        String s2 = "eidbaooo";
        boolean actual = t.checkInclusion(s1, s2);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String s1 = "bca";
        String s2 = "eidbaooo";
        boolean actual = t.checkInclusion(s1, s2);
        boolean expected = false;
        assertEquals(expected, actual);
    }


    @Test
    void test_4() {
        String s1 = "bca";
        String s2 = "abc";
        boolean actual = t.checkInclusion(s1, s2);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}