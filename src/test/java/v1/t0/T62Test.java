package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T62Test {

    T62 t;

    @BeforeEach
    void setUp() {
        t = new T62();
    }

    @Test
    void test_1() {
        int m = 7;
        int n = 3;
        int actual = t.uniquePaths(m,n);
        int expected = 28;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int m = 2;
        int n = 3;
        int actual = t.uniquePaths(m,n);
        int expected = 3;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int m = 7;
        int n = 1;
        int actual = t.uniquePaths(m,n);
        int expected = 1;
        assertEquals(expected,actual);
    }
}