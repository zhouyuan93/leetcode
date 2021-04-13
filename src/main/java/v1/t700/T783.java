package v1.t700;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T783 {

    int res = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        initList(root);
        return res;
    }

    public int[] initList(TreeNode root) {
        int[] arr = {root.val, root.val};
        if (root.left != null) {
            int[] left = initList(root.left);
            res = Math.min(res, root.val - left[1]);
            arr[0] = left[0];
        }
        if (root.right != null) {
            int[] right = initList(root.right);
            res = Math.min(res, right[0] - root.val);
            arr[1] = right[1];
        }
        return arr;
    }

}
