package v1.t600;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T628Test {
    T628 t;

    @BeforeEach
    void setUp() {
        t = new T628();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 4};
        int actual = t.maximumProduct(nums);
        int expected = 24;
        assertEquals(expected,actual);
    }

    @Test
    void test_2() {
        int[] nums = {1, -2, 3, 4};
        int actual = t.maximumProduct(nums);
        int expected = 12;
        assertEquals(expected,actual);
    }

    @Test
    void test_3() {
        int[] nums = {1, -2, 3, -4};
        int actual = t.maximumProduct(nums);
        int expected = 24;
        assertEquals(expected,actual);
    }
}