package v1.t500;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yuan.zhou
 */
public class T508 {
    public int[] findFrequentTreeSum3(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        findFrequentTreeSum(root, map);
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                list = new ArrayList<>();
                list.add(entry.getKey());
                max = entry.getValue();
                continue;
            }

            if (entry.getValue() == max) {
                list.add(entry.getKey());
                continue;
            }

        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public int findFrequentTreeSum(TreeNode root, Map<Integer,Integer> map) {
        if (root == null) {
            return 0;
        }
        int left = findFrequentTreeSum(root.left, map);
        int right = findFrequentTreeSum(root.right, map);
        int sum = root.val + left + right;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        get(root, map);
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > k) {
                list.clear();
                k = entry.getValue();
                list.add(entry.getKey());
            } else if (entry.getValue() == k) {
                list.add(entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public int get(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return 0;
        }
        int res = root.val + get(root.left, map) + get(root.right, map);
        map.put(res, map.getOrDefault(res, 0) + 1);
        return res;
    }
}
