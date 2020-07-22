package v1;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuan.zhou
 */
public class T637 {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> res = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();

        detailTreeNode(root, res, countList, 0);

        return res;

    }

    public void detailTreeNode(TreeNode root, List<Double> res, List<Integer> countList, int floor) {

        if (root == null) {
            return;
        }

        if (res.size() <= floor) {
            res.add(Double.valueOf(root.val));
            countList.add(1);
        }else{
            int x = countList.get(floor) + 1;

            Double p = res.get(floor);
            p = p + (root.val - p) / x;

            res.set(floor, p);
            countList.set(floor, x);
        }

        floor++;
        detailTreeNode(root.right, res, countList, floor);
        detailTreeNode(root.left, res, countList, floor);
    }


}
