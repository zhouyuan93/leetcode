package v1.t0;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T95 {
    public List<TreeNode> generateTrees(int n) {

        List<TreeNode> res = new ArrayList<>();

        if (n == 1) {
            res.add(new TreeNode(1));
            return res;
        }

        List<TreeNode> temp = generateTrees(n - 1);

        TreeNode node = new TreeNode(n);
        for (TreeNode head : temp) {
            node.left = head;
            res.add(copy(node));
            node.left = null;

            TreeNode t = head;
            while (t.right != null) {
                node.left = t.right;
                t.right = node;
                res.add(copy(head));

                t.right = node.left;
                node.left = null;
                t = t.right;
            }

            t.right = node;
            res.add(copy(head));
        }

        return res;

    }

    private TreeNode copy(TreeNode head) {
        if (head == null) {
            return null;
        }

        TreeNode r = new TreeNode(head.val);
        r.left = copy(head.left);
        r.right = copy(head.right);

        return r;
    }

}
