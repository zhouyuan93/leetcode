package v1.t100;

import org.junit.jupiter.api.Test;
import v1.t100.T153;

import static org.junit.jupiter.api.Assertions.*;

class T153Test {
    T153 t = new T153();

    @Test
    void findMin() {
        int[] nums;
        int res;

        nums = new int[]{3,4,5,1,2};
        res = t.findMin(nums);
        assertEquals(res, 1);

        nums = new int[]{4,5,6,7,0,1,2};
        res = t.findMin(nums);
        assertEquals(res, 0);

        nums = new int[]{1,2};
        res = t.findMin(nums);
        assertEquals(res, 1);

        nums = new int[]{2,1};
        res = t.findMin(nums);
        assertEquals(res, 1);
    }
}