package v1;

import algorithm.sort.QuickSelection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author yuan.zhou
 */
public class T324 {

    public void wiggleSort(int[] nums) {
        //得到中位数
        double median = getMedian(nums);

        boolean flag = nums.length % 2 == 0;

        //重排nums[小于 等于 大于]
        int equal = 0;
        int left = 0;
        int right = nums.length - 1;
        while (equal <= right) {
            if (nums[V(equal,nums.length)] < median) {
                swap(nums,V(equal,nums.length),V(right--,nums.length));
            } else if (nums[V(equal,nums.length)] > median) {
                swap(nums,V(equal++,nums.length),V(left++,nums.length));
            } else {
                equal++;
            }
        }

    }

    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    public int V(int i, int length){
        return (1+2*(i)) % (length|1);
    }

    public double getMedian(int[] nums) {
        boolean flag = nums.length % 2 == 0;
        int target1 = nums.length / 2;
        int target2 = flag ? target1 - 1 : target1;

        dividedAndConquer(nums, 0, nums.length - 1, target1, target2);

        return (nums[target1] + nums[target2]) / 2.0d;
    }


    public int adjustArray(int[] nums, int left, int right) {
        int target = nums[left];

        int emptyPosition = left;
        left += 1;

        while (emptyPosition < right) {
            int x = nums[left];
            if (x <= target) {
                nums[emptyPosition++] = nums[left++];
            } else {
                int temp = nums[right];
                nums[right--] = nums[left];
                nums[left] = temp;
            }
        }

        nums[emptyPosition] = target;

        return emptyPosition;

    }

    public void dividedAndConquer(int[] nums, int left, int right, int target1, int target2) {
        if (target1 < left || target1 > right) {
            if (target2 < left || target2 > right) {
                return;
            }
        }

        if (left < right) {
            int split = adjustArray(nums, left, right);
            dividedAndConquer(nums, left, split - 1, target1, target2);
            dividedAndConquer(nums, split + 1, right, target1, target2);
        }
    }
}
