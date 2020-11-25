package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1370Test {
    T1370 t;

    @BeforeEach
    void setUp() {
        t = new T1370();
    }

    @Test
    void test_1() {
        String s = "aaaabbbbcccc";
        String actual = t.sortString(s);
        String expected = "abccbaabccba";
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        String s = "aa";
        String actual = t.sortString(s);
        String expected = "aa";
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        String s = "";
        String actual = t.sortString(s);
        String expected = "";
        assertEquals(expected,actual);
    }
}