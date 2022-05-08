package weekend.d20220508;

import common.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class T2 {

    Map<TreeNode, Integer> meoCount = new HashMap<>();
    Map<TreeNode, Integer> meoSum = new HashMap<>();

    public int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int c = count(root);
        int s = sum(root);
        int res = 0;

        if (s / c == root.val) {
            res = 1;
        }

        return res + averageOfSubtree(root.left) + averageOfSubtree(root.right);
    }

    public int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (meoCount.containsKey(root)) {
            return meoCount.get(root);
        }else{
            int val = 1 + count(root.left) + count(root.right);
            meoCount.put(root, val);
            return val;
        }
    }
    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (meoSum.containsKey(root)) {
            return meoSum.get(root);
        }else{
            int val = root.val + sum(root.left) + sum(root.right);
            meoSum.put(root, val);
            return val;
        }
    }

}
