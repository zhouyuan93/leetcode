package v1.t2300;

public class T2341 {
    public int[] numberOfPairs(int[] nums) {
        int res = 0;
        int[] memo = new int[101];

        for (int i = 0; i < nums.length; i++) {
            if (memo[nums[i]] == 1) {
                res++;
            }
            memo[nums[i]] ^= 1;
        }

        return new int[]{res, nums.length - res * 2};
    }
}
