package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T696Test {

    T696 t;

    @BeforeEach
    void setUp() {
        t = new T696();
    }

    @Test
    void test_1() {
        String s = "00110011";
        int actual = t.countBinarySubstrings(s);
        int expect = 6;
        assertEquals(expect,actual);
    }

    @Test
    void test_2() {
        String s = "10101";
        int actual = t.countBinarySubstrings(s);
        int expect = 4;
        assertEquals(expect,actual);
    }
}