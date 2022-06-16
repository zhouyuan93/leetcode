package v1.t500;

import java.util.Arrays;
import java.util.HashSet;

public class T532 {
    public int findPairs1(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (!set.contains(a)) {
                int b = a - k;
                int c = a + k;
                if (set.contains(b)) {
                    res.add(b);
                }
                if (set.contains(c)) {
                    res.add(a);
                }
                set.add(a);
            } else if (k == 0 && !res.contains(a)) {
                res.add(a);
            }
        }
        System.out.println(res.toString());

        return res.size();
    }

    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        if (k == 0) {
            return getKZero(nums);
        }

        //去重
        int p = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[p]) {
                p++;
                nums[p] = nums[i];
            }
        }
        p++;
        int x = getLessThan(nums, k + 1, p);
        int y = getLessThan(nums, k, p);
        return x - y;
    }

    private int getKZero(int[] nums) {
        boolean hasSame = false;
        int p = 0;
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[p] == nums[i]) {
                if (!hasSame) {
                    ans++;
                    hasSame = true;
                }
            } else {
                p = i;
                hasSame = false;
            }
        }
        return ans;
    }

    int getLessThan(int[] nums, int k, int p) {
        int ans = 0;
        int n = p;
        for (int i = 0, j = 1; i < p; i++) {
            while (j < n && nums[j] - nums[i] < k) {
                j++;
            }
            if (j > i) {
                ans += j - i - 1;
            }
        }
        return ans;
    }

}
