package v1.t800;

import common.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class T872 {

    Deque<TreeNode> deque1 = new ArrayDeque<>();
    Deque<TreeNode> deque2 = new ArrayDeque<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        deque1.addLast(root1);
        deque2.addLast(root2);
        while (true) {
            TreeNode n1 = getNext(deque1);
            TreeNode n2 = getNext(deque2);
            if (n1 == null && n2 == null) {
                return true;
            }
            if (n1 != null && n2 == null) {
                return false;
            }
            if (n1 == null && n2 != null) {
                return false;
            }
            if (n1.val != n2.val) {
                return false;
            }
        }

    }

    public TreeNode getNext(Deque<TreeNode> deque) {
        if (deque.isEmpty()) {
            return null;
        }
        TreeNode node = deque.pollLast();
        while (node != null) {
            if (node.left != null) {
                if (node.right != null) {
                    deque.addLast(node.right);
                }
                node = node.left;
            } else if (node.right != null) {
                node = node.right;
            } else {
                return node;
            }
        }
        return null;
    }

}
