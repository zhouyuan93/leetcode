package v1.t2300;

import common.tree.TreeNode;

public class T2331 {

    public boolean evaluateTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        switch (root.val) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return evaluateTree(root.left) || evaluateTree(root.right);
            default:
                return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }

}
