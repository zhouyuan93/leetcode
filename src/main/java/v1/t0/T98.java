package v1.t0;

import common.tree.TreeNode;

public class T98 {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Integer.MIN_VALUE-1, Integer.MAX_VALUE+1);
    }

    public boolean valid(TreeNode root, long l, long r) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.left.val >= root.val
                    || root.left.val <= l
                    || !valid(root.left, l, root.val)) {
                return false;
            }
        }

        if (root.right != null) {
            if (root.right.val <= root.val
                    || root.right.val >= r
                    || !valid(root.right, root.val, r)) {
                return false;
            }
        }

        return true;
    }
}
