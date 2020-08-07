package v1.t100;

import common.tree.TreeNode;

public class T100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        return p != null && q != null
                && p.val == q.val
                && isSameTree(p.left, q.left) && isSameTree(q.right, p.right);

    }
}
