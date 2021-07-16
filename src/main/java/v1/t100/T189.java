package v1.t100;

import java.util.Arrays;

public class T189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        if (k == 0) {
            return;
        }

        int[] temp = new int[k];
        for (int i = 0, j = nums.length - k; i < temp.length; i++,j++) {
            temp[i] = nums[j];
        }


        int j = nums.length - k - 1;
        for (int i = nums.length-1; j >= 0; j--,i--) {
            nums[i] = nums[j];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }

    }
}
