package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T1011Test {

    T1011 t;

    @BeforeEach
    void setUp() {
        t = new T1011();
    }

    @Test
    void test_1() {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int d = 5;
        int actual = t.shipWithinDays(weights, d);
        int expected = 15;
        assertEquals(expected, actual);
    }
}