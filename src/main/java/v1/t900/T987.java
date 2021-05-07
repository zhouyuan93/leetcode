package v1.t900;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class T987 {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<Long> queue = new ArrayList<Long>(1000 );

        traversal(queue, root, 0, 0);

        queue.sort(Comparator.naturalOrder());

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        long col = queue.get(0) / 100000000;
        for (Long val : queue) {
            long valCol = val / 100000000;
            if (col != valCol) {
                res.add(temp);
                temp = new ArrayList<>();
                col = valCol;
            }
            temp.add((int) (val % 10000));
        }
        res.add(temp);

        return res;
    }

    public void traversal(List<Long> queue, TreeNode node, int row, int col) {
        if (node == null) {
            return;
        }
        queue.add((1000+col)*100000000L + row * 10000 + node.val);
        traversal(queue, node.left, row + 1, col - 1);
        traversal(queue, node.right, row + 1, col + 1);
    }

}
