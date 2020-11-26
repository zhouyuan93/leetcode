package v1.t600;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T671 {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null || root.left == null) {
            return -1;
        }
        int left = root.left.val == root.val ? findSecondMinimumValue(root.left) : root.left.val;
        int right = root.right.val == root.val ? findSecondMinimumValue(root.right) : root.right.val;
        if (left == -1 && right == -1) {
            return  -1;
        }
        if (left != -1 && right == -1) {
            return left;
        }
        if (left == -1 && right != -1) {
            return right;
        }
        return Math.min(left, right);
    }
}
