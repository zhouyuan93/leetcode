package v1.t1500;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1577Test {

    T1577 t ;

    @BeforeEach
    void setUp() {
        t = new T1577();
    }

    @Test
    void test_1() {
        int[] nums1 = {43024, 99908};
        int[] nums2 = {1864};
        int actual = t.numTriplets(nums1, nums2);
        int expected =0;
        assertEquals(expected,actual);
    }
}