package v1.t700;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T738Test {

    T738 t;

    @BeforeEach
    void setUp() {
        t = new T738();
    }

    @Test
    void test_1() {
        int N = 10;
        int actual = t.monotoneIncreasingDigits(N);
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int N = 1234;
        int actual = t.monotoneIncreasingDigits(N);
        int expected = 1234;
        assertEquals(expected,actual);
    }


    @Test
    void test_3() {
        int N = 332;
        int actual = t.monotoneIncreasingDigits(N);
        int expected = 299;
        assertEquals(expected,actual);
    }

    @Test
    void test_4() {
        int N = 1276;
        int actual = t.monotoneIncreasingDigits(N);
        int expected = 1269;
        assertEquals(expected,actual);
    }

    @Test
    void test_5() {
        int N = 123332;
        int actual = t.monotoneIncreasingDigits(N);
        int expected = 122999;
        assertEquals(expected,actual);
    }
}