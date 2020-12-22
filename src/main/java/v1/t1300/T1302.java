package v1.t1300;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T1302 {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int[] res = {0, 0};
        getDeepNodeVal(root, 0, res);

        return res[1];

    }

    public void getDeepNodeVal(TreeNode root, int floor, int[] res) {
        if (root == null) {
            return;
        }

        if (floor > res[0]) {
            res[0] = floor;
            res[1] = root.val;
        } else if (floor == res[0]) {
            res[1] += root.val;
        }

        getDeepNodeVal(root.left, floor + 1, res);
        getDeepNodeVal(root.right, floor + 1, res);
    }
}
