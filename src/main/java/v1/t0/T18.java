package v1.t0;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class T18 {

    public List<List<Integer>> foursum(int[] nums, int target) {
        Arrays.sort(nums);
        return xSum(4, nums, target,0);
    }

    /**
     * 入参：期待个数x，数组nums，目标target, 数组起始下标begin
     * 返回： 正确值
     * @param x
     * @param nums
     * @param target
     * @param begin
     * @return
     */
    public List<List<Integer>> xSum(int x, int[] nums, int target, int begin) {

        List<List<Integer>> list = new LinkedList<>();

        if (x == 1) {
            for (int i = begin; i < nums.length; i++) {
                if (i > begin && nums[i] == nums[i-1]) {
                    continue;
                }
                if (nums[i] == target) {
                    LinkedList<Integer> row = new LinkedList<>();
                    row.add(nums[i]);
                    list.add(row);
                }
            }
            return list;
        }else{
            for (int i = begin; i < nums.length; i++) {
                //当nums[i]的值大于target时不需要继续， 因为nums[i+1]的值比如比target大
                if (nums[i] > 0 && nums[i] > target) {
                    break;
                }
                List<List<Integer>> tempList;
                if (i > 0 && i > begin && nums[i] == nums[i - 1]) {
                    continue;
                } else {
                    tempList = xSum(x - 1, nums, target - nums[i], i + 1);
                }

                //tempList的size大于0时往结果里add
                for (List<Integer> res : tempList) {
                    res.add(0, nums[i]);
                    list.add(res);
                }
            }
        }

        return list;
    }

}
