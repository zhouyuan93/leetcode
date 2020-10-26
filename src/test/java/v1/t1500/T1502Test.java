package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1502Test {
    T1502 t;

    @BeforeEach
    void setUp() {
        t = new T1502();
    }

    @Test
    void test_1() {
        int[] arr = {3, 5, 1};
        boolean expected = true;
        boolean actual = t.canMakeArithmeticProgression(arr);
        assertEquals(expected, actual);
    }

    @Test
    void test_2() {
        int[] arr = {1,2,4};
        boolean expected = false;
        boolean actual = t.canMakeArithmeticProgression(arr);
        assertEquals(expected, actual);
    }
}