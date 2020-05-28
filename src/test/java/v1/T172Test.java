package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T172;

import static org.junit.jupiter.api.Assertions.*;

class T172Test {
    T172 t;

    @BeforeEach
    void setUp() {
        t = new T172();
    }

    @Test
    void test_3() {
        int n = 4;
        int actual = t.trailingZeroes(n);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void test_2() {
        int n = 26;
        int actual = t.trailingZeroes(n);
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    void test_1() {
        int n = 10;
        int actual = t.trailingZeroes(n);
        int expected = 2;
        assertEquals(expected, actual);
    }
}