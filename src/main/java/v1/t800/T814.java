package v1.t800;

import common.tree.TreeNode;

public class T814 {

    public TreeNode pruneTree(TreeNode root) {

        remove(root);

        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }

        return root;

    }

    public void remove(TreeNode root) {
        if (root == null) {
            return;
        }

        remove(root.left);
        if (root.left != null && root.left.val == 0) {
            if (root.left.left == null && root.left.right == null) {
                root.left = null;
            }
        }

        remove(root.right);
        if (root.right != null && root.right.val == 0) {
            if (root.right.left == null && root.right.right == null) {
                root.right = null;
            }
        }

    }



}
