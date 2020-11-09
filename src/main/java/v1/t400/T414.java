package v1.t400;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T414 {
    public int thirdMax(int[] nums) {
        if (nums.length < 3) {
            Arrays.sort(nums);
            return nums[nums.length - 1];
        }
        int[] temp = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        int count = 0;
        int i = 0;
        for (; i < nums.length && count < 3; i++) {
            int x = count-1;
            boolean flag = false;
            while (x >= 0) {
                if (temp[x--] == nums[i]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            temp[count++] = nums[i];
        }
        Arrays.sort(temp);
        for (; i < nums.length; i++) {
            if (nums[i] > temp[0] && nums[i] != temp[1] && nums[i] != temp[2]) {
                temp[0] = nums[i];
                Arrays.sort(temp);
            }
        }

        return count >= 3 ? temp[0] : temp[2];
    }
}
