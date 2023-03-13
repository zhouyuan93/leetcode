package v1.t2300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2383Test {

    T2383 t;

    @BeforeEach
    void setUp() {
        t = new T2383();
    }

    @Test
    void test_1() {
        int en = 5;
        int ex = 3;
        int[] energy = {1, 4, 3, 2};
        int[] experience = {2, 6, 3, 1};
        int actual = t.minNumberOfHours(en, ex, energy, experience);
        int expected = 8;
        assertEquals(expected, actual);
    }
}