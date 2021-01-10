package v1.t1600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1619Test {

    T1619 t;

    @BeforeEach
    void setUp() {
        t = new T1619();
    }

    @Test
    void test_1() {
        int[] arr = {6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0};
        double actual = t.trimMean(arr);
        double expected = 4.0;
        assertTrue(Math.abs(expected - actual) < 0.00001);
    }
}