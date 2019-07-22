package v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T307Test {

    @Test
    public void test_case_1(){
        int[] nums = new int[]{1,3,5};
        T307.NumArray n = new T307.NumArray(nums);
        int res;
        res = n.sumRange(0, 2);
        assertEquals(9, res);

        n.update(1, 2);
        res = n.sumRange(0,2);
        assertEquals(8,res);
    }


    @Test
    public void test_case_2(){
        int[] nums = new int[]{1};
        T307.NumArray n = new T307.NumArray(nums);
        int res;
        res = n.sumRange(0, 0);
        assertEquals(res, 1);

        n.update(0, 2);
        res = n.sumRange(0,0);
        assertEquals(2,res);
    }
}