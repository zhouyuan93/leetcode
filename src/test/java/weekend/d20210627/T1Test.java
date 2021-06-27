package weekend.d20210627;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T1Test {

    T1 t = new T1();

    @Test
    void test_1() {
        int[] nums = {5, 6,2, 7, 4};
        int actual = t.maxProductDifference(nums);
        int e = 34;
        assertEquals(e,actual);
    }

    @Test
    void test_2() {
        int[] nums = {4,2,5,9,7,4,8};
        int actual = t.maxProductDifference(nums);
        int e = 64;
        assertEquals(e,actual);
    }


}