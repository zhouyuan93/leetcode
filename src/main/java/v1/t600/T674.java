package v1.t600;

/**
 * @author yuan.zhou
 */
public class T674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int res = 1;

        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            }else{
                res = Math.max(res, count);
                count = 1;
            }
        }
        res = Math.max(res, count);

        return res;
    }
}
