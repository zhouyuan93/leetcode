package v1.jz;

public class JZ42 {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;

        int i = 0;
        while (res < 0 && i < nums.length) {
            res = Math.max(nums[i++], res);
        }

        int t = res;
        for (; i < nums.length ; i++) {
            t += nums[i];
            if (nums[i] <= 0) {
                while (t < 0 && i+1 < nums.length) {
                    t = Math.max(nums[++i], t);
                }
            }else{
                res = Math.max(res, t);
            }
        }

        res = Math.max(res, t);

        return res;
    }
}
