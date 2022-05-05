package v1.t700;

public class T713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int p = 0;
        int res = 0;
        if(nums[p] < k){
            res++;
        }

        long y = nums[p];
        for (int i = p+1; i < nums.length; i++) {
            int x = nums[i];
            if (x >= k) {
                y = x;
                p = i;
                continue;
            }

            y *= x;
            while (y >= k) {
                y /= nums[p++];
            }

            res += i - p + 1;
        }

        return res;
    }
}
