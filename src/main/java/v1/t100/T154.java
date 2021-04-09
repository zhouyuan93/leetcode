package v1.t100;

/**
 * @author yuan.zhou
 */
public class T154 {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    public int findMin(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        if (left + 1 == right) {
            return Math.min(nums[left], nums[right]);
        }

        int l = nums[left];
        int r = nums[right];

        // l < r : left到right为递增
        if (l < r) {
            return l;
        }

        // l == r : 数组为倒 // 型
        if (l >= r) {
            int mid = (left + right) / 2;
            int m = nums[mid];
            // 判断mid位于什么位置
            if(m > l){
                return findMin(nums, mid, right);
            } else if (m < l){
                return findMin(nums, left, mid);
            } else {
                return Math.min(findMin(nums, mid, right), findMin(nums, left, mid));
            }
        }

        throw new RuntimeException("error");
    }

}
