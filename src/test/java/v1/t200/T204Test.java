package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t200.T204;

import static org.junit.jupiter.api.Assertions.*;

class T204Test {
    T204 t;

    @BeforeEach
    void setUp() {
        t = new T204();
    }

    @Test
    void test_3() {
        int actual = t.countPrimes(2);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    void test_2() {
        int actual = t.countPrimes(10);
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    void test_1() {
        int actual = t.countPrimes(1);
        int expected = 0;
        assertEquals(expected, actual);
    }
}