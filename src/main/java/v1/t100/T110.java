package v1.t100;

import common.tree.TreeNode;

public class T110 {
    public boolean isBalanced(TreeNode root) {
        return treeMaxHeight(root, 0) > -1;
    }

    public static int treeMaxHeight(TreeNode root, int floor) {
        if (root == null) {
            return floor;
        }

        int left = treeMaxHeight(root.left, floor + 1);

        if (left == -1) {
            return -1;
        }

        int right = treeMaxHeight(root.right, floor + 1);

        if (right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }else{
            return Math.max(left, right);
        }

    }
}
