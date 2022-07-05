package v1.t1500;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class T1577 {
    public int numTriplets(int[] nums1, int[] nums2) {
        HashMap<Long, Integer> map1 = new HashMap<>();
        HashMap<Long, Integer> map2 = new HashMap<>();

        for (int x : nums1) {
            Long y = 1L * x * x;
            map1.put(y, map1.getOrDefault(y, 0) + 1);
        }

        for (int x : nums2) {
            long y = 1L * x * x;
            map2.put(y, map2.getOrDefault(y, 0) + 1);
        }

        int res = 0;
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                res += map2.getOrDefault(1L* nums1[i] * nums1[j], 0);
            }
        }

        for (int i = 0; i < nums2.length - 1; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                res += map1.getOrDefault(1L* nums2[i] * nums2[j], 0);
            }
        }

        return res;
    }
}
