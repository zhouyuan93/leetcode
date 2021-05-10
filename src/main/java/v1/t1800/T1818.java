package v1.t1800;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class T1818 {
    public static int MOD = 1_000_000_007;

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            treeSet.add(nums1[i]);
            nums1[i] = Math.abs(nums1[i] - nums2[i]);
            res += nums1[i];
            res %= MOD;
        }

        if (res == 0) {
            return 0;
        }
        
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            int x = nums2[i];
            int dif = nums1[i];
            Integer y1 = treeSet.floor(x);
            Integer y2 = treeSet.ceiling(x);
            if (y1 != null) {
                int t = Math.abs(x - y1);
                if (t < dif) {
                    max = Math.max(max, dif -t);
                }
            }
            if (y2 != null) {
                int t = Math.abs(x - y2);
                if (t < dif) {
                    max = Math.max(max, dif -t);
                }
            }
        }
        res -= max;
        if (res < 0) {
            res += MOD;
        }
        return res;

    }
}
