package v1.t900;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T995 {
    public int minKBitFlips(int[] nums, int k) {

        int count = 0;

        int[] memo = new int[nums.length + 1];
        int l = 0;
        int r = 0;

        for (int i = 0; i < nums.length; i++) {
            while (r - l > 0 && memo[l] < i - k + 1) {
                l++;
            }
            if (((r ^ l) & 1) != nums[i]) {
                continue;
            }
//            nums[i] = 1;
            if (i > nums.length - k) {
                return -1;
            }
            count++;
            memo[r] = i;
            r++;
        }

        return count;

    }


}
