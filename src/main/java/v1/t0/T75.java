package v1.t0;

public class T75 {
    public void sortColors(int[] nums) {
        int r = -1;
        int b = nums.length;

        int i = 0;
        while (i < b) {
            int x = nums[i];
            if (x == 0) {
                r++;
                if (r != i) {
                    nums[r] ^= nums[i];
                    nums[i] ^= nums[r];
                    nums[r] ^= nums[i];
                }else{
                    i++;
                }
            } else if (x == 2) {
                b--;
                if (i != b) {
                    nums[i] ^= nums[b];
                    nums[b] ^= nums[i];
                    nums[i] ^= nums[b];
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }

    }
}
