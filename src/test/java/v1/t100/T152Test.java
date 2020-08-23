package v1.t100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T152Test {

    T152 t;

    @BeforeEach
    void setUp() {
        t = new T152();
    }

    @Test
    void test_1() {
        int[] nums = {2,3,-2,4};
        int actual = t.maxProduct(nums);
        int expect = 6;
        assertEquals(expect,actual);
    }
    @Test
    void test_2() {
        int[] nums = {-2,0,-1};
        int actual = t.maxProduct(nums);
        int expect = 0;
        assertEquals(expect,actual);
    }
    @Test
    void test_3() {
        int[] nums = {1,1,1,1,0,-1,-1,-1,2,-2,1};
        int actual = t.maxProduct(nums);
        int expect = 4;
        assertEquals(expect,actual);
    }
}