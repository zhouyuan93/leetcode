package v1.jz2;

import common.Node;
import common.tree.TreeNode;

public class JZZ045 {
    int floor = -1;
    int res = -1;

    public int findBottomLeftValue(TreeNode root) {

        get(root, 0);

        return res;
    }

    public void get(TreeNode node, int f) {
        if (node == null) {
            return;
        }
        if (f > floor) {
            floor = f;
            res = node.val;
        }

        f++;
        get(node.left, f);
        get(node.right, f);

    }
}
