package v1.t900;

import common.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class T993 {

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root.val == x || root.val == y) {
            return false;
        }

        Deque<TreeNode> nodeDeque = new ArrayDeque<>();
        Deque<Integer> depthDeque = new ArrayDeque<>();

        int depth = 0;
        TreeNode p = root;
        TreeNode father = null;

        Integer depthX = null;
        Integer fatherX = null;
        Integer depthY = null;
        Integer fatherY = null;

        while (depthX == null || depthY == null) {
            if (p == null) {
                father = nodeDeque.pollLast();
                depth = depthDeque.pollLast();
                p = father.right;
                continue;
            }

            if (p.val == x) {
                depthX = depth;
                fatherX = father.val;
            }
            if (p.val == y) {
                depthY = depth;
                fatherY = father.val;
            }

            depth++;
            if (p.right != null) {
                nodeDeque.add(p);
                depthDeque.add(depth);
            }
            father = p;
            p = p.left;

        }

        return depthX.equals(depthY) && !fatherX.equals(fatherY);

    }

}
