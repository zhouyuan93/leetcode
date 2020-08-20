package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T674Test {

    T674 t;

    @BeforeEach
    void setUp() {
        t = new T674();
    }

    @Test
    void test_1() {
        String s = "abacaba";
        int actual = t.countSubstrings(s);
        int expect = 12;
        assertEquals(expect,actual);
    }
}