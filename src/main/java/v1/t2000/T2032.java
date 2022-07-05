package v1.t2000;

import java.util.ArrayList;
import java.util.List;

public class T2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[][] memo = new int[3][101];
        for (int x : nums1) {
            memo[0][x]++;
        }
        for (int x : nums2) {
            memo[1][x]++;
        }
        for (int x : nums3) {
            memo[2][x]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            if ((memo[0][i] > 0 ? 1 : 0) + (memo[1][i] > 0 ? 1 : 0) + (memo[2][i] > 0 ? 1 : 0) > 1) {
                ans.add(i);
            }
        }

        return ans;

    }
}
