package v1.mst;

import common.tree.TreeNode;

public class MST04_04 {

    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        getLevel(root);

        return res;
    }

    public int getLevel(TreeNode node) {
        if (!res) {
            return 0;
        }

        if (node == null) {
            return 0;
        }

        int left = getLevel(node.left);
        int right = getLevel(node.right);

        if (Math.abs(left - right) > 1) {
            res = false;
        }

        int l = Math.max(left, right) + 1;
        return l;
    }

}
