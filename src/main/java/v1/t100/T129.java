package v1.t100;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T129 {
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumNumbers(root, 0);
    }

    public int sumNumbers(TreeNode root, int before) {
        before = (before * 10) + root.val;

        int res = 0;

        if (root.left == null && root.right == null) {
            res += before;
        }

        if (root.left != null) {
            res += sumNumbers(root.left, before);
        }

        if (root.right != null) {
            res += sumNumbers(root.right, before);
        }


        return res;

    }
}
