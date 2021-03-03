package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T495Test {

    T495 t;

    @BeforeEach
    void setUp() {
        t = new T495();
    }

    @Test
    void test_1() {
        int[] timeSeries = {1, 4};
        int duration = 2;
        int actual = t.findPoisonedDuration(timeSeries, duration);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] timeSeries = {1,2};
        int duration = 2;
        int actual = t.findPoisonedDuration(timeSeries, duration);
        int expected = 3;
        assertEquals(expected, actual);
    }
}