package v1.t900;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T920Test {
    T920 t;

    @BeforeEach
    void setUp() {
        t = new T920();
    }

    @Test
    void test_1() {
        String[] digits = {"1","3","5","7"};
        int n = 100;
        int actual = t.atMostNGivenDigitSet(digits, n);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        String[] digits = {"1","4","9"};
        int n = 1000000000;
        int actual = t.atMostNGivenDigitSet(digits, n);
        int expected = 29523;
        assertEquals(expected, actual);
    }

    @Test
    void test_3() {
        String[] digits = {"7"};
        int n = 8;
        int actual = t.atMostNGivenDigitSet(digits, n);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void test_4() {
        String[] digits = {};
        int n = 100;
        int actual = t.atMostNGivenDigitSet(digits, n);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void test_5() {
        String[] digits = {"3","4","8"};
        int n = 4;
        int actual = t.atMostNGivenDigitSet(digits, n);
        int expected = 2;
        assertEquals(expected, actual);
    }
}