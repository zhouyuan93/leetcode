package v1;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T515 {
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        int i = 0;

        List<Integer> res = new ArrayList<>();

        dealValues(root, i, res);

        return res;
    }

    private void dealValues(TreeNode treeNode,final int i,List<Integer> res) {
        if (treeNode == null) {
            return ;
        }
        while (i > res.size() -1 ) {
            res.add(null);
        }
        if (res.get(i) == null || treeNode.val > res.get(i)) {
            res.set(i, treeNode.val);
        }
        dealValues(treeNode.left, i + 1, res);
        dealValues(treeNode.right, i + 1, res);
    }


}
