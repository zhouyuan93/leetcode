package v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class T122Test {
    private T122 t;

    @BeforeEach
    void setUp() {
        t = new T122();
    }

    @Test
    void test_4() {
        int[] nums = new int[]{3,2,6,5,0,3};
        int actual = t.maxProfit(nums);
        int expect = 7;
        assertEquals(expect,actual);
    }
    @Test
    void test_2() {
        int[] nums = new int[]{1,2,3,4,5};
        int actual = t.maxProfit(nums);
        int expect = 4;
        assertEquals(expect,actual);
    }
    @Test
    void test_1() {
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};

        int actual = t.maxProfit(nums);
        int expect = 7;

        assertEquals(expect,actual);
    }
}