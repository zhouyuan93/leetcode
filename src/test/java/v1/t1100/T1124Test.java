package v1.t1100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1124Test {

    T1124 t;

    @BeforeEach
    void setUp() {
        t = new T1124();
    }

    @Test
    void test_1() {
        int[] hours = {9, 9, 6, 0, 6, 6, 9};
        int actual = t.longestWPI(hours);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] hours = {6, 6, 6};
        int actual = t.longestWPI(hours);
        int expected = 0;
        assertEquals(expected, actual);
    }
}