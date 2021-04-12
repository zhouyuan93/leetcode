package v1.t100;

import java.util.Arrays;

/**
 * @author yuan.zhou
 */
public class T179 {
    public String largestNumber(int[] nums) {
        sorted(nums, 0, nums.length - 1);
        StringBuilder res = new StringBuilder();
        for (int num : nums) {
            if (res.length() == 0 && num == 0) {
                continue;
            }
            res.append(num);
        }
        if(res.length() == 0){
            return "0";
        }
        return res.toString();
    }

    public void sorted(int[] nums, int begin, int end) {
        if (begin >= end) {
            return;
        }

        int left = begin + 1;
        int right = end;

        int x = nums[begin];

        while (left < right) {
            int y = nums[left];
            if (compare(x, y) < 0) {
                nums[left - 1] = nums[left];
                left++;
            } else {
                nums[left] ^= nums[right];
                nums[right] ^= nums[left];
                nums[left] ^= nums[right];
                right--;
            }
        }

        nums[left -1] = x;
        if (compare(x, nums[left]) < 1) {
            nums[left - 1] ^= nums[left];
            nums[left] ^= nums[left - 1];
            nums[left - 1] ^= nums[left];
            left++;
        }

        sorted(nums, begin, left - 2);
        sorted(nums, left, end);

    }

    public int compare(int x, int y) {
        String sx = String.valueOf(x);
        String sy = String.valueOf(y);
        if (sx.charAt(0) != sy.charAt(0)) {
            return sx.charAt(0) - sy.charAt(0);
        }
        return (sx + sy).compareTo(sy + sx);
    }
}
