package v1.t100;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T113 {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> before = new ArrayList<>();
        pathSum(ans, before, root, targetSum);
        return ans;
    }

    public void pathSum(List<List<Integer>> ans, List<Integer> before, TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.val != targetSum) {
                return;
            }
            List<Integer> node = new ArrayList<>();
            node.addAll(before);
            node.add(root.val);
            ans.add(node);
            return;
        }
        before.add(root.val);
        int nextTargetSum = targetSum - root.val;
        pathSum(ans, before, root.left, nextTargetSum);
        pathSum(ans, before, root.right, nextTargetSum);
        before.remove(before.size() - 1);
    }


}
