package v1.t100;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T199 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode node, int level) {
        if (res.size() <= level) {
            res.add(node.val);
        }
        level++;
        dfs(node.right, level);
        dfs(node.left, level);
    }
}
