package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1402Test {

    T1402 t;

    @BeforeEach
    void setUp() {
        t = new T1402();
    }

    @Test
    void test_1() {
        int[] satisfaction = {-1, -8, 0, 5, -9};
        int actual = t.maxSatisfaction(satisfaction);
        int expected = 14;
        assertEquals(expected, actual);
    }
}