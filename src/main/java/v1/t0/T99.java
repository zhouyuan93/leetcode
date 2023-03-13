package v1.t0;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class T99 {
    public void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        TreeNode[] m = new TreeNode[1];

        find(root, list, m);

        TreeNode e1 = list.get(0);
        TreeNode e2 = list.get(list.size() - 1);
        int t = e1.val;
        e1.val = e2.val;
        e2.val = t;
    }

    private void find(TreeNode root, List<TreeNode> list, TreeNode[] m) {
        if (root == null) {
            return;
        }
        find(root.left, list, m);
        if (m[0] != null) {
            if (m[0].val > root.val) {
                list.add(m[0]);
                list.add(root);
            }
        }
        m[0] = root;
        find(root.right, list, m);
    }


}
