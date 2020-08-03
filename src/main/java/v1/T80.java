package v1;

/**
 * @author yuan.zhou
 */
public class T80 {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int res = 1;
        Integer p1 = nums[0];
        Integer p2 = null;
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (p2 == null) {
                if (p1 == nums[i]) {
                    p2 = nums[i];
                    res++;
                }else{
                    p1 = nums[i];
                    res++;
                }
                nums[j++] = nums[i];
            }else{
                if (p1 != nums[i]) {
                    p1 = nums[i];
                    p2 = null;
                    res ++;
                    nums[j++] = nums[i];
                }
            }
        }

        return res;

    }
}
