package v1;

/**
 * @author yuan.zhou
 */
public class T238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = sum;
            sum *= nums[i];
        }

        sum = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            res[i] *= sum;
            sum *= nums[i];
        }

        return res;

    }
}
