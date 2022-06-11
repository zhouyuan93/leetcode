package weekend.d20220605;

public class T1 {
    public int minMaxGame(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int len = nums.length;
        int[] temp = new int[1];
        while (len > 1) {
            len /= 2;
            temp = new int[len];
            for (int i = 0; i < temp.length; i++) {
                if ((i & 1) == 0) {
                    temp[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                }else{
                    temp[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = temp;
        }

        return nums[0];

    }
}
