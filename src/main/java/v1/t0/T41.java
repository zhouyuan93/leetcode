package v1.t0;

/**
 * @author yuan.zhou
 */
public class T41 {
    public int firstMissingPositive(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        arr[0] = true;
        for (int n : nums) {
            if (n > nums.length || n <= 0) {
                continue;
            }
            arr[n] = true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) {
                return i;
            }
        }
        return nums.length + 1;
    }
}
