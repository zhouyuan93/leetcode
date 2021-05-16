package weekend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D20210516 {
    // T5759
    List<Integer> res = new ArrayList<>();
    int sum = 0;

    public int subsetXORSum(int[] nums) {
        res.add(0);

        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }

        return sum;
    }

    public void add(int x) {
        int len = res.size();
        for (int i = 0; i < len; i++) {
            int t = res.get(i) ^ x;
            res.add(t);
            sum += t;
        }
    }

    // T5760
    public int minSwaps(String s) {
        int res1 = 0;
        int res0 = 0;

        int count0 = 0;
        int count1 = 0;

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            boolean isJi = i % 2 == 0;
            if (c == '0') {
                count0++;
                if (isJi) {
                    res1++;
                }
            } else {
                count1++;
                if (isJi) {
                    res0++;
                }
            }
        }

        if (count0 == count1) {
            return Math.min(res0, res1);
        }

        if (Math.abs(count0 - count1) > 1) {
            return -1;
        }

        return count0 > count1 ? res0 : res1;

    }

    // T5761
    public static class FindSumPairs {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int[] nums1;
        int[] nums2;

        public FindSumPairs(int[] nums1, int[] nums2) {
            for (int i = 0; i < nums1.length; i++) {
                map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
            }
            for (int i = 0; i < nums2.length; i++) {
                map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
            }
            this.nums1 = nums1;
            this.nums2 = nums2;
        }

        public void add(int index, int val) {
            map2.put(nums2[index], map2.get(nums2[index]) - 1);
            nums2[index] += val;
            map2.put(nums2[index], map2.getOrDefault(nums2[index], 0) + 1);
        }

        public int count(int tot) {
            int sum = 0;
            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                int x = entry.getKey();
                int xCount = entry.getValue();

                int y = tot - x;
                if (y <= 0) {
                    continue;
                }

                int yCount = map2.getOrDefault(y, 0);

                sum += xCount * yCount;

            }
            return sum;
        }
    }


    // T5762
    public static int MOD = 1_000_000_007;
    public static Long[][] dp;

    public int rearrangeSticks(int n, int k) {
        dp = new Long[k + 1][n + 1];
        for (int i = 0; i < k + 1; i++) {
            dp[i][i] = 1L;
        }


        return (int) getDp(n, k);

    }

    public long getDp(int n, int k) {
        if (n < 0 || k < 0) {
            return 0;
        }

        if (dp[k][n] != null) {
            return dp[k][n];
        }


        long res = getDp(n - 1, k) * (n - 1) % MOD;

        res += getDp(n - 1, k - 1) % MOD;
        res %= MOD;
        dp[k][n] = res;

        return res;
    }

}
