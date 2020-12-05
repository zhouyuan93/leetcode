package v1.t1300;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class t1389Test {

    T1389 t;

    @BeforeEach
    void setUp() {
        t = new T1389();
    }

    @Test
    void test_1() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] actual = t.createTargetArray(nums, index);
        int[] expected = {0, 4, 1, 3, 2};
        assertArrayEquals(expected, actual);
    }
}