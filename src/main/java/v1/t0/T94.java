package v1.t0;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        get(res, root);

        return res;
    }

    private void get(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }
        get(res, root.left);
        res.add(root.val);
        get(res, root.right);
    }
}
