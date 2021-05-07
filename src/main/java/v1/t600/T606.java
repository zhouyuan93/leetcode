package v1.t600;

import common.tree.TreeNode;

public class T606 {
    public String tree2str(TreeNode root) {
        StringBuilder res = new StringBuilder();
        traversal(root, res);
        return res.toString();
    }

    public void traversal(TreeNode node, StringBuilder res) {
        if (node == null) {
            return;
        }
        res.append(node.val);
        if (node.left != null) {
            res.append("(");
            traversal(node.left,res);
            res.append(")");
        }

        if (node.right != null) {
            if (node.left == null) {
                res.append("()");
            }
            res.append("(");
            traversal(node.right, res);
            res.append(")");
        }
    }
}
