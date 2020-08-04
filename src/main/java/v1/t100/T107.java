package v1.t100;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        mergeTreeNodeIntoList(0,root,res);

        List<List<Integer>> reversRes = new ArrayList<>();

        for (List<Integer> floor : res) {
            reversRes.add(0,floor);
        }
        return reversRes;
    }

    public static void mergeTreeNodeIntoList(int floor, TreeNode head, List<List<Integer>> res) {
        if (head == null) {
            return;
        }

        if (floor + 1 > res.size()) {
            List<Integer> newFloor = new ArrayList<>();
            newFloor.add(head.val);
            res.add(newFloor);
        }else{
            res.get(floor).add(head.val);
        }

        mergeTreeNodeIntoList(floor + 1, head.left, res);
        mergeTreeNodeIntoList(floor + 1, head.right, res);

    }
}
