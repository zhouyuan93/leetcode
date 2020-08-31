package v1.t700;

/**
 * @author yuan.zhou
 */
public class T747 {

    public int dominantIndex(int[] nums) {
        if (nums.length < 2) {
            return 1;
        }
        int max = 0;
        int p = 1;
        if (nums[max] < nums[p]) {
            max = 1;
            p = 0;
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[p]) {
                if (nums[i] > nums[max]) {
                    p = max;
                    max = i;
                }else{
                    p = i;
                }
            }
        }

        return nums[max] >= nums[p]*2 ? max : -1;

    }
}
