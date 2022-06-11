package weekend.d20220605;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T2Test {

    T2 t = new T2();

    @Test
    void test() {
        int[] nums = {6,7,3,8,2,1};
        int k = 2;
        assertEquals(2,t.partitionArray(nums, k));
    }
}