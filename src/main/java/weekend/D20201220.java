package weekend;

import v1.t600.T677;

import java.util.HashSet;

public class D20201220 {
    public String reformatNumber(String number) {
        if (number == null || number.length() == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        int m = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c == ' ' || c == '-') {
                continue;
            }
            if (m == 3) {
                res.append("-");
                m = 0;
            }
            res.append(c);
            m++;
        }
        int len = res.length();
        if (m == 1) {
            res.deleteCharAt(len - 2);
            res.insert(len - 3, "-");
        }
        return res.toString();
    }

    public int maximumUniqueSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] numSum = new int[nums.length];
        Integer[] numIndex = new Integer[10002];

        int res = nums[0];
        int sum =0 ;
        int left = -1;
        for (int i = 0 ; i < nums.length ; i++) {
            int num = nums[i];
            sum += num;
            numSum[i] = sum;
            if (numIndex[num] != null) {
                int x = numIndex[num];
                while (left < x) {
                    left++;
                    numIndex[nums[left]] = null;
                }
                res = Math.max(sum - numSum[left], res);
            }else{
                int x = 0;
                if (left >= 0) {
                    x = numSum[left];
                }
                res = Math.max(sum- x, res);
            }
            numIndex[num] = i;
        }

        return res;

    }

    public int maxResult(int[] nums, int k) {
        Integer[] dp = new Integer[nums.length];
        dp[nums.length - 1] = nums[nums.length - 1];
        search(dp, nums, k, 0);
        return dp[0];
    }

    public int search(Integer[] dp, int[] nums, int k, int begin) {

        if (begin >= nums.length) {
            return dp[nums.length-1];
        }

        if (begin == nums.length-1) {
            return dp[begin];
        }

        if (dp[begin] != null) {
            return dp[begin];
        }


        int add = Integer.MIN_VALUE;
        for (int i = 1; i <= k; i++) {
            int temp = search(dp, nums, k, begin + i);
            add = Math.max(temp, add);
        }
        dp[begin] = nums[begin] + add;
        return dp[begin];

    }

}
