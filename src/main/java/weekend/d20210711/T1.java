package weekend.d20210711;

import java.util.Arrays;

public class T1 {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int i = 0;
        int j = nums.length;
        for (; i < nums.length; i++, j++) {
            res[i] = nums[i];
            res[j] = nums[i];
        }
        return res;
    }
}
