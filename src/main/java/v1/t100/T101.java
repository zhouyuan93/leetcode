package v1.t100;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSame(root.left, root.right);

    }

    public static boolean isSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        return p != null && q != null && q.val == p.val
                && isSame(p.left, q.right)
                && isSame(p.right, q.left);
    }
}
