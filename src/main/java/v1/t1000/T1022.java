package v1.t1000;

import common.tree.TreeNode;

public class T1022 {
    int res = 0;
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, 0);
        return res;
    }

    public void dfs(TreeNode node, int x) {
        if (node == null) {
            return;
        }
        x = (x << 1) | node.val;
        if (node.left == null && node.right == null) {
            res += x;
            return;
        }
        if (node.left != null) {
            dfs(node.left, x);
        }
        if (node.right != null) {
            dfs(node.right, x);
        }
    }
}
