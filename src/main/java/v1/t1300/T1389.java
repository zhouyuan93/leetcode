package v1.t1300;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        if (nums == null || nums.length < 1) {
            return new int[]{};
        }
        List<Integer> list = new ArrayList<>(nums.length);

        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] res = new int[nums.length];
        int i = 0;
        for (Integer x : list) {
            res[i++] = x;
        }
        return res;
    }
}
