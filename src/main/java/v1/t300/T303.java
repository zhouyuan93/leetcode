package v1.t300;

/**
 * @author yuan.zhou
 */
public class T303 {
    public static class NumArray{
        int[] sumNums;

        public NumArray(int[] nums) {
           int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                nums[i] = sum;
            }

            sumNums = nums;
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return sumNums[j];
            }
            return sumNums[j] - sumNums[i - 1];
        }
    }
}
