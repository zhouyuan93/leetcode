package v1.t1400;

public class T1437 {

    public boolean kLengthApart(int[] nums, int k) {
        if (k == 0) {
            return true;
        }
        int i = 0;

        for (; i < nums.length; i++) {
            if (nums[i] == 1) {
                i++;
                break;
            }
        }


        int p = k;
        for (; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (p > 0) {
                    return false;
                }else{
                    p = k;
                }
            }else{
                p--;
            }
        }

        return true;

    }

}
