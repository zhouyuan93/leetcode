package history;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T15 {
    public static void main(String[] args) {
        T15 t = new T15();
        System.out.println(t.threeSum(new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0}));

    }
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        int pi = 0;
        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && pi == nums[i]) {
                continue;
            }
            int last = nums.length -1 ;
            int pj = nums[i + 1];
            for (int j = i+1; j < last ; j++) {
                if (j > i + 1 && pj == nums[j]) {
                    continue;
                }
                while (last-1 > j && (nums[i] + nums[j] + nums[last] > 0) ) {
                    last--;
                }
                if (nums[i] + nums[j] + nums[last] == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[last]));
                }
                while (last-1 > j && nums[last] == nums[last - 1] && nums[last] == nums[last - 2]) {
                    last--;
                }
                pj = nums[j];
            }
            pi = nums[i];
        }

        return res;
    }
}
