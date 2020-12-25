package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T455Test {

    T455 t;

    @BeforeEach
    void setUp() {
        t = new T455();
    }

    @Test
    void test_1() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        int actual = t.findContentChildren(g, s);
        int expected = 1;
        assertEquals(expected,actual);
    }
}