package v1.t400;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new LinkedList<>();
        for (int x : nums) {
            int i = Math.abs(x) - 1;
            if (nums[i] < 0) {
                res.add(i+1);
            }else{
                nums[i] = -nums[i];
            }
        }
        return res;
    }
}
