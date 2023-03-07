package v1.t0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        // 为空的情况
        res.add(new ArrayList<>());
        if (nums == null || nums.length < 1) {
            return res;
        }

        // 初始化第一个元素
        List<Integer> l1 = new ArrayList<>();
        l1.add(nums[0]);
        res.add(l1);

        int before = nums[0];
        int beforeSize = 1;

        // 从第二个元素开始循环
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];
            if (x == before) {
                int len = res.size();
                int nextBeforeSize = 0;
                for (int j = len - beforeSize; j < len; j++) {
                    List<Integer> temp = res.get(j);
                    for (int m = 0; m <= temp.size(); m++) {
                        if (m < temp.size() && temp.get(m) <= x) {
                            continue;
                        }
                        ArrayList<Integer> one = new ArrayList<>();
                        one.addAll(temp);
                        one.add(m, x);
                        res.add(one);
                        nextBeforeSize++;
                    }
                }

                beforeSize = nextBeforeSize;
                continue;
            }

            before = x;
            beforeSize = 0;
            for (int j = res.size() - 1; j >= 0; j--) {
                List<Integer> temp = res.get(j);
                for (int m = 0; m <= temp.size(); m++) {
                    if (m < temp.size() && temp.get(m) < x) {
                        continue;
                    }
                    ArrayList<Integer> one = new ArrayList<>();
                    one.addAll(temp);
                    one.add(m, x);
                    res.add(one);
                    beforeSize++;
                }
            }

        }

        return res;

    }
}
