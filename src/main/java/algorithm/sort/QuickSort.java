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
 * 3. 再对左右区间进行第二步,直到各区间只剩下一个数字
 */
public class QuickSort {

    public static void run(int[] nums) {

        divideAndConquer(nums, 0, nums.length - 1);

    }

    /**
     * 返回基准数位置, 并按步骤1排序数组
     *
     * @param nums
     * @param left
     * @param right
     * @return targetLocation 基准数位置
     */
    public static int adjustArray(int[] nums, int left, int right) {

        int target = nums[left];

        int vacantPosition = left;
        left += 1;
        while (vacantPosition < right) {
            if (nums[left] <= target) {
                nums[vacantPosition++] = nums[left++];
            } else {
                int temp = nums[right];
                nums[right--] = nums[left];
                nums[left] = temp;
            }
        }
        nums[vacantPosition] = target;

        return vacantPosition;

    }

    public static void divideAndConquer(int[] nums, int left, int right) {

        if (left < right) {
            int targetPosition = adjustArray(nums, left, right);
            divideAndConquer(nums, left, targetPosition - 1);
            divideAndConquer(nums, targetPosition + 1, right);
        }

    }
}
