package v1.t700;

import common.tree.TreeNode;

public class T701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val < val) {
            if (root.right == null) {
                root.right = new TreeNode(val);
            }else{
                insertIntoBST(root.right, val);
            }
        }else{
            if (root.left == null) {
                root.left = new TreeNode(val);
            }else{
                insertIntoBST(root.left, val);
            }
        }

        return root;
    }
}
