package v1.t1100;

import common.Node;
import common.tree.TreeNode;

public class T1145 {
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        int countRoot;
        int countXLeft;
        int countXRight;

        countRoot = n;

        TreeNode t = findNode(root, x);
        countXLeft = calcCount(t.left);
        countXRight = calcCount(t.right);

        int y = countRoot - 2 * (countXRight + countXLeft + 1);
        if (y > 0) {
            return true;
        }

        y = countRoot - 2 * countXLeft;
        if (y < 0) {
            return true;
        }

        y = countRoot - 2 * countXRight;
        if (y < 0) {
            return true;
        }

        return false;
    }

    public TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }
        if (node.val == x) {
            return node;
        }
        TreeNode left = findNode(node.left, x);
        if (left != null) {
            return left;
        }
        TreeNode right = findNode(node.right, x);
        if (right != null) {
            return right;
        }
        return null;
    }

    public int calcCount(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = calcCount(node.left);
        int right = calcCount(node.right);
        return left + right + 1;
    }
}
