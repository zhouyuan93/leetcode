package v1.t1300;

import common.tree.TreeNode;

/**
 * @author yuan.zhou
 */
public class T1315 {
    public int sumEvenGrandparent(TreeNode root) {

        return sumEvenGrandparent(root, false, false);

    }

    public int sumEvenGrandparent(TreeNode root, Boolean father, Boolean grandPa) {
        if (root == null) {
            return 0;
        }

        int res = grandPa ? root.val : 0;
        boolean isEven = root.val % 2 == 0;
        res += sumEvenGrandparent(root.left, isEven, father);
        res += sumEvenGrandparent(root.right, isEven, father);
        return res;

    }
}
