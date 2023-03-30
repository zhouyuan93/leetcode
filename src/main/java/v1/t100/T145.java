package v1.t100;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }


        List<Integer> res = postorderTraversal(root.left);
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);

        return res;

    }
}
