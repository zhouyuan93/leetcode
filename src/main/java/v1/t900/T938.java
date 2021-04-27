package v1.t900;

import common.tree.TreeNode;

public class T938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.val >= low && root.val <= high) {
            res += rangeSumBST(root.right, low, high);
            res += rangeSumBST(root.left, low, high);
            res += root.val;
        } else if (root.val > high) {
            res += rangeSumBST(root.left, low, high);
        } else if (root.val < low) {
            res += rangeSumBST(root.right, low, high);

        }
        return res;
    }
}
