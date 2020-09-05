package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T60Test {

    T60 t;

    @BeforeEach
    void setUp() {
        t = new T60();
    }

    @Test
    void test_1() {
        int n = 3;
        int k = 3;
        String actual = t.getPermutation(n, k);
        String expect = "213";
        assertEquals(expect, actual);
    }

    @Test
    void test_2() {
        int n = 3;
        int k = 4;
        String actual = t.getPermutation(n, k);
        String expect = "231";
        assertEquals(expect, actual);
    }

    @Test
    void test_3() {
        int n = 4;
        int k = 9;
        String actual = t.getPermutation(n, k);
        String expect = "2314";
        assertEquals(expect, actual);
    }

    @Test
    void test_4() {
        int n = 4;
        int k = 8;
        String actual = t.getPermutation(n, k);
        String expect = "2143";
        assertEquals(expect, actual);
    }
}