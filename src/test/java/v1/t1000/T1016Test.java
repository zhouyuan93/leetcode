package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1016Test {
    T1016 t;

    @BeforeEach
    void setUp() {
        t = new T1016();
    }

    @Test
    void test_1() {
        String s = "0110";
        int n = 3;
        boolean actual = t.queryString(s, n);
        boolean expect = true;
        assertEquals(expect, actual);
    }
    @Test
    void test_2() {
        String s = "0110";
        int n = 4;
        boolean actual = t.queryString(s, n);
        boolean expect = false;
        assertEquals(expect, actual);
    }
    @Test
    void test_3() {
        String s = "1";
        int n = 1;
        boolean actual = t.queryString(s, n);
        boolean expect = true;
        assertEquals(expect, actual);
    }
}