package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.T238;

import static org.junit.jupiter.api.Assertions.*;

class T238Test {
    T238 t;

    @BeforeEach
    void setUp() {
        t = new T238();
    }

    @Test
    void test_1() {
        int[] nums = {1, 2, 3, 4};
        int[] actual = t.productExceptSelf(nums);
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, actual);

    }
}