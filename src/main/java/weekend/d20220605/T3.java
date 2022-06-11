package weekend.d20220605;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T3 {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> trans = new HashMap<>();
        HashMap<Integer, List<Integer>> t = new HashMap<>();

        for (int n : nums) {
            trans.put(n,n);
            List<Integer> list = new ArrayList<>();
            list.add(n);
            t.put(n, list);
        }
        for (int[] x : operations) {
            int a = x[0];
            int b = x[1];
            List<Integer> list = t.get(a);
            t.put(a, new ArrayList<>());
            List<Integer> lb = t.getOrDefault(b, new ArrayList<>());
            lb.addAll(list);
            t.put(b, lb);
            for (int i = 0; i < list.size(); i++) {
                int key = list.get(i);
                trans.put(key, b);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = trans.getOrDefault(x,x);
            nums[i] = y;
        }

        return nums;
    }
}
