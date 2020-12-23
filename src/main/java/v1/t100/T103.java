package v1.t100;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        add(res, 0, root);
        return res;
    }

    public void add(List<List<Integer>> res, int floor, TreeNode root) {
        if (root == null) {
            return;
        }

        if (floor >= res.size()) {
            res.add(new ArrayList<>());
        }

        if (floor % 2 == 0) {
            res.get(floor).add(root.val);
        }else{
            res.get(floor).add(0,root.val);
        }

        floor++;
        add(res, floor, root.left);
        add(res, floor, root.right);

    }

}
