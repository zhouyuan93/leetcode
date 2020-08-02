package v1;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T114 {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        if (root.left != null) {
            TreeNode beforeLast = root.left;
            while (beforeLast.right != null) {
                beforeLast = beforeLast.right;
            }
            beforeLast.right = root.right;
            root.right = root.left;
            root.left = null;
        }
    }

}
