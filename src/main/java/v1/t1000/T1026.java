package v1.t1000;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T1026 {
    public int maxAncestorDiff(TreeNode root) {

        return maxAncestorDiff(root, root.val, root.val);

    }

    public int maxAncestorDiff(TreeNode root, int max, int min) {
        if (root == null) {
            return 0;
        }
        int p = Math.max(Math.abs(max - root.val), Math.abs(min - root.val));
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        int left = maxAncestorDiff(root.left, max, min);
        int right = maxAncestorDiff(root.right, max, min);

        return Math.max(p, Math.max(left, right));

    }
}
