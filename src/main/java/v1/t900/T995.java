package v1.t900;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T995 {
    public int minKBitFlips(int[] nums, int k) {

        int count = 0;

        int[] memo = new int[k];
        int l = 0;
        int r = 0;
        int len = 0;


        for (int i = 0; i < nums.length; i++) {
            while (len > 0 && memo[l] < i - k + 1) {
                l = getNext(l, k);
                len--;
            }
            if ((len & 1) > 0 ? nums[i] == 0 : nums[i] == 1) {
                continue;
            }
//            nums[i] = 1;
            if (i > nums.length - k) {
                return -1;
            }
            count++;
            memo[r] = i;
            r = getNext(r, k);
            len++;
        }

        return count;


    }

    public int getNext(int x, int k) {
        x++;
        if (x >= k) {
            x = 0;
        }
        return x;
    }

}
