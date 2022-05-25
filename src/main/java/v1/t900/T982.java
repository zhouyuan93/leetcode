package v1.t900;

import java.util.HashMap;
import java.util.Map;

public class T982 {
    public int countTriplets(int[] nums) {
        int[] memo = new int[2 << 15];

        for (int i = 0; i < nums.length; i++) {
            memo[nums[i]]++;
            for (int j = i + 1; j < nums.length; j++) {
                memo[nums[i] & nums[j]] += 2;
            }
        }

        int res = 0;
        for (int i = 0; i < memo.length; i++) {
            if (memo[i] > 0) {
                for (int j = 0; j < nums.length; j++) {
                    if ((i & nums[j]) == 0) {
                        res += memo[i];
                    }
                }
            }
        }

        return res;
    }

}
