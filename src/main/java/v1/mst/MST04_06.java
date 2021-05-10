package v1.mst;

import common.tree.TreeNode;

public class MST04_06 {
    Boolean next = false;
    TreeNode res = null;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        dfs(root, p);
        return res;
    }

    public void dfs(TreeNode root, TreeNode p) {
        if (root == null || res != null) {
            return;
        }

        if(root.val != p.val){
            dfs(root.left, p);
        }

        if (next) {
            res = root;
            next = false;
            return;
        }

        if (root.val == p.val) {
            next = true;
        }

        dfs(root.right, p);

    }

}
