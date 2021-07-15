package v1.mst;

import common.tree.TreeNode;

public class MST04_12 {
    int res = 0;
    int x = 0;

    public int pathSum(TreeNode root, int sum) {
        x = sum;
        bfs2(root, sum);
        return res;
    }

    public void bfs(TreeNode node, int sum) {
        if (node == null) {
            return;
        }

        if (node.val == sum) {
            res++;
        }

        sum -= node.val;
        bfs(node.left, sum);
        bfs(node.right, sum);
    }

    void bfs2(TreeNode node, int sum) {
        if (node == null) {
            return;
        }
        bfs(node, x);
        bfs2(node.left, x);
        bfs2(node.right, x);
    }
}
