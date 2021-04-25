package v1.t800;

import common.tree.TreeNode;

public class T897 {
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        return increasingBST2(root)[0];

    }

    public TreeNode[] increasingBST2(TreeNode root) {
        TreeNode head = null;
        TreeNode end = null;

        if (root.left != null) {
            TreeNode[] lefts = increasingBST2(root.left);
            head = lefts[0];
            end = lefts[1];
            root.left = null;
            end.right = root;
            end.left = null;
            end = end.right;
        }else{
            head = root;
            end = root;
        }

        if (root.right != null) {
            TreeNode[] rights = increasingBST2(root.right);
            end.right = rights[0];
            end = rights[1];
        }

        return new TreeNode[]{head, end};

    }
}
