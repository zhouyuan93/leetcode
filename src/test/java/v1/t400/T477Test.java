package v1.t400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T477Test {
    
    T477 t;

    @BeforeEach
    void setUp() {
        t = new T477();
    }

    @Test
    void test_1() {
        int[] nums = {4, 14, 2};
        int actual = t.totalHammingDistance(nums);
        int expected = 6;
        assertEquals(expected, actual);
    }
}