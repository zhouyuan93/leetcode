package v1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yuan.zhou
 */
public class T349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ns1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int i : nums1) {
            ns1.add(i);
        }

        for (int i : nums2) {
            if (ns1.contains(i)) {
                res.add(i);
            }
        }

        int[] r = new int[res.size()];

        int i = 0;
        for (Integer j : res) {
            r[i++] = j;
        }

        return r;

    }
}
