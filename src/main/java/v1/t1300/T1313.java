package v1.t1300;

import java.util.ArrayList;
import java.util.List;

public class T1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <nums.length; i+=2) {
            int x = nums[i];
            int y = nums[i + 1];
            while (x > 0) {
                list.add(y);
                x--;
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
