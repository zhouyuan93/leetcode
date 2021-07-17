package v1.t1800;

import java.util.*;

public class T1862 {
    public int sumOfFlooredPairs(int[] nums) {
        int p = 1_000_000_007;

        long res = 0;

        // 最大值
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
        }

        // 数组计数
        int[] t = new int[max + 1];
        for (int n : nums) {
            t[n]++;
        }

        // 前缀和
        for (int i = 1; i < t.length; i++) {
            t[i] += t[i - 1];
        }

        for (int i = 1; i < t.length; i++) {
            int x = t[i] - t[i - 1];
            if (x == 0) {
                continue;
            }
            for (int j = i; j < t.length; j+=i) {
                long y = t[Math.min(j + i - 1, max)] - t[j - 1];
                res = (res + (j / i) * y * x) % p;
            }
        }

        return (int) res;


    }
}
