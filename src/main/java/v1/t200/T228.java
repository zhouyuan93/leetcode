package v1.t200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return res;
        }

        Arrays.toString(nums);
        int left = 0;
        int target = nums[0] + 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != target) {
                if (left == i - 1) {
                    res.add(String.valueOf(nums[left]));
                }else{
                    res.add(nums[left] + "->" + nums[i - 1]);
                }
                left = i;
                target = nums[i];
            }
            target++;
        }
        if (left == nums.length - 1) {
            res.add(String.valueOf(nums[left]));
        }else{
            res.add(nums[left] + "->" + nums[nums.length - 1]);
        }


        return res;
    }
}
