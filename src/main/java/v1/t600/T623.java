package v1.t600;

import common.tree.TreeNode;

public class T623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode l = new TreeNode(val);
            l.left = root;
            return l;
        }

        add(root, val, depth - 2);

        return root;

    }

    public void add(TreeNode root, int val, int depth) {
        if (root == null || depth < 0) {
            return;
        }

        if (depth == 0) {
            TreeNode l = new TreeNode(val);
            TreeNode r = new TreeNode(val);
            l.left = root.left;
            r.right = root.right;
            root.left = l;
            root.right = r;
        }else{
            add(root.left, val, depth - 1);
            add(root.right, val, depth - 1);
        }

    }
}
