package v1.t100;

/**
 * @author yuan.zhou
 */
public class T152 {
    public int maxProduct(int[] nums) {
        Integer maxNegative = null;

        Integer t = null;

        int res = nums[0];
        for (int i =0; i < nums.length; i++) {

            if (nums[i] == 0) {
                res = Math.max(res, 0);
                t = null;
                maxNegative = null;
                continue;
            }

            if (t == null) {
                t = nums[i];
                res = Math.max(res, t);
                maxNegative = t < 0 ? t : null;
                continue;
            }

            t = nums[i] * t;
            int p = t;
            if (p < 0) {
                if (maxNegative == null) {
                    maxNegative = p;
                }else{
                    p /= maxNegative;
                }
            }
            res = Math.max(res, p);
        }

        return res;
    }
}
