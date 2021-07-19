package v1.t1800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1838Test {

    T1838 t;

    @BeforeEach
    void setUp() {
        t = new T1838();
    }

    @Test
    void test_1() {
        int[] nums = {1, 4, 8, 13};
        int k = 5;
        int a = t.maxFrequency(nums, k);
        int e = 2;
        assertEquals(e,a);
    }

    @Test
    void test_2() {
        int[] nums = {1,1,1,2,2,3,3,3,3,3,3,4};
        int k = 5;
        int a = t.maxFrequency(nums, k);
        int e = 9;
        assertEquals(e,a);
    }
}