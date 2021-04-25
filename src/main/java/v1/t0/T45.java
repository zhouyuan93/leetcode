package v1.t0;

public class T45 {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int count = 1;
        int right = nums[0];
        int i = 0;
        int max = 0;
        while (i < nums.length-1 && right < nums.length-1) {
            i++;
            int x = nums[i] + i;
            max = Math.max(max, x);
            if (right == i) {
                right = max;
                count++;
            }
        }

        return count;
    }
}
