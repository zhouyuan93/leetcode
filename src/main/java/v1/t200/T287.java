package v1.t200;

/**
 * @author Raytine
 */
public class T287 {
    public int findDuplicate(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }
        int pSlow = nums[0];
        int pFast = nums[0];

        pSlow = nums[pSlow];
        pFast = nums[nums[pFast]];

        while (pFast != pSlow) {
            pSlow = nums[pSlow];
            pFast = nums[nums[pFast]];
        }

        pSlow = nums[0];
        while (pFast != pSlow) {
            pSlow = nums[pSlow];
            pFast = nums[pFast];
        }

        return pSlow;
    }
}
