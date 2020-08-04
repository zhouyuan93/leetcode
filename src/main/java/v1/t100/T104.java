package v1.t100;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }
}
