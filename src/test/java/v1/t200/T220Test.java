package v1.t200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T220Test {

    T220 t;

    @BeforeEach
    void setUp() {
        t = new T220();
    }

    @Test
    void test_1() {
        int[] nums = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        int z = 1;
        int k = 1;
        boolean a = t.containsNearbyAlmostDuplicate(nums, k, z);
        assertEquals(a,false);
    }
}