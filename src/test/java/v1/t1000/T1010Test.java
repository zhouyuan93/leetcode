package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1010Test {
    T1010 t;

    @BeforeEach
    void setUp() {
        t = new T1010();
    }

    @Test
    void test_1() {
        int[] times = {60, 60, 60};
        int actual = t.numPairsDivisibleBy60(times);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] times = {30, 20, 150, 100, 40};
        int actual = t.numPairsDivisibleBy60(times);
        int expected = 3;
        assertEquals(expected, actual);
    }
}