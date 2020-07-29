package algorithm.sort;

/**
 * @author yuan.zhou
 * <p>
 * 排序效率: O(N*logN)
 * <p>
 * 思想: 分治法
 * <p>
 * 简介: 快速排序是C.R.A Hoare 与1962年提出的一种划分交换排序
 * <p>
 * 步骤:
 * 1. 先从数列中取出一个数作为基准数
 * 2. 分区过程, 将比基准书大的数全放在他的右边,小于等于的放在左边
 * 3. 选择需要分区,重复第二步
 */
public class QuickSelection {

    public static double getMedian(int[] nums) {
        boolean flag = nums.length % 2 == 0;
        int target1 = nums.length / 2 ;
        int target2 = flag ? target1 - 1 : target1;

        divideAndConquer(nums, 0, nums.length - 1, target1, target2);

        return (nums[target1] + nums[target2]) / 2.0D;
    }

    public static int adjustArray(int[] nums, int left, int right) {

        int target = nums[left];

        int emptyPosition = left;
        left += 1;
        while (emptyPosition < right) {
            int x = nums[left];
            if (x <= target) {
                nums[emptyPosition++] = nums[left++];
            } else {
                int temp = nums[right];
                nums[right--] = x;
                nums[left] = temp;
            }
        }

        nums[emptyPosition] = target;

        return emptyPosition;

    }

    public static void divideAndConquer(int[] nums, int left, int right, int target1, int target2) {

        if (target1 < left || target1 > right) {
            if (target2 < left || target2 > right) {
                return;
            }
        }


        if (left < right) {
            int split = adjustArray(nums, left, right);
            divideAndConquer(nums, split + 1, right, target1, target2);
            divideAndConquer(nums, left, split - 1, target1, target2);
        }

    }
}
