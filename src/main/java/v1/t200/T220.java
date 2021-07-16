package v1.t200;

import java.util.TreeSet;

public class T220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> tree = new TreeSet<>();

        for (int i = 0; i < k; i++) {
            if (check(nums, t, tree, i)) {
                return true;
            }
            tree.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (check(nums, t, tree, i)) {
                return true;
            }
            tree.add(nums[i]);
            tree.remove(nums[i - k]);
        }

        return false;
    }

    private boolean check(int[] nums, long t, TreeSet<Integer> tree, int i) {
        Integer x = tree.ceiling(nums[i]);
        if (x != null && -t + x - nums[i] <= 0) {
            return true;
        }
        x = tree.floor(nums[i]);
        if (x != null && -t + nums[i] - x <= 0) {
            return true;
        }
        return false;
    }
}
