package v1.t800;

import common.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T894 {
    public List<TreeNode> allPossibleFBT(int N) {
        LinkedList<TreeNode> res = new LinkedList<>();

        if (N == 1) {
            TreeNode root = new TreeNode(0);
            res.add(root);
            return res;
        }

        for (int i = 1; i <= (N-1) / 2; i += 2) {
            List<TreeNode> leftList = allPossibleFBT(i);
            for (TreeNode left : leftList) {
                List<TreeNode> rightList = allPossibleFBT(N - 1 - i);
                for (TreeNode right : rightList) {
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;
                    res.add(root);

                    if (i != N - 1 - i) {
                        root = new TreeNode(0);
                        root.right = left;
                        root.left = right;
                        res.add(root);
                    }
                }
            }
            List<TreeNode> right = allPossibleFBT(N - 1 - i);

        }

        return res;

    }
}
