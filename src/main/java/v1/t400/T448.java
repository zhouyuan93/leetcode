package v1.t400;

import java.util.ArrayList;
import java.util.List;

public class T448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            int t = Math.abs(num);
            if (nums[t - 1] > 0) {
                nums[t - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
