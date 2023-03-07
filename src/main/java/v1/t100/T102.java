package v1.t100;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();

        dfs(0, root, list);

        return list;
    }

    private void dfs(int level, TreeNode node, List<List<Integer>> list) {
        if (node == null) {
            return;
        }

        if (list.size() <= level) {
            list.add(new ArrayList<>());
        }

        list.get(level).add(node.val);

        level++;
        dfs(level, node.left, list);
        dfs(level, node.right, list);

    }
}
