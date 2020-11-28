package v1.t400;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T493 {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length < 1) {
            return 0;
        }

        List<Long> list = new ArrayList<>(nums.length);
        list.add((long) nums[0]);

        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            long target = nums[i];
            long doubleTarget = target * 2L;

            if (doubleTarget < list.get(0)) {
                res += i;
            }else if (doubleTarget < list.get(list.size() - 1)) {
                int index = findIndex(list, doubleTarget);
                res += i - index;
            }


            if (target >= list.get(list.size() - 1)) {
                list.add(target);
            } else if (target <= list.get(0)) {
                list.add(0, target);
            } else {
                int addIndex = findIndex(list, target);
                list.add(addIndex, target);
            }
        }

        return res;

    }

    public int findIndex(List<Long> list, long target) {
        int left = 0;
        int right = list.size() - 1;
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (list.get(mid) <= target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
