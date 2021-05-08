package v1.t1700;

import java.util.Arrays;

public class T1723 {

    int[] jobs;
    int k;
    int len;
    int res = 0x3f3f3f3f;


    public int minimumTimeRequired(int[] _jobs, int _k) {
        jobs = _jobs;
        k = _k;
        len = _jobs.length;
        int[] nums = new int[k];
        dfs(0, 0, nums, 0);
        return res;
    }

    public void dfs(int p, int used, int[] nums, int max) {
        // 当前已不是最优解
        if (max >= res) {
            return;
        }

        // 最后一个job已经分配完
        if (p >= len) {
            System.out.println(max + " --> " + Arrays.toString(nums));
            res = Math.min(res, max);
            return;
        }

        // used不为空时, 先填入空, 相当于剪枝
        if (used < k) {
            nums[used] = jobs[p];
            dfs(p + 1, used + 1, nums, Math.max(max, nums[used]));
            nums[used] = 0;
        }

        for (int j = 0; j < used; j++) {
            nums[j] += jobs[p];
            dfs(p + 1, used, nums, Math.max(max, nums[j]));
            nums[j] -= jobs[p];
        }
    }
}
