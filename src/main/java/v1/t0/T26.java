package v1.t0;

import java.util.Arrays;

public class T26 {
    public int removeDuplicates(int[] nums) {
        int res = 1;

        for(int i = 1; i < nums.length ; i++ ){
            if(nums[res-1] == nums[i]){
                continue;
            }
            nums[res++] = nums[i];
        }

        return res;
    }
}
