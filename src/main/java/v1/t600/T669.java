package v1.t600;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        TreeNode rLeft = trimBST(root.left, low, high);
        TreeNode rRight = trimBST(root.right, low, high);

        if (root.val >= low && root.val <= high) {
            root.left = rLeft;
            root.right = rRight;
        }else{
            root = null;
            if (rLeft != null) {
                root = rLeft;
            }
            if (rRight != null) {
                root = rRight;
            }
        }

        return root;

    }
}
