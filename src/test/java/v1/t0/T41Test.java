package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T41Test {
    T41 t;

    @BeforeEach
    void setUp() {
        t = new T41();
    }

    @Test
    void test_1() {
        int[] arr = {7, 8, 9, 11, 12};
        int actual = t.firstMissingPositive(arr);
        int expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    void test_2() {
        int[] arr = {1};
        int actual = t.firstMissingPositive(arr);
        int expected = 1;
        assertEquals(expected,actual);
    }
}