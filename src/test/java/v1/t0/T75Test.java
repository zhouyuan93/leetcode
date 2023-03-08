package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T75Test {

    T75 t;

    @BeforeEach
    void setUp() {
        t = new T75();
    }

    @Test
    void test_1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        t.sortColors(nums);
        int[] expected = {0, 0, 1, 1, 2, 2};
        System.out.println(Arrays.toString(nums));

        assertArrayEquals(expected, nums);
    }
}