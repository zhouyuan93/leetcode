package v1.t1100;

import common.Node;
import common.tree.TreeNode;

public class T1145 {
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        TreeNode p = root;
        TreeNode nodeX = find(root, x);
        int l = count(nodeX.left);
        int r = count(nodeX.right);
        int f = n - l - r - 1;

        return (n < 2 * f) || (n < 2 * l) || (n < 2 * r);
    }

    public TreeNode find(TreeNode root, int x) {
        if (root == null) {
            return null;
        }
        if (root.val == x) {
            return root;
        }
        TreeNode left = find(root.left, x);
        if (left != null) {
            return left;
        }
        return find(root.right, x);
    }

    public int count(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + count(node.left) + count(node.right);
    }
}
