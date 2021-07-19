package v1.t1800;

public class T1838 {
    public int maxFrequency(int[] nums, int k) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] memo = new int[max + 1];

        for (int n : nums) {
            memo[n]++;
        }

        int res = 0;
        for (int i = 1; i < memo.length; i++) {
            if (memo[i] == 0) {
                continue;
            }
            int t = 0;
            int p = k;
            for (int j = i - 1, x = 1; j >= 0 && p > 0; j--, x++) {
                if (p >= memo[j] * x) {
                    p -= memo[j] * x;
                    t += memo[j];
                } else {
                    t += p / x;
                    p = 0;
                }
            }
            res = Math.max(res, t + memo[i]);
        }

        return res;
    }
}
