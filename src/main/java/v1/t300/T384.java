package v1.t300;

import java.util.Arrays;
import java.util.Random;

public class T384 {
    static class Solution {

        int[] original;

        public Solution(int[] nums) {
            this.original = nums;
        }

        public int[] reset() {
            return original;
        }

        public int[] shuffle() {
            int[] nums = original.clone();
            Random random = new Random();
            int n = nums.length;

            for (int i = n-1; i >= 0; i--) {
                swap(nums, i, random.nextInt(i+1));
            }
            return nums;
        }

        private void swap(int[] arr, int i, int j) {
            int c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
    }
}
