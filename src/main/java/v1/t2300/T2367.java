package v1.t2300;

public class T2367 {

    public int arithmeticTriplets(int[] nums, int diff) {
        Integer[] memo = new Integer[diff];
        int[] count = new int[diff];

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int idx = x % diff;

            if (memo[idx] != null && memo[idx] + diff == x) {
                count[idx]++;
            }else{
                count[idx] = 1;
            }

            memo[idx] = x;

            if (count[idx] >= 3) {
                res++;
            }
        }

        return res;

    }
}
