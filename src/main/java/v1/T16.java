package v1;

import java.util.Arrays;

public class T16 {
    public static void main(String[] args) {
        T16 t = new T16();
        System.out.println(t.threeSumClosest(new int[]{1,1,-1,-1,3}, -1));
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length < 3) {
            return 0;
        }
        int res = nums[0] + nums[1] + nums[2]-target;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int j = i+1;
            int k = nums.length -1;
            while (j < k) {
                int tempRes = nums[j] + nums[k] + nums[i] - target;
                res = Math.abs(res) > Math.abs(tempRes) ? tempRes : res;
                if(tempRes == 0) {
                    return target;
                }else if (tempRes > 0) {
                    k--;
                }else{
                    j++;
                }
            }
        }
        return res+target;
    }


}
