package v1.jz;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class JZ32 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelOrder(root,0,res);
        return res;
    }

    public void levelOrder(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (level + 1 > res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);

        levelOrder(root.left, level + 1, res);
        levelOrder(root.right, level + 1, res);

    }
}
