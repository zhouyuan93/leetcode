package v1;

/**
 * @author yuan.zhou
 */
public class T283 {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (p == i) {
                    p++;
                }else{
                    nums[p++] = nums[i];
                }
            }
        }
        for (int i = p; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
