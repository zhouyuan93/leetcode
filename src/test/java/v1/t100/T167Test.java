package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t100.T167;

import static org.junit.jupiter.api.Assertions.*;

class T167Test {
    T167 t;

    @BeforeEach
    void setUp() {
        t = new T167();
    }

    @Test
    void test_1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] actual = t.twoSum(numbers, target);
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, actual);
    }
}