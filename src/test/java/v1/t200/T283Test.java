package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t200.T283;

import static org.junit.jupiter.api.Assertions.*;

class T283Test {
    T283 t;

    @BeforeEach
    void setUp() {
        t = new T283();
    }

    @Test
    void test_1() {
        int[] nums = {0,1,0,3,12};
        t.moveZeroes(nums);
        int[] expected = {1,3,12,0,0};
        assertArrayEquals(expected, nums);
    }
}