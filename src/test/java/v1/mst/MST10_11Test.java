package v1.mst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MST10_11Test {

    MST10_11 t;

    @BeforeEach
    void setUp() {
        t = new MST10_11();
    }

    @Test
    void test_1() {
        int[] nums = {5, 3, 1, 2, 3};
        t.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        int[] expected = {3, 1, 3, 2, 5};
        assertArrayEquals(expected, nums);
    }
}