package v1.t500;

import org.junit.jupiter.api.Test;
import v1.t500.T581;

import static org.junit.jupiter.api.Assertions.*;

class T581Test {
    T581 t = new T581();

    @Test
    public void test_1(){
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        int res = t.findUnsortedSubarray(nums);
        assertEquals(5,res);
    }

    @Test
    public void test_2(){
        int[] nums = {16,4, 8, 10, 9, 15};
        int res = t.findUnsortedSubarray(nums);
        assertEquals(6,res);
    }

    @Test
    public void test_3(){
        int[] nums = {1,2};
        int res = t.findUnsortedSubarray(nums);
        assertEquals(0,res);
    }

    @Test
    public void test_4(){
        int[] nums = {3,2};
        int res = t.findUnsortedSubarray(nums);
        assertEquals(2,res);
    }
}