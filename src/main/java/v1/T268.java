package v1;

/**
 * @author yuan.zhou
 */
public class T268 {
    public int missingNumber(int[] nums) {
        int res = ((nums.length + 1) * nums.length) >> 1;
        for (int num : nums) {
            res -= num;
        }
        return res;
    }
}
