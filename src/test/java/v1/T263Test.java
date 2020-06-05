package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T263;

import static org.junit.jupiter.api.Assertions.*;

class T263Test {
    T263 t;

    @BeforeEach
    void setUp() {
        t = new T263();
    }

    @Test
    void test_1() {
        int num = 6;
        boolean actual = t.isUgly(num);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void test_2() {
        int num = 1;
        boolean actual = t.isUgly(num);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void test_3() {
        int num = 14;
        boolean actual = t.isUgly(num);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}