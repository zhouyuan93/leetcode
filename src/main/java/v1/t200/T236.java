package v1.t200;

import common.tree.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yuan.zhou
 */
public class T236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> queue = new LinkedList<>();

        List<Deque<TreeNode>> list = new ArrayList<>(2);

        queue.offer(root);
        search(list, queue, root, p, q);

        Deque<TreeNode> qQueue = list.get(0);
        Deque<TreeNode> pQueue = list.get(1);

        TreeNode res = null;
        if (pQueue.size() > qQueue.size()) {
            Deque<TreeNode> temp = pQueue;
            pQueue = qQueue;
            qQueue = temp;
        }
        for (TreeNode treeNode : pQueue) {
            if (treeNode.val != qQueue.poll().val) {
                break;
            }
            res = treeNode;
        }


        return res;
    }

    public void search(List<Deque<TreeNode>> list, Deque<TreeNode> queue, TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return;
        }

        if (list.size() == 2) {
            return;
        }

        if (q.val == root.val) {
            Deque<TreeNode> qQueue = copyQueue(queue);
            list.add(qQueue);
        }

        if (p.val == root.val) {
            Deque<TreeNode> pQueue = copyQueue(queue);
            list.add(pQueue);
        }


        queue.offer(root.left);
        search(list, queue, root.left, p, q);
        queue.pollLast();

        queue.offer(root.right);
        search(list, queue, root.right, p, q);
        queue.pollLast();

    }

    public Deque<TreeNode> copyQueue(Queue<TreeNode> queue) {
        Deque<TreeNode> res = new LinkedList<>();
        for (TreeNode treeNode : queue) {
            res.offer(treeNode);
        }
        return res;
    }
}
