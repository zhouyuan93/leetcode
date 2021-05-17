package v1.t1000;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class T1089Test {

    T1089 t;

    @BeforeEach
    void setUp() {
        t = new T1089();
    }

    @Test
    void test_1() {
        int[] nums = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        t.duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 4};
        assertArrayEquals(expected, nums);
    }


    @Test
    void test_2() {
        int[] nums = new int[]{1, 0, 2, 3, 0, 0, 5, 0};
        t.duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
        int[] expected = {1, 0, 0, 2, 3, 0, 0, 0};
        assertArrayEquals(expected, nums);
    }
}