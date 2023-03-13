package v1.t0;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class T99 {
    public void recoverTree(TreeNode root) {
        TreeNode[] e = new TreeNode[3];
        TreeNode[] m = new TreeNode[1];

        find(root, e, m);

        TreeNode e1 = e[0];
        TreeNode e2 = e[1];
        int t = e1.val;
        e1.val = e2.val;
        e2.val = t;
    }

    private void find(TreeNode root, TreeNode[] e, TreeNode[] m) {
        if (root == null || e[2] != null) {
            return;
        }
        find(root.left, e, m);
        if (m[0] != null) {
            if (m[0].val > root.val) {
                e[1] = root;
                if (e[0] == null) {
                    e[0] = m[0];
                }else{
                    e[2] = root;
                    return;
                }
            }
        }
        m[0] = root;
        find(root.right, e, m);
    }


}
