package v1.t900;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T995 {
    public int minKBitFlips(int[] nums, int k) {

        int count = 0;

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            while (list.size() > 0 && list.get(0) < i - k + 1) {
                list.remove(0);
            }

            if ((list.size() & 1) > 0 ? nums[i] == 0 : nums[i] == 1) {
                continue;
            }
//            nums[i] = 1;
            if (i > nums.length - k) {
                return -1;
            }
            count++;
            list.add(i);
        }

        return count;


    }
}
