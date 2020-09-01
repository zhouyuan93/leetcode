package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t1400.T1415;

import static org.junit.jupiter.api.Assertions.*;

class T1415Test {

    T1415 t;

    @BeforeEach
    void setUp() {
        t = new T1415();
    }

    @Test
    void test_1() {
        int n = 1;
        int k = 3;
        String actual = t.getHappyString(n, k);
        String expect = "c";
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int n = 1;
        int k = 4;
        String actual = t.getHappyString(n, k);
        String expect = "";
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int n = 3;
        int k = 9;
        String actual = t.getHappyString(n, k);
        String expect = "cab";
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        int n = 10;
        int k = 100;
        String actual = t.getHappyString(n, k);
        String expect = "abacbabacb";
        assertEquals(expect, actual);
    }
}