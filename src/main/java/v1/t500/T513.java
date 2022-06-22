package v1.t500;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class T513 {

    int res;
    int floor;

    public int findBottomLeftValue(TreeNode root) {
        res = root.val;
        floor = 0;

        find(root , 0);

        return res;
    }

    public void find(TreeNode node, int f) {
        if (node == null) {
            return;
        }
        if (f > floor) {
            floor = f;
            res = node.val;
        }
        f++;
        find(node.left, f);
        find(node.right, f);
    }
}
