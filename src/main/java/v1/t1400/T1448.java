package v1.t1400;

import common.tree.TreeNode;

public class T1448 {
    public int goodNodes(TreeNode root) {
        return 1 + goodNodes(root.left, root.val) + goodNodes(root.right, root.val);
    }

    public int goodNodes(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        int nextMax = max;
        if (root.val >= max) {
            nextMax = root.val;
            count++;
        }
        return count + goodNodes(root.left, nextMax) + goodNodes(root.right, nextMax);
    }


}
