package v1.t1300;

import common.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class T1305 {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();

        Deque<TreeNode> queue1 = new ArrayDeque<>();
        Deque<TreeNode> queue2 = new ArrayDeque<>();

        if (root1 != null) {
            while (root1 != null) {
                queue1.add(root1);
                root1 = root1.left;
            }
        }

        if (root2 != null) {
            while (root2 != null) {
                queue2.add(root2);
                root2 = root2.left;
            }
        }

        root1 = queue1.pollLast();
        root2 = queue2.pollLast();
        while (root1 != null || root2 != null) {
            if (root2 == null || (root1 != null && root1.val <= root2.val)) {
                res.add(root1.val);
                if (root1.right != null) {
                    root1 = root1.right;
                    while (root1.left != null) {
                        queue1.add(root1);
                        root1 = root1.left;
                    }
                } else {
                    root1 = queue1.pollLast();
                }
            } else {
                res.add(root2.val);
                if (root2.right != null) {
                    root2 = root2.right;
                    while (root2.left != null) {
                        queue2.add(root2);
                        root2 = root2.left;
                    }
                } else {
                    root2 = queue2.pollLast();
                }
            }
        }

        return res;
    }
}
