package v1.mst;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class MST17_12 {
    public TreeNode convertBiNode(TreeNode root) {
        TreeNode head = new TreeNode(-1);
        dfs(head, root);
        return head.right;
    }

    public TreeNode dfs(TreeNode lastNode, TreeNode root) {
        if (root == null) {
            return lastNode;
        }

        //切开
        TreeNode right = root.right;
        TreeNode left = root.left;
        root.right = null;
        root.left = null;

        lastNode = dfs(lastNode, left);
        lastNode.right = root;
        lastNode = lastNode.right;
        lastNode = dfs(lastNode, right);

        return lastNode;

    }
}
