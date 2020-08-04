package v1.t0;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.t0.T80;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class T80Test {

    T80 t;

    @BeforeEach
    void setUp() {
        this.t = new T80();
    }

    @Test
    void test_1() {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int actual = t.removeDuplicates(nums);

        int[] actualNums = Arrays.copyOf(nums, actual);
        int[] expectNums = {1, 1, 2, 2, 3};

        assertArrayEquals(expectNums, actualNums);
    }

    @Test
    void test_2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        int actual = t.removeDuplicates(nums);

        int[] actualNums = Arrays.copyOf(nums, actual);
        int[] expectNums = {0, 0, 1, 1, 2, 3, 3};

        assertArrayEquals(expectNums, actualNums);

    }

    @Test
    void test_3() {
        int[] nums = {1, 1};

        int actual = t.removeDuplicates(nums);

        int[] actualNums = Arrays.copyOf(nums, actual);
        int[] expectNums = {1, 1};

        assertArrayEquals(expectNums, actualNums);

    }
}