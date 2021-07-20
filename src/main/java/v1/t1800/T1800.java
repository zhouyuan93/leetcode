package v1.t1800;

public class T1800 {

    public int maxAscendingSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int res = nums[0];
        int sum = 0;
        int before = 0;
        for (int n : nums) {
            if (n > before) {
                sum += n;
            }else{
                res = Math.max(sum, res);
                sum = n;
            }
            before = n;
        }

        res = Math.max(sum, res);

        return res;
    }
}
