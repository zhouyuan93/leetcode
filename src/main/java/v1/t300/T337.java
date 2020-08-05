package v1.t300;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T337 {

    public int rob(TreeNode root) {

        return rob(root, true);

    }

    public int rob(TreeNode root, boolean canSteal) {
        if (root == null) {
            return 0;
        }

        if (canSteal) {
            int steal = root.val + rob(root.left, false) + rob(root.right, false);
            int notSteal = rob(root.left, true) + rob(root.right, true);
            return Math.max(steal,notSteal);
        }

        return rob(root.left, true) + rob(root.right, true);

    }
}
