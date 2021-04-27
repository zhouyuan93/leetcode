package v1.t1400;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1484Test {
    T1484 t;

    @BeforeEach
    void setUp() {
        t = new T1484();
    }

    @Test
    void test_1() {
        int[] nums = {5, 5, 4};
        int k = 1;
        int actual = t.findLeastNumOfUniqueInts(nums, k);
        int expected = 1;
        assertEquals(expected,actual);
    }


    @Test
    void test_2() {
        int[] nums = {4,3,1,1,3,3,2};
        int k = 3;
        int actual = t.findLeastNumOfUniqueInts(nums, k);
        int expected = 2;
        assertEquals(expected,actual);
    }
}