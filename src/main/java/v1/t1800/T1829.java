package v1.t1800;

public class T1829 {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] res = new int[nums.length];

        if (maximumBit == 0) {
            return res;
        }
        int max = (1 << maximumBit) - 1;


        int p = 0;
        for (int i = res.length - 1, j = 0; i >= 0; i--, j++) {
            p ^= nums[j];
            res[i] = p ^ max;
        }

        return res;
    }
}
